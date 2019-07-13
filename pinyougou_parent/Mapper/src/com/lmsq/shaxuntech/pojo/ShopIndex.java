package com.lmsq.shaxuntech.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`shop_index`")
public class ShopIndex implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * uuid
     */
    @Column(name = "`logic_id`")
    private String logicId;

    @Column(name = "`top_banner`")
    private String topBanner;

    @Column(name = "`footer_banner`")
    private String footerBanner;

    /**
     * 二维码地址
     */
    @Column(name = "`QR_code`")
    private String qrCode;

    /**
     * 版本信息
     */
    @Column(name = "`version`")
    private String version;

    /**
     * 导航栏小图标1地址
     */
    @Column(name = "`nav_01`")
    private String nav01;

    /**
     * 导航栏小图标2地址
     */
    @Column(name = "`nav_02`")
    private String nav02;

    /**
     * 导航栏小图标3地址
     */
    @Column(name = "`nav_03`")
    private String nav03;

    /**
     * 导航栏小图标4地址
     */
    @Column(name = "`nav_04`")
    private String nav04;

    /**
     * 商城首页左边图片
     */
    @Column(name = "`left_session`")
    private String leftSession;

    /**
     * 右侧图片
     */
    @Column(name = "`right_session01`")
    private String rightSession01;

    @Column(name = "`right_session02`")
    private String rightSession02;

    /**
     * 记录状态码（1为正常状态，0为已删除/失效状态）
     */
    @Column(name = "`record_status`")
    private Byte recordStatus;

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
     * @return top_banner
     */
    public String getTopBanner() {
        return topBanner;
    }

    /**
     * @param topBanner
     */
    public void setTopBanner(String topBanner) {
        this.topBanner = topBanner == null ? null : topBanner.trim();
    }

    /**
     * @return footer_banner
     */
    public String getFooterBanner() {
        return footerBanner;
    }

    /**
     * @param footerBanner
     */
    public void setFooterBanner(String footerBanner) {
        this.footerBanner = footerBanner == null ? null : footerBanner.trim();
    }

    /**
     * 获取二维码地址
     *
     * @return QR_code - 二维码地址
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * 设置二维码地址
     *
     * @param qrCode 二维码地址
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    /**
     * 获取版本信息
     *
     * @return version - 版本信息
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本信息
     *
     * @param version 版本信息
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 获取导航栏小图标1地址
     *
     * @return nav_01 - 导航栏小图标1地址
     */
    public String getNav01() {
        return nav01;
    }

    /**
     * 设置导航栏小图标1地址
     *
     * @param nav01 导航栏小图标1地址
     */
    public void setNav01(String nav01) {
        this.nav01 = nav01 == null ? null : nav01.trim();
    }

    /**
     * 获取导航栏小图标2地址
     *
     * @return nav_02 - 导航栏小图标2地址
     */
    public String getNav02() {
        return nav02;
    }

    /**
     * 设置导航栏小图标2地址
     *
     * @param nav02 导航栏小图标2地址
     */
    public void setNav02(String nav02) {
        this.nav02 = nav02 == null ? null : nav02.trim();
    }

    /**
     * 获取导航栏小图标3地址
     *
     * @return nav_03 - 导航栏小图标3地址
     */
    public String getNav03() {
        return nav03;
    }

    /**
     * 设置导航栏小图标3地址
     *
     * @param nav03 导航栏小图标3地址
     */
    public void setNav03(String nav03) {
        this.nav03 = nav03 == null ? null : nav03.trim();
    }

    /**
     * 获取导航栏小图标4地址
     *
     * @return nav_04 - 导航栏小图标4地址
     */
    public String getNav04() {
        return nav04;
    }

    /**
     * 设置导航栏小图标4地址
     *
     * @param nav04 导航栏小图标4地址
     */
    public void setNav04(String nav04) {
        this.nav04 = nav04 == null ? null : nav04.trim();
    }

    /**
     * 获取商城首页左边图片
     *
     * @return left_session - 商城首页左边图片
     */
    public String getLeftSession() {
        return leftSession;
    }

    /**
     * 设置商城首页左边图片
     *
     * @param leftSession 商城首页左边图片
     */
    public void setLeftSession(String leftSession) {
        this.leftSession = leftSession == null ? null : leftSession.trim();
    }

    /**
     * 获取右侧图片
     *
     * @return right_session01 - 右侧图片
     */
    public String getRightSession01() {
        return rightSession01;
    }

    /**
     * 设置右侧图片
     *
     * @param rightSession01 右侧图片
     */
    public void setRightSession01(String rightSession01) {
        this.rightSession01 = rightSession01 == null ? null : rightSession01.trim();
    }

    /**
     * @return right_session02
     */
    public String getRightSession02() {
        return rightSession02;
    }

    /**
     * @param rightSession02
     */
    public void setRightSession02(String rightSession02) {
        this.rightSession02 = rightSession02 == null ? null : rightSession02.trim();
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
        sb.append(", topBanner=").append(topBanner);
        sb.append(", footerBanner=").append(footerBanner);
        sb.append(", qrCode=").append(qrCode);
        sb.append(", version=").append(version);
        sb.append(", nav01=").append(nav01);
        sb.append(", nav02=").append(nav02);
        sb.append(", nav03=").append(nav03);
        sb.append(", nav04=").append(nav04);
        sb.append(", leftSession=").append(leftSession);
        sb.append(", rightSession01=").append(rightSession01);
        sb.append(", rightSession02=").append(rightSession02);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}