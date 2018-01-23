package model.liu;

import java.math.BigDecimal;
import java.util.Date;

/**
* <p>
*
* <p>
*
* @author wangjiawen
* @version 1.0.0
* @createTime 2018-01-23 05:16:07
*
*/
public class EmallUserPromoCode {
    /** 用户优惠券码 */
    private String userPromoCode;

    /** 活动主键 */
    private Long activitySeq;

    /** 商户活动活动配置主键 */
    private Long merchantActSeq;

    /** 商户活动优惠配置编号，若优惠类型为0，对应于特定商品优惠编号，若为1，对应于满减优惠编号 */
    private Long discountsSeq;

    /** 折扣金额 */
    private BigDecimal discountAmount;

    /** 优惠券码获取日期 */
    private Date getDate;

    /** 优惠券码失效日期 */
    private Date expiryDate;

    /** 当商户活动配置中的优惠类型为满减类型时：0-折扣满减 1-立减 2-订单满减 3-订单累计满减 */
    private String promoType;

    /**  0-已使用，1-未使用，2-已作废，3-使用中，4-已过期 */
    private String status;

    /** 用户编号 */
    private String userNo;

    /** 用户手机号 */
    private String userMobile;

    /** 用户邮箱 */
    private String userEmail;

    /** 优惠券码使用时间 */
    private Date usedTime;

    /** 用户优惠券码领取时间 */
    private Date createTime;

    /** 记录更新时间 */
    private Date updateTime;

    public String getUserPromoCode() {
        return userPromoCode;
    }

    public void setUserPromoCode(String userPromoCode) {
        this.userPromoCode = userPromoCode == null ? null : userPromoCode.trim();
    }

    public Long getActivitySeq() {
        return activitySeq;
    }

    public void setActivitySeq(Long activitySeq) {
        this.activitySeq = activitySeq;
    }

    public Long getMerchantActSeq() {
        return merchantActSeq;
    }

    public void setMerchantActSeq(Long merchantActSeq) {
        this.merchantActSeq = merchantActSeq;
    }

    public Long getDiscountsSeq() {
        return discountsSeq;
    }

    public void setDiscountsSeq(Long discountsSeq) {
        this.discountsSeq = discountsSeq;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Date getGetDate() {
        return getDate;
    }

    public void setGetDate(Date getDate) {
        this.getDate = getDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPromoType() {
        return promoType;
    }

    public void setPromoType(String promoType) {
        this.promoType = promoType == null ? null : promoType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}