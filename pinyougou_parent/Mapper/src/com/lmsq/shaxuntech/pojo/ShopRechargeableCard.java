package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`shop_rechargeable_card`")
public class ShopRechargeableCard implements Serializable {
    /**
     * 主键
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
     * 卡号
     */
    @Column(name = "`card_num`")
    private String cardNum;

    /**
     * 密码
     */
    @Column(name = "`card_pwd`")
    private String cardPwd;

    /**
     * 面值
     */
    @Column(name = "`money`")
    private Double money;

    /**
     * 状态：0可用，1已用
     */
    @Column(name = "`status`")
    private String status;

    /**
     * 使用该充值卡的用户
     */
    @Column(name = "`u_id`")
    private String uId;

    /**
     * 创建卡的时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 被充值的时间
     */
    @Column(name = "`use_time`")
    private Date useTime;

    /**
     * 激活状态：0未激活，1已激活
     */
    @Column(name = "`activated`")
    private String activated;

    /**
     * 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
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
     * 获取卡号
     *
     * @return card_num - 卡号
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * 设置卡号
     *
     * @param cardNum 卡号
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    /**
     * 获取密码
     *
     * @return card_pwd - 密码
     */
    public String getCardPwd() {
        return cardPwd;
    }

    /**
     * 设置密码
     *
     * @param cardPwd 密码
     */
    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd == null ? null : cardPwd.trim();
    }

    /**
     * 获取面值
     *
     * @return money - 面值
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置面值
     *
     * @param money 面值
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * 获取状态：0可用，1已用
     *
     * @return status - 状态：0可用，1已用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态：0可用，1已用
     *
     * @param status 状态：0可用，1已用
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取使用该充值卡的用户
     *
     * @return u_id - 使用该充值卡的用户
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置使用该充值卡的用户
     *
     * @param uId 使用该充值卡的用户
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取创建卡的时间
     *
     * @return create_time - 创建卡的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建卡的时间
     *
     * @param createTime 创建卡的时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取被充值的时间
     *
     * @return use_time - 被充值的时间
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 设置被充值的时间
     *
     * @param useTime 被充值的时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * 获取激活状态：0未激活，1已激活
     *
     * @return activated - 激活状态：0未激活，1已激活
     */
    public String getActivated() {
        return activated;
    }

    /**
     * 设置激活状态：0未激活，1已激活
     *
     * @param activated 激活状态：0未激活，1已激活
     */
    public void setActivated(String activated) {
        this.activated = activated == null ? null : activated.trim();
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
        sb.append(", cardNum=").append(cardNum);
        sb.append(", cardPwd=").append(cardPwd);
        sb.append(", money=").append(money);
        sb.append(", status=").append(status);
        sb.append(", uId=").append(uId);
        sb.append(", createTime=").append(createTime);
        sb.append(", useTime=").append(useTime);
        sb.append(", activated=").append(activated);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}