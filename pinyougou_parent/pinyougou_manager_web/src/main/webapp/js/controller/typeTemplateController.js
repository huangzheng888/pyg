//页面初始化完成后再创建Vue对象
window.onload=function () {
	//创建Vue对象
	var app = new Vue({
		//接管id为app的区域
		el:"#app",
		data:{
			//声明数据列表变量，供v-for使用
			list:[],
			//总页数
			pages:1,
			//当前页
			pageNo:1,
			//声明对象
			entity:{
                brandIds:[],
                specIds:[],
                customAttributeItems:[]
			},
			//将要删除的id列表
			ids:[],
			//搜索包装对象
			searchEntity:{},
			//品牌列表
			brandList:[],
            specList:[]
		},
		methods:{
			//查询所有
			findAll:function () {
				axios.get("../typeTemplate/findAll.do").then(function (response) {
					//vue把数据列表包装在data属性中
					app.list = response.data;
				}).catch(function (err) {
					console.log(err);
				});
			},
			//分页查询
			findPage:function (pageNo) {
				axios.post("../typeTemplate/findPage.do?pageNo="+pageNo+"&pageSize="+10,this.searchEntity)
					.then(function (response) {
						app.pages = response.data.pages;  //总页数
						app.list = response.data.rows;  //数据列表
						app.pageNo = pageNo;  //更新当前页
					});
			},
			//让分页插件跳转到指定页
			goPage:function (page) {
				app.$children[0].goPage(page);
			},
			//新增
			add:function () {
				var url = "../typeTemplate/add.do";
				if(this.entity.id != null){
					url = "../typeTemplate/update.do";
				}
				axios.post(url, this.entity).then(function (response) {
					if (response.data.success) {
						//刷新数据，刷新当前页
						app.findPage(app.pageNo);
					} else {
						//失败时显示失败消息
						alert(response.data.message);
					}
				});
			},
			//跟据id查询
			getById:function (id) {
				axios.get("../typeTemplate/getById.do?id="+id).then(function (response) {
					app.entity = response.data;
					//转换品牌列表为json
					app.entity.brandIds=JSON.parse(app.entity.brandIds);
					//转换规格列表为json
					app.entity.specIds=JSON.parse(app.entity.specIds);
					//转换自定义属性为json
					app.entity.customAttributeItems=JSON.parse(app.entity.customAttributeItems);
				})
			},
			//批量删除数据
			dele:function () {
				 if(confirm('确定要删除所选内容吗?'))
                {
                    axios.get("../typeTemplate/delete.do?ids="+this.ids).then(function (response) {
					if(response.data.success){
						//刷新数据
						app.findPage(app.pageNo);
						//清空勾选的ids
						app.ids = [];
					}else{
						alert(response.data.message);
					}
				})
                }else {
                    alert("取消");
                }
			},
            //重置表单
            resetForm(){
                this.entity={
                    brandIds:[],
                    specIds:[],
                    customAttributeItems:[]
				}
            },
			//查询品牌列表
			findBrandList(){
				axios.get("../brand/findAll.do").then(res=>{
					//删除多余字段
                    for (let i = 0; i < res.data.length; i++) {
						delete res.data[i]["firstChar"];
						delete res.data[i]["name"];
                    }
					this.brandList=res.data;
				})
			},
            //查询规格列表
            findSpecList(){
                axios.get("../specification/findAll.do").then(res=>{
                    //删除多余字段
                    for (let i = 0; i < res.data.length; i++) {
                        delete res.data[i]["specName"];
                    }
                    this.specList=res.data;
                })
            },
            //新增表格行
            addTableRow(){
                this.entity.customAttributeItems.push({});
            },
            //删除表格行
            delTableRow(index){
                this.entity.customAttributeItems.splice(index,1);
            },
            /**
			 * 把json数组字符串格式化输出
             * @param jsonString   要转换的字符串
             * @param key    要提取的属性
             * @returns {string}   要提取的结果
             */
			jsonToString(jsonString,key){
				let list = JSON.parse(jsonString);
				let result = "";
                for (let i = 0; i < list.length; i++) {
					if (i != 0) {
						result+=",";
					}
					result+=list[i][key];
                }
                return result;
			}
		},
		//Vue对象初始化后，调用此逻辑
		created:function () {
			//调用用分页查询，初始化时从第1页开始查询
			this.findPage(1);
			//查询品牌
			this.findBrandList();
            //查询规格
            this.findSpecList();
		}
	});
    //注册Vue组件
    Vue.component('v-select', VueSelect.VueSelect);
}
