package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`sys_user_right`")
public class SysUserRight implements Serializable {
    /**
     * 权力编号
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
     * 权力名称
     */
    @Column(name = "`right_name`")
    private String rightName;

    /**
     * 描述
     */
    @Column(name = "`right_message`")
    private String rightMessage;

    /**
     * 该权限访问接口
     */
    @Column(name = "`access_address`")
    private String accessAddress;

    /**
     * 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取权力编号
     *
     * @return id - 权力编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置权力编号
     *
     * @param id 权力编号
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
     * 获取权力名称
     *
     * @return right_name - 权力名称
     */
    public String getRightName() {
        return rightName;
    }

    /**
     * 设置权力名称
     *
     * @param rightName 权力名称
     */
    public void setRightName(String rightName) {
        this.rightName = rightName == null ? null : rightName.trim();
    }

    /**
     * 获取描述
     *
     * @return right_message - 描述
     */
    public String getRightMessage() {
        return rightMessage;
    }

    /**
     * 设置描述
     *
     * @param rightMessage 描述
     */
    public void setRightMessage(String rightMessage) {
        this.rightMessage = rightMessage == null ? null : rightMessage.trim();
    }

    /**
     * 获取该权限访问接口
     *
     * @return access_address - 该权限访问接口
     */
    public String getAccessAddress() {
        return accessAddress;
    }

    /**
     * 设置该权限访问接口
     *
     * @param accessAddress 该权限访问接口
     */
    public void setAccessAddress(String accessAddress) {
        this.accessAddress = accessAddress == null ? null : accessAddress.trim();
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
        sb.append(", rightName=").append(rightName);
        sb.append(", rightMessage=").append(rightMessage);
        sb.append(", accessAddress=").append(accessAddress);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}