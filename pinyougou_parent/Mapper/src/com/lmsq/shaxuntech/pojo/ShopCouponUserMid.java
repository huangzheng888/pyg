package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`shop_coupon_user_mid`")
public class ShopCouponUserMid implements Serializable {
    /**
     * 主键
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

    @Column(name = "`coupon_id`")
    private String couponId;

    @Column(name = "`u_id`")
    private String uId;

    @Column(name = "`have_num`")
    private Byte haveNum;

    /**
     * 状态记录(1:正常，0失效)
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
     * @return coupon_id
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * @param couponId
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    /**
     * @return u_id
     */
    public String getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * @return have_num
     */
    public Byte getHaveNum() {
        return haveNum;
    }

    /**
     * @param haveNum
     */
    public void setHaveNum(Byte haveNum) {
        this.haveNum = haveNum;
    }

    /**
     * 获取状态记录(1:正常，0失效)
     *
     * @return record_status - 状态记录(1:正常，0失效)
     */
    public Byte getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置状态记录(1:正常，0失效)
     *
     * @param recordStatus 状态记录(1:正常，0失效)
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
        sb.append(", couponId=").append(couponId);
        sb.append(", uId=").append(uId);
        sb.append(", haveNum=").append(haveNum);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}