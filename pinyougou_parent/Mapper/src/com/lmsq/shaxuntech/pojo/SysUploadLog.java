package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`sys_upload_log`")
public class SysUploadLog implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    @Column(name = "`u_id`")
    private Byte uId;

    /**
     * 上传文件名
     */
    @Column(name = "`file_name`")
    private String fileName;

    /**
     * 文件描述
     */
    @Column(name = "`file_desc`")
    private String fileDesc;

    /**
     * 上传时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 文件大小
     */
    @Column(name = "`file_size`")
    private Integer fileSize;

    /**
     * 大小单位
     */
    @Column(name = "`unit`")
    private String unit;

    /**
     * 操作员
     */
    @Column(name = "`username`")
    private String username;

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
     * @return u_id
     */
    public Byte getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(Byte uId) {
        this.uId = uId;
    }

    /**
     * 获取上传文件名
     *
     * @return file_name - 上传文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置上传文件名
     *
     * @param fileName 上传文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 获取文件描述
     *
     * @return file_desc - 文件描述
     */
    public String getFileDesc() {
        return fileDesc;
    }

    /**
     * 设置文件描述
     *
     * @param fileDesc 文件描述
     */
    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc == null ? null : fileDesc.trim();
    }

    /**
     * 获取上传时间
     *
     * @return create_time - 上传时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置上传时间
     *
     * @param createTime 上传时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取文件大小
     *
     * @return file_size - 文件大小
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * 设置文件大小
     *
     * @param fileSize 文件大小
     */
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * 获取大小单位
     *
     * @return unit - 大小单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置大小单位
     *
     * @param unit 大小单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取操作员
     *
     * @return username - 操作员
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置操作员
     *
     * @param username 操作员
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
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
        sb.append(", fileName=").append(fileName);
        sb.append(", fileDesc=").append(fileDesc);
        sb.append(", createTime=").append(createTime);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", unit=").append(unit);
        sb.append(", username=").append(username);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}