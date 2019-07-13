package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`shop_items`")
public class ShopItems implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    /**
     * 商品名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 品牌
     */
    @Column(name = "`brand`")
    private String brand;

    /**
     * 商品描述
     */
    @Column(name = "`item_msg`")
    private String itemMsg;

    /**
     * 商品亮点
     */
    @Column(name = "`point`")
    private String point;

    /**
     * 初始价格
     */
    @Column(name = "`init_price`")
    private BigDecimal initPrice;

    /**
     * 现价
     */
    @Column(name = "`curr_price`")
    private BigDecimal currPrice;

    /**
     * 销量
     */
    @Column(name = "`volume`")
    private Integer volume;

    /**
     * 库存
     */
    @Column(name = "`num`")
    private Integer num;

    /**
     * 重量
     */
    @Column(name = "`weight`")
    private BigDecimal weight;

    /**
     * 图片的资源编号
     */
    @Column(name = "`resource_id`")
    private String resourceId;

    /**
     * 上架时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 0:是特色商品,1:不是
     */
    @Column(name = "`featured`")
    private Byte featured;

    /**
     * 商品分类 1：折扣票券,2:休闲零食,3:铭酒茶水,4:粮油米面
     */
    @Column(name = "`category_id`")
    private String categoryId;

    /**
     * 快递费用
     */
    @Column(name = "`transport_cost`")
    private Integer transportCost;

    /**
     * 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取uuid
     *
     * @return logic_id - uuid
     */
    public String getLogicId() {
        return logicId;
    }

    /**
     * 设置uuid
     *
     * @param logicId uuid
     */
    public void setLogicId(String logicId) {
        this.logicId = logicId == null ? null : logicId.trim();
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取品牌
     *
     * @return brand - 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌
     *
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * 获取商品描述
     *
     * @return item_msg - 商品描述
     */
    public String getItemMsg() {
        return itemMsg;
    }

    /**
     * 设置商品描述
     *
     * @param itemMsg 商品描述
     */
    public void setItemMsg(String itemMsg) {
        this.itemMsg = itemMsg == null ? null : itemMsg.trim();
    }

    /**
     * 获取商品亮点
     *
     * @return point - 商品亮点
     */
    public String getPoint() {
        return point;
    }

    /**
     * 设置商品亮点
     *
     * @param point 商品亮点
     */
    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    /**
     * 获取初始价格
     *
     * @return init_price - 初始价格
     */
    public BigDecimal getInitPrice() {
        return initPrice;
    }

    /**
     * 设置初始价格
     *
     * @param initPrice 初始价格
     */
    public void setInitPrice(BigDecimal initPrice) {
        this.initPrice = initPrice;
    }

    /**
     * 获取现价
     *
     * @return curr_price - 现价
     */
    public BigDecimal getCurrPrice() {
        return currPrice;
    }

    /**
     * 设置现价
     *
     * @param currPrice 现价
     */
    public void setCurrPrice(BigDecimal currPrice) {
        this.currPrice = currPrice;
    }

    /**
     * 获取销量
     *
     * @return volume - 销量
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * 设置销量
     *
     * @param volume 销量
     */
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    /**
     * 获取库存
     *
     * @return num - 库存
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置库存
     *
     * @param num 库存
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取重量
     *
     * @return weight - 重量
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置重量
     *
     * @param weight 重量
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 获取图片的资源编号
     *
     * @return resource_id - 图片的资源编号
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置图片的资源编号
     *
     * @param resourceId 图片的资源编号
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * 获取上架时间
     *
     * @return create_time - 上架时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置上架时间
     *
     * @param createTime 上架时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取0:是特色商品,1:不是
     *
     * @return featured - 0:是特色商品,1:不是
     */
    public Byte getFeatured() {
        return featured;
    }

    /**
     * 设置0:是特色商品,1:不是
     *
     * @param featured 0:是特色商品,1:不是
     */
    public void setFeatured(Byte featured) {
        this.featured = featured;
    }

    /**
     * 获取商品分类 1：折扣票券,2:休闲零食,3:铭酒茶水,4:粮油米面
     *
     * @return category_id - 商品分类 1：折扣票券,2:休闲零食,3:铭酒茶水,4:粮油米面
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 设置商品分类 1：折扣票券,2:休闲零食,3:铭酒茶水,4:粮油米面
     *
     * @param categoryId 商品分类 1：折扣票券,2:休闲零食,3:铭酒茶水,4:粮油米面
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    /**
     * 获取快递费用
     *
     * @return transport_cost - 快递费用
     */
    public Integer getTransportCost() {
        return transportCost;
    }

    /**
     * 设置快递费用
     *
     * @param transportCost 快递费用
     */
    public void setTransportCost(Integer transportCost) {
        this.transportCost = transportCost;
    }

    /**
     * 获取记录状态码（1为正常状态，0为已删除/失效状态）
     *
     * @return record_status - 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    public Byte getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置记录状态码（1为正常状态，0为已删除/失效状态）
     *
     * @param recordStatus 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    public void setRecordStatus(Byte recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logicId=").append(logicId);
        sb.append(", name=").append(name);
        sb.append(", brand=").append(brand);
        sb.append(", itemMsg=").append(itemMsg);
        sb.append(", point=").append(point);
        sb.append(", initPrice=").append(initPrice);
        sb.append(", currPrice=").append(currPrice);
        sb.append(", volume=").append(volume);
        sb.append(", num=").append(num);
        sb.append(", weight=").append(weight);
        sb.append(", resourceId=").append(resourceId);
        sb.append(", createTime=").append(createTime);
        sb.append(", featured=").append(featured);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", transportCost=").append(transportCost);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}