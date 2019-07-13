package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`sys_attachment`")
public class SysAttachment implements Serializable {
    /**
     * 物理id主键
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
     * 文件名称
     */
    @Column(name = "`file_name`")
    private String fileName;

    /**
     * 文件大小
     */
    @Column(name = "`size`")
    private Long size;

    /**
     * 文件后缀
     */
    @Column(name = "`ext`")
    private String ext;

    /**
     * 存储路径
     */
    @Column(name = "`url`")
    private String url;

    /**
     * 文件hash值
     */
    @Column(name = "`hash`")
    private String hash;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "`create_by`")
    private String createBy;

    /**
     * 状态码(1为有效，0为删除)
     */
    @Column(name = "`record_status`")
    private Integer recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取物理id主键
     *
     * @return id - 物理id主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置物理id主键
     *
     * @param id 物理id主键
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
     * 获取文件名称
     *
     * @return file_name - 文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置文件名称
     *
     * @param fileName 文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 获取文件大小
     *
     * @return size - 文件大小
     */
    public Long getSize() {
        return size;
    }

    /**
     * 设置文件大小
     *
     * @param size 文件大小
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * 获取文件后缀
     *
     * @return ext - 文件后缀
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置文件后缀
     *
     * @param ext 文件后缀
     */
    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    /**
     * 获取存储路径
     *
     * @return url - 存储路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置存储路径
     *
     * @param url 存储路径
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取文件hash值
     *
     * @return hash - 文件hash值
     */
    public String getHash() {
        return hash;
    }

    /**
     * 设置文件hash值
     *
     * @param hash 文件hash值
     */
    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
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
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
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
        sb.append(", fileName=").append(fileName);
        sb.append(", size=").append(size);
        sb.append(", ext=").append(ext);
        sb.append(", url=").append(url);
        sb.append(", hash=").append(hash);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}