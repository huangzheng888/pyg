package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`sys_del_log`")
public class SysDelLog implements Serializable {
    /**
     * 编号
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
     * 操作用户编号
     */
    @Column(name = "`u_id`")
    private String uId;

    /**
     * 删除原因
     */
    @Column(name = "`reason`")
    private String reason;

    /**
     * 删除的记录类型
     */
    @Column(name = "`type`")
    private String type;

    /**
     * 删除补充描述
     */
    @Column(name = "`message`")
    private String message;

    /**
     * 删除时间
     */
    @Column(name = "`del_time`")
    private Date delTime;

    /**
     * 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
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
     * 获取操作用户编号
     *
     * @return u_id - 操作用户编号
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置操作用户编号
     *
     * @param uId 操作用户编号
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取删除原因
     *
     * @return reason - 删除原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置删除原因
     *
     * @param reason 删除原因
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取删除的记录类型
     *
     * @return type - 删除的记录类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置删除的记录类型
     *
     * @param type 删除的记录类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取删除补充描述
     *
     * @return message - 删除补充描述
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置删除补充描述
     *
     * @param message 删除补充描述
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * 获取删除时间
     *
     * @return del_time - 删除时间
     */
    public Date getDelTime() {
        return delTime;
    }

    /**
     * 设置删除时间
     *
     * @param delTime 删除时间
     */
    public void setDelTime(Date delTime) {
        this.delTime = delTime;
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
        sb.append(", uId=").append(uId);
        sb.append(", reason=").append(reason);
        sb.append(", type=").append(type);
        sb.append(", message=").append(message);
        sb.append(", delTime=").append(delTime);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}