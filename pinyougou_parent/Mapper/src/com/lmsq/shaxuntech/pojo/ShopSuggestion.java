package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`shop_suggestion`")
public class ShopSuggestion implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    @Column(name = "`title`")
    private String title;

    /**
     * 评论用户编号
     */
    @Column(name = "`u_id`")
    private String uId;

    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 0 质量相关；1 商城服务相关；2 支付相关；3 物流相关；4 售后相关；5 其他
     */
    @Column(name = "`suggestion_type_id`")
    private String suggestionTypeId;

    /**
     * 联系邮箱
     */
    @Column(name = "`email`")
    private String email;

    /**
     * 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    /**
     * 建议内容
     */
    @Column(name = "`content`")
    private String content;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取评论用户编号
     *
     * @return u_id - 评论用户编号
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置评论用户编号
     *
     * @param uId 评论用户编号
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
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
     * 获取0 质量相关；1 商城服务相关；2 支付相关；3 物流相关；4 售后相关；5 其他
     *
     * @return suggestion_type_id - 0 质量相关；1 商城服务相关；2 支付相关；3 物流相关；4 售后相关；5 其他
     */
    public String getSuggestionTypeId() {
        return suggestionTypeId;
    }

    /**
     * 设置0 质量相关；1 商城服务相关；2 支付相关；3 物流相关；4 售后相关；5 其他
     *
     * @param suggestionTypeId 0 质量相关；1 商城服务相关；2 支付相关；3 物流相关；4 售后相关；5 其他
     */
    public void setSuggestionTypeId(String suggestionTypeId) {
        this.suggestionTypeId = suggestionTypeId == null ? null : suggestionTypeId.trim();
    }

    /**
     * 获取联系邮箱
     *
     * @return email - 联系邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置联系邮箱
     *
     * @param email 联系邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    /**
     * 获取建议内容
     *
     * @return content - 建议内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置建议内容
     *
     * @param content 建议内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logicId=").append(logicId);
        sb.append(", title=").append(title);
        sb.append(", uId=").append(uId);
        sb.append(", createTime=").append(createTime);
        sb.append(", suggestionTypeId=").append(suggestionTypeId);
        sb.append(", email=").append(email);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}