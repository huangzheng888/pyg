package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`shop_coupon`")
public class ShopCoupon implements Serializable {
    /**
     * 优惠券表编号
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    /**
     * 数量
     */
    @Column(name = "`num`")
    private Integer num;

    /**
     * 折扣率
     */
    @Column(name = "`discount`")
    private BigDecimal discount;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 抵用价格
     */
    @Column(name = "`price`")
    private BigDecimal price;

    /**
     * 过期时间
     */
    @Column(name = "`expire_time`")
    private Date expireTime;

    /**
     * 记录状态(1：正常状态，2：失效状态)
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取优惠券表编号
     *
     * @return id - 优惠券表编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置优惠券表编号
     *
     * @param id 优惠券表编号
     */
    public void setId(Integer id) {
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
     * 获取数量
     *
     * @return num - 数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置数量
     *
     * @param num 数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取折扣率
     *
     * @return discount - 折扣率
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣率
     *
     * @param discount 折扣率
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取抵用价格
     *
     * @return price - 抵用价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置抵用价格
     *
     * @param price 抵用价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取过期时间
     *
     * @return expire_time - 过期时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置过期时间
     *
     * @param expireTime 过期时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取记录状态(1：正常状态，2：失效状态)
     *
     * @return record_status - 记录状态(1：正常状态，2：失效状态)
     */
    public Byte getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置记录状态(1：正常状态，2：失效状态)
     *
     * @param recordStatus 记录状态(1：正常状态，2：失效状态)
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
        sb.append(", num=").append(num);
        sb.append(", discount=").append(discount);
        sb.append(", createTime=").append(createTime);
        sb.append(", price=").append(price);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}