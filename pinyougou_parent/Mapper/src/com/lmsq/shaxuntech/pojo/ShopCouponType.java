package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`shop_coupon_type`")
public class ShopCouponType implements Serializable {
    /**
     * 优惠券类型编号
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Byte id;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    /**
     * 优惠券名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 优惠券类型状态记录(1:正常状态。0失效状态)
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取优惠券类型编号
     *
     * @return id - 优惠券类型编号
     */
    public Byte getId() {
        return id;
    }

    /**
     * 设置优惠券类型编号
     *
     * @param id 优惠券类型编号
     */
    public void setId(Byte id) {
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
     * 获取优惠券名称
     *
     * @return name - 优惠券名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置优惠券名称
     *
     * @param name 优惠券名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取优惠券类型状态记录(1:正常状态。0失效状态)
     *
     * @return record_status - 优惠券类型状态记录(1:正常状态。0失效状态)
     */
    public Byte getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置优惠券类型状态记录(1:正常状态。0失效状态)
     *
     * @param recordStatus 优惠券类型状态记录(1:正常状态。0失效状态)
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
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}