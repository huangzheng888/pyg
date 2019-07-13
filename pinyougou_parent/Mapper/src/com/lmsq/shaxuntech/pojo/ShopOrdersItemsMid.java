package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`shop_orders_items_mid`")
public class ShopOrdersItemsMid implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`order_id`")
    private String orderId;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    @Column(name = "`item_id`")
    private String itemId;

    /**
     * 商品数量
     */
    @Column(name = "`num`")
    private Integer num;

    @Column(name = "`item_name`")
    private String itemName;

    /**
     * 单价
     */
    @Column(name = "`price`")
    private BigDecimal price;

    /**
     * 商品图片地址
     */
    @Column(name = "`main_img`")
    private String mainImg;

    /**
     * 订单收货地址编号
     */
    @Column(name = "`address_id`")
    private Long addressId;

    /**
     * 0已评价，1未评价，2不能评价
     */
    @Column(name = "`commont_status`")
    private Boolean commontStatus;

    /**
     * 用户编号(无需外键)
     */
    @Column(name = "`u_id`")
    private String uId;

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
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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
     * @return item_id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取商品数量
     *
     * @return num - 商品数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置商品数量
     *
     * @param num 商品数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * @return item_name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 获取单价
     *
     * @return price - 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品图片地址
     *
     * @return main_img - 商品图片地址
     */
    public String getMainImg() {
        return mainImg;
    }

    /**
     * 设置商品图片地址
     *
     * @param mainImg 商品图片地址
     */
    public void setMainImg(String mainImg) {
        this.mainImg = mainImg == null ? null : mainImg.trim();
    }

    /**
     * 获取订单收货地址编号
     *
     * @return address_id - 订单收货地址编号
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * 设置订单收货地址编号
     *
     * @param addressId 订单收货地址编号
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取0已评价，1未评价，2不能评价
     *
     * @return commont_status - 0已评价，1未评价，2不能评价
     */
    public Boolean getCommontStatus() {
        return commontStatus;
    }

    /**
     * 设置0已评价，1未评价，2不能评价
     *
     * @param commontStatus 0已评价，1未评价，2不能评价
     */
    public void setCommontStatus(Boolean commontStatus) {
        this.commontStatus = commontStatus;
    }

    /**
     * 获取用户编号(无需外键)
     *
     * @return u_id - 用户编号(无需外键)
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置用户编号(无需外键)
     *
     * @param uId 用户编号(无需外键)
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
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
        sb.append(", orderId=").append(orderId);
        sb.append(", logicId=").append(logicId);
        sb.append(", itemId=").append(itemId);
        sb.append(", num=").append(num);
        sb.append(", itemName=").append(itemName);
        sb.append(", price=").append(price);
        sb.append(", mainImg=").append(mainImg);
        sb.append(", addressId=").append(addressId);
        sb.append(", commontStatus=").append(commontStatus);
        sb.append(", uId=").append(uId);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}