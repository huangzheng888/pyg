window.onload=function () {
    var app = new Vue({
        el:"#app",
        data:{
            loginName:""
        },
        methods:{
            getLoginInfo(){
                axios.get("../login/info.do").then(res=>{
                    this.loginName=res.data.loginName;
                })
            }
        },
        created(){
            this.getLoginInfo();
        }
    })
}