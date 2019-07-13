package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`shop_activity_items_mid`")
public class ShopActivityItemsMid implements Serializable {
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
     * 活动编号
     */
    @Column(name = "`act_id`")
    private String actId;

    /**
     * 商品编号
     */
    @Column(name = "`item_id`")
    private String itemId;

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
     * 获取活动编号
     *
     * @return act_id - 活动编号
     */
    public String getActId() {
        return actId;
    }

    /**
     * 设置活动编号
     *
     * @param actId 活动编号
     */
    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
     * 获取商品编号
     *
     * @return item_id - 商品编号
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品编号
     *
     * @param itemId 商品编号
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
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
        sb.append(", actId=").append(actId);
        sb.append(", itemId=").append(itemId);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}