package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`shop_suggestion_type`")
public class ShopSuggestionType implements Serializable {
    /**
     * 评论类型
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
     * 类型名称
     */
    @Column(name = "`type_name`")
    private String typeName;

    @Column(name = "`message`")
    private String message;

    /**
     * 状态码(1为有效，0为删除)
     */
    @Column(name = "`record_status`")
    private Integer recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取评论类型
     *
     * @return id - 评论类型
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置评论类型
     *
     * @param id 评论类型
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
     * 获取类型名称
     *
     * @return type_name - 类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置类型名称
     *
     * @param typeName 类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * 获取状态码(1为有效，0为删除)
     *
     * @return record_status - 状态码(1为有效，0为删除)
     */
    public Integer getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置状态码(1为有效，0为删除)
     *
     * @param recordStatus 状态码(1为有效，0为删除)
     */
    public void setRecordStatus(Integer recordStatus) {
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
        sb.append(", typeName=").append(typeName);
        sb.append(", message=").append(message);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}