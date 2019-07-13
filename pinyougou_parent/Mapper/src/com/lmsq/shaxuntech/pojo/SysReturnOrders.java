package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`sys_return_orders`")
public class SysReturnOrders implements Serializable {
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
     * 退货地址编号
     */
    @Column(name = "`addr_id`")
    private Long addrId;

    /**
     * 退货原因
     */
    @Column(name = "`reason`")
    private String reason;

    /**
     * 退货人
     */
    @Column(name = "`u_id`")
    private String uId;

    /**
     * 退货商品编号编号
     */
    @Column(name = "`item_id`")
    private Long itemId;

    /**
     * 商品退货数量
     */
    @Column(name = "`item_num`")
    private Integer itemNum;

    /**
     * 订单号
     */
    @Column(name = "`order_id`")
    private Long orderId;

    /**
     * 退货状态：0退货成功，1退货申请，2申请通过，3.收到退货商品
     */
    @Column(name = "`status`")
    private Byte status;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 退货成功时间
     */
    @Column(name = "`end_time`")
    private Date endTime;

    /**
     * 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
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
     * 获取退货地址编号
     *
     * @return addr_id - 退货地址编号
     */
    public Long getAddrId() {
        return addrId;
    }

    /**
     * 设置退货地址编号
     *
     * @param addrId 退货地址编号
     */
    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    /**
     * 获取退货原因
     *
     * @return reason - 退货原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置退货原因
     *
     * @param reason 退货原因
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取退货人
     *
     * @return u_id - 退货人
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置退货人
     *
     * @param uId 退货人
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取退货商品编号编号
     *
     * @return item_id - 退货商品编号编号
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 设置退货商品编号编号
     *
     * @param itemId 退货商品编号编号
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取商品退货数量
     *
     * @return item_num - 商品退货数量
     */
    public Integer getItemNum() {
        return itemNum;
    }

    /**
     * 设置商品退货数量
     *
     * @param itemNum 商品退货数量
     */
    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    /**
     * 获取订单号
     *
     * @return order_id - 订单号
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单号
     *
     * @param orderId 订单号
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取退货状态：0退货成功，1退货申请，2申请通过，3.收到退货商品
     *
     * @return status - 退货状态：0退货成功，1退货申请，2申请通过，3.收到退货商品
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置退货状态：0退货成功，1退货申请，2申请通过，3.收到退货商品
     *
     * @param status 退货状态：0退货成功，1退货申请，2申请通过，3.收到退货商品
     */
    public void setStatus(Byte status) {
        this.status = status;
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
     * 获取退货成功时间
     *
     * @return end_time - 退货成功时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置退货成功时间
     *
     * @param endTime 退货成功时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
        sb.append(", addrId=").append(addrId);
        sb.append(", reason=").append(reason);
        sb.append(", uId=").append(uId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemNum=").append(itemNum);
        sb.append(", orderId=").append(orderId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}