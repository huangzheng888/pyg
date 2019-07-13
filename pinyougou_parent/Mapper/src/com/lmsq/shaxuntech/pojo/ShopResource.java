package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`shop_resource`")
public class ShopResource implements Serializable {
    /**
     * 物理逻辑主键
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
     * 素材名称
     */
    @Column(name = "`resource_name`")
    private String resourceName;

    /**
     * 素材类型（0为图片，1为视频）
     */
    @Column(name = "`resource_type`")
    private Integer resourceType;

    /**
     * 0待审核  1已审核
     */
    @Column(name = "`review_status`")
    private Integer reviewStatus;

    /**
     * 播放时长(单位为s）
     */
    @Column(name = "`play_time`")
    private Integer playTime;

    /**
     * 附件ID
     */
    @Column(name = "`attachment_id`")
    private String attachmentId;

    /**
     * 创建人id
     */
    @Column(name = "`create_by`")
    private String createBy;

    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 状态更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 资源记录状态（0为失效状态，1为有效状态）
     */
    @Column(name = "`record_status`")
    private Integer recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取物理逻辑主键
     *
     * @return id - 物理逻辑主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置物理逻辑主键
     *
     * @param id 物理逻辑主键
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
     * 获取素材名称
     *
     * @return resource_name - 素材名称
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置素材名称
     *
     * @param resourceName 素材名称
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * 获取素材类型（0为图片，1为视频）
     *
     * @return resource_type - 素材类型（0为图片，1为视频）
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * 设置素材类型（0为图片，1为视频）
     *
     * @param resourceType 素材类型（0为图片，1为视频）
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 获取0待审核  1已审核
     *
     * @return review_status - 0待审核  1已审核
     */
    public Integer getReviewStatus() {
        return reviewStatus;
    }

    /**
     * 设置0待审核  1已审核
     *
     * @param reviewStatus 0待审核  1已审核
     */
    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    /**
     * 获取播放时长(单位为s）
     *
     * @return play_time - 播放时长(单位为s）
     */
    public Integer getPlayTime() {
        return playTime;
    }

    /**
     * 设置播放时长(单位为s）
     *
     * @param playTime 播放时长(单位为s）
     */
    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    /**
     * 获取附件ID
     *
     * @return attachment_id - 附件ID
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * 设置附件ID
     *
     * @param attachmentId 附件ID
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId == null ? null : attachmentId.trim();
    }

    /**
     * 获取创建人id
     *
     * @return create_by - 创建人id
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人id
     *
     * @param createBy 创建人id
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
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
     * 获取状态更新时间
     *
     * @return update_time - 状态更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置状态更新时间
     *
     * @param updateTime 状态更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取资源记录状态（0为失效状态，1为有效状态）
     *
     * @return record_status - 资源记录状态（0为失效状态，1为有效状态）
     */
    public Integer getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置资源记录状态（0为失效状态，1为有效状态）
     *
     * @param recordStatus 资源记录状态（0为失效状态，1为有效状态）
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
        sb.append(", resourceName=").append(resourceName);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", reviewStatus=").append(reviewStatus);
        sb.append(", playTime=").append(playTime);
        sb.append(", attachmentId=").append(attachmentId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}