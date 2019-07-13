package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`shop_activity`")
public class ShopActivity implements Serializable {
    /**
     * 注解
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
     * 活动原因
     */
    @Column(name = "`reason`")
    private String reason;

    /**
     * 开始时间
     */
    @Column(name = "`begin_time`")
    private Date beginTime;

    /**
     * 结束时间
     */
    @Column(name = "`end_time`")
    private Date endTime;

    /**
     * 活动描述
     */
    @Column(name = "`message`")
    private String message;

    /**
     * 活动名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 活动状态记录(1:活动状态正常、0：活动已结束)
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取注解
     *
     * @return id - 注解
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置注解
     *
     * @param id 注解
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
     * 获取活动原因
     *
     * @return reason - 活动原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置活动原因
     *
     * @param reason 活动原因
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取开始时间
     *
     * @return begin_time - 开始时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置开始时间
     *
     * @param beginTime 开始时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取活动描述
     *
     * @return message - 活动描述
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置活动描述
     *
     * @param message 活动描述
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * 获取活动名称
     *
     * @return name - 活动名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置活动名称
     *
     * @param name 活动名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取活动状态记录(1:活动状态正常、0：活动已结束)
     *
     * @return record_status - 活动状态记录(1:活动状态正常、0：活动已结束)
     */
    public Byte getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置活动状态记录(1:活动状态正常、0：活动已结束)
     *
     * @param recordStatus 活动状态记录(1:活动状态正常、0：活动已结束)
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
        sb.append(", reason=").append(reason);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", message=").append(message);
        sb.append(", name=").append(name);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}