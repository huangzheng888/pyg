package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`sys_user`")
public class SysUser implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    @Column(name = "`username`")
    private String username;

    @Column(name = "`password`")
    private String password;

    @Column(name = "`phone`")
    private String phone;

    @Column(name = "`email`")
    private String email;

    @Column(name = "`create_time`")
    private Date createTime;

    @Column(name = "`update_time`")
    private Date updateTime;

    @Column(name = "`balance`")
    private BigDecimal balance;

    @Column(name = "`score`")
    private Long score;

    /**
     * 最后一次登录的ip地址
     */
    @Column(name = "`last_ip`")
    private String lastIp;

    /**
     * 最后一次登录的ip对应的区域信息，运营商
     */
    @Column(name = "`ip_region`")
    private String ipRegion;

    /**
     * 角色编号
     */
    @Column(name = "`role_id`")
    private String roleId;

    /**
     * 登录失败次数
     */
    @Column(name = "`failure_num`")
    private Integer failureNum;

    /**
     * 最后一次登录时间
     */
    @Column(name = "`last_login_time`")
    private Date lastLoginTime;

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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * @param balance
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return score
     */
    public Long getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * 获取最后一次登录的ip地址
     *
     * @return last_ip - 最后一次登录的ip地址
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * 设置最后一次登录的ip地址
     *
     * @param lastIp 最后一次登录的ip地址
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    /**
     * 获取最后一次登录的ip对应的区域信息，运营商
     *
     * @return ip_region - 最后一次登录的ip对应的区域信息，运营商
     */
    public String getIpRegion() {
        return ipRegion;
    }

    /**
     * 设置最后一次登录的ip对应的区域信息，运营商
     *
     * @param ipRegion 最后一次登录的ip对应的区域信息，运营商
     */
    public void setIpRegion(String ipRegion) {
        this.ipRegion = ipRegion == null ? null : ipRegion.trim();
    }

    /**
     * 获取角色编号
     *
     * @return role_id - 角色编号
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色编号
     *
     * @param roleId 角色编号
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 获取登录失败次数
     *
     * @return failure_num - 登录失败次数
     */
    public Integer getFailureNum() {
        return failureNum;
    }

    /**
     * 设置登录失败次数
     *
     * @param failureNum 登录失败次数
     */
    public void setFailureNum(Integer failureNum) {
        this.failureNum = failureNum;
    }

    /**
     * 获取最后一次登录时间
     *
     * @return last_login_time - 最后一次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后一次登录时间
     *
     * @param lastLoginTime 最后一次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", balance=").append(balance);
        sb.append(", score=").append(score);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", ipRegion=").append(ipRegion);
        sb.append(", roleId=").append(roleId);
        sb.append(", failureNum=").append(failureNum);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}