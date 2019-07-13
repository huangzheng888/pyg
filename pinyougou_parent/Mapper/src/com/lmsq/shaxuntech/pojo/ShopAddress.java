package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`shop_address`")
public class ShopAddress implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 所属用户编号
     */
    @Column(name = "`u_id`")
    private String uId;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    /**
     * 省份名称
     */
    @Column(name = "`province`")
    private String province;

    /**
     * 城市名称
     */
    @Column(name = "`city`")
    private String city;

    /**
     * 区、县名
     */
    @Column(name = "`area`")
    private String area;

    /**
     * 联系电话
     */
    @Column(name = "`phone`")
    private String phone;

    /**
     * 街道及详细地址
     */
    @Column(name = "`street`")
    private String street;

    /**
     * 默认地址(0默认,1非默认)
     */
    @Column(name = "`is_default`")
    private Byte isDefault;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 记录状态码（1为正常状态，0为已删除状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取所属用户编号
     *
     * @return u_id - 所属用户编号
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置所属用户编号
     *
     * @param uId 所属用户编号
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
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
     * 获取省份名称
     *
     * @return province - 省份名称
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份名称
     *
     * @param province 省份名称
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市名称
     *
     * @return city - 城市名称
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市名称
     *
     * @param city 城市名称
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取区、县名
     *
     * @return area - 区、县名
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区、县名
     *
     * @param area 区、县名
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取街道及详细地址
     *
     * @return street - 街道及详细地址
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置街道及详细地址
     *
     * @param street 街道及详细地址
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    /**
     * 获取默认地址(0默认,1非默认)
     *
     * @return is_default - 默认地址(0默认,1非默认)
     */
    public Byte getIsDefault() {
        return isDefault;
    }

    /**
     * 设置默认地址(0默认,1非默认)
     *
     * @param isDefault 默认地址(0默认,1非默认)
     */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
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
     * 获取记录状态码（1为正常状态，0为已删除状态）
     *
     * @return record_status - 记录状态码（1为正常状态，0为已删除状态）
     */
    public Byte getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置记录状态码（1为正常状态，0为已删除状态）
     *
     * @param recordStatus 记录状态码（1为正常状态，0为已删除状态）
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
        sb.append(", uId=").append(uId);
        sb.append(", logicId=").append(logicId);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", phone=").append(phone);
        sb.append(", street=").append(street);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", createTime=").append(createTime);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}