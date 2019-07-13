package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`sys_pay_type`")
public class SysPayType implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Byte id;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    @Column(name = "`pay_type_name`")
    private String payTypeName;

    /**
     * 被使用次数
     */
    @Column(name = "`times`")
    private Integer times;

    /**
     * 该支付方式资金总账
     */
    @Column(name = "`total_price`")
    private BigDecimal totalPrice;

    @Column(name = "`access_address`")
    private String accessAddress;

    /**
     * 回调接口
     */
    @Column(name = "`callback`")
    private String callback;

    /**
     * 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Byte getId() {
        return id;
    }

    /**
     * @param id
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
     * @return pay_type_name
     */
    public String getPayTypeName() {
        return payTypeName;
    }

    /**
     * @param payTypeName
     */
    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName == null ? null : payTypeName.trim();
    }

    /**
     * 获取被使用次数
     *
     * @return times - 被使用次数
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * 设置被使用次数
     *
     * @param times 被使用次数
     */
    public void setTimes(Integer times) {
        this.times = times;
    }

    /**
     * 获取该支付方式资金总账
     *
     * @return total_price - 该支付方式资金总账
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置该支付方式资金总账
     *
     * @param totalPrice 该支付方式资金总账
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return access_address
     */
    public String getAccessAddress() {
        return accessAddress;
    }

    /**
     * @param accessAddress
     */
    public void setAccessAddress(String accessAddress) {
        this.accessAddress = accessAddress == null ? null : accessAddress.trim();
    }

    /**
     * 获取回调接口
     *
     * @return callback - 回调接口
     */
    public String getCallback() {
        return callback;
    }

    /**
     * 设置回调接口
     *
     * @param callback 回调接口
     */
    public void setCallback(String callback) {
        this.callback = callback == null ? null : callback.trim();
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
        sb.append(", payTypeName=").append(payTypeName);
        sb.append(", times=").append(times);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", accessAddress=").append(accessAddress);
        sb.append(", callback=").append(callback);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}