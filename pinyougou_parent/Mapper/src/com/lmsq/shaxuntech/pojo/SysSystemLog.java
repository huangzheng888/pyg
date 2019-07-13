package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`sys_system_log`")
public class SysSystemLog implements Serializable {
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
     * 模块名称
     */
    @Column(name = "`module_name`")
    private String moduleName;

    /**
     * 操作名称
     */
    @Column(name = "`operation`")
    private String operation;

    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 操作的管理员编号
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
     * 获取模块名称
     *
     * @return module_name - 模块名称
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 设置模块名称
     *
     * @param moduleName 模块名称
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    /**
     * 获取操作名称
     *
     * @return operation - 操作名称
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 设置操作名称
     *
     * @param operation 操作名称
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
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
     * 获取操作的管理员编号
     *
     * @return u_id - 操作的管理员编号
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置操作的管理员编号
     *
     * @param uId 操作的管理员编号
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
        sb.append(", logicId=").append(logicId);
        sb.append(", moduleName=").append(moduleName);
        sb.append(", operation=").append(operation);
        sb.append(", createTime=").append(createTime);
        sb.append(", uId=").append(uId);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}