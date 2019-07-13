package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`shop_orders`")
public class ShopOrders implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    @Column(name = "`payment`")
    private BigDecimal payment;

    @Column(name = "`unit`")
    private String unit;

    /**
     * 订单状态:0交易成功，1待付款，2待发货，3,待收货,4已退货
     */
    @Column(name = "`status`")
    private Byte status;

    @Column(name = "`create_time`")
    private Date createTime;

    @Column(name = "`pay_time`")
    private Date payTime;

    /**
     * 发货时间
     */
    @Column(name = "`consign_time`")
    private Date consignTime;

    /**
     * 用户确认收货时间
     */
    @Column(name = "`end_time`")
    private Date endTime;

    @Column(name = "`pay_type_id`")
    private String payTypeId;

    /**
     * 支付单号
     */
    @Column(name = "`paymentNo`")
    private Long paymentno;

    @Column(name = "`u_id`")
    private String uId;

    @Column(name = "`username`")
    private String username;

    @Column(name = "`phone`")
    private String phone;

    /**
     * 发票类型，类别，抬头 
     */
    @Column(name = "`invoiceInfo`")
    private String invoiceinfo;

    /**
     * 支付方式
     */
    @Column(name = "`pay_type_name`")
    private String payTypeName;

    /**
     * 地址编号
     */
    @Column(name = "`addr_id`")
    private Long addrId;

    /**
     * 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
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
     * @return payment
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * @param payment
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取订单状态:0交易成功，1待付款，2待发货，3,待收货,4已退货
     *
     * @return status - 订单状态:0交易成功，1待付款，2待发货，3,待收货,4已退货
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置订单状态:0交易成功，1待付款，2待发货，3,待收货,4已退货
     *
     * @param status 订单状态:0交易成功，1待付款，2待发货，3,待收货,4已退货
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return pay_time
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * @param payTime
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取发货时间
     *
     * @return consign_time - 发货时间
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * 设置发货时间
     *
     * @param consignTime 发货时间
     */
    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * 获取用户确认收货时间
     *
     * @return end_time - 用户确认收货时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置用户确认收货时间
     *
     * @param endTime 用户确认收货时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return pay_type_id
     */
    public String getPayTypeId() {
        return payTypeId;
    }

    /**
     * @param payTypeId
     */
    public void setPayTypeId(String payTypeId) {
        this.payTypeId = payTypeId == null ? null : payTypeId.trim();
    }

    /**
     * 获取支付单号
     *
     * @return paymentNo - 支付单号
     */
    public Long getPaymentno() {
        return paymentno;
    }

    /**
     * 设置支付单号
     *
     * @param paymentno 支付单号
     */
    public void setPaymentno(Long paymentno) {
        this.paymentno = paymentno;
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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取发票类型，类别，抬头 
     *
     * @return invoiceInfo - 发票类型，类别，抬头 
     */
    public String getInvoiceinfo() {
        return invoiceinfo;
    }

    /**
     * 设置发票类型，类别，抬头 
     *
     * @param invoiceinfo 发票类型，类别，抬头 
     */
    public void setInvoiceinfo(String invoiceinfo) {
        this.invoiceinfo = invoiceinfo == null ? null : invoiceinfo.trim();
    }

    /**
     * 获取支付方式
     *
     * @return pay_type_name - 支付方式
     */
    public String getPayTypeName() {
        return payTypeName;
    }

    /**
     * 设置支付方式
     *
     * @param payTypeName 支付方式
     */
    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName == null ? null : payTypeName.trim();
    }

    /**
     * 获取地址编号
     *
     * @return addr_id - 地址编号
     */
    public Long getAddrId() {
        return addrId;
    }

    /**
     * 设置地址编号
     *
     * @param addrId 地址编号
     */
    public void setAddrId(Long addrId) {
        this.addrId = addrId;
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
        sb.append(", payment=").append(payment);
        sb.append(", unit=").append(unit);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", consignTime=").append(consignTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", payTypeId=").append(payTypeId);
        sb.append(", paymentno=").append(paymentno);
        sb.append(", uId=").append(uId);
        sb.append(", username=").append(username);
        sb.append(", phone=").append(phone);
        sb.append(", invoiceinfo=").append(invoiceinfo);
        sb.append(", payTypeName=").append(payTypeName);
        sb.append(", addrId=").append(addrId);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}