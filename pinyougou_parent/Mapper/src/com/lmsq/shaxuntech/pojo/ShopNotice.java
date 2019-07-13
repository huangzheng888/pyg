package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`shop_notice`")
public class ShopNotice implements Serializable {
    /**
     * 公告编号
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
     * 公告图片资源编号
     */
    @Column(name = "`resource_id`")
    private String resourceId;

    /**
     * 公告标题
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 公告内容
     */
    @Column(name = "`content`")
    private String content;

    /**
     * 开始时间
     */
    @Column(name = "`begin_time`")
    private Date beginTime;

    /**
     * 公告修改时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 结束时间
     */
    @Column(name = "`end_time`")
    private Date endTime;

    /**
     * 发布人的编号
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
     * 获取公告编号
     *
     * @return id - 公告编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置公告编号
     *
     * @param id 公告编号
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
     * 获取公告图片资源编号
     *
     * @return resource_id - 公告图片资源编号
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置公告图片资源编号
     *
     * @param resourceId 公告图片资源编号
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * 获取公告标题
     *
     * @return name - 公告标题
     */
    public String getName() {
        return name;
    }

    /**
     * 设置公告标题
     *
     * @param name 公告标题
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取公告内容
     *
     * @return content - 公告内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置公告内容
     *
     * @param content 公告内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
     * 获取公告修改时间
     *
     * @return update_time - 公告修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置公告修改时间
     *
     * @param updateTime 公告修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
     * 获取发布人的编号
     *
     * @return u_id - 发布人的编号
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置发布人的编号
     *
     * @param uId 发布人的编号
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
        sb.append(", resourceId=").append(resourceId);
        sb.append(", name=").append(name);
        sb.append(", content=").append(content);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", uId=").append(uId);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}