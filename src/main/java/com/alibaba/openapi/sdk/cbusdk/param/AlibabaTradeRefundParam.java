package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeRefundParam {

    private String refundId;

    /**
     * @return 退款单Id
     */
    public String getRefundId() {
        return refundId;
    }

    /**
     * 设置退款单Id     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    private String memberId;

    /**
     * @return 操作者memberID。如果为系统，则传入system
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设置操作者memberID。如果为系统，则传入system     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    private String refundOperateType;

    /**
     * @return 退款操作类型
     */
    public String getRefundOperateType() {
        return refundOperateType;
    }

    /**
     * 设置退款操作类型     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRefundOperateType(String refundOperateType) {
        this.refundOperateType = refundOperateType;
    }

    private String address;

    /**
     * @return 卖家收货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置卖家收货地址     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAddress(String address) {
        this.address = address;
    }

    private String post;

    /**
     * @return 邮编
     */
    public String getPost() {
        return post;
    }

    /**
     * 设置邮编     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPost(String post) {
        this.post = post;
    }

    private String phone;

    /**
     * @return 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String fullName;

    /**
     * @return 全名
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置全名     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String mobilePhone;

    /**
     * @return 手机
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置手机     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    private String[] vouchers;

    /**
     * @return 凭证(如果货品状态为"已发货"，买家在退款协议中选择了"没有收到货"，系统强制要求卖家上传凭证)
     */
    public String[] getVouchers() {
        return vouchers;
    }

    /**
     * 设置凭证(如果货品状态为"已发货"，买家在退款协议中选择了"没有收到货"，系统强制要求卖家上传凭证)     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setVouchers(String[] vouchers) {
        this.vouchers = vouchers;
    }

    private String discription;

    /**
     * @return 说明
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * 设置说明     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    private String operatorRole;

    /**
     * @return 操作者角色(不可为空)
     */
    public String getOperatorRole() {
        return operatorRole;
    }

    /**
     * 设置操作者角色(不可为空)     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOperatorRole(String operatorRole) {
        this.operatorRole = operatorRole;
    }

    private Integer disputeType;

    /**
     * @return 纠纷类型
     */
    public Integer getDisputeType() {
        return disputeType;
    }

    /**
     * 设置纠纷类型     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDisputeType(Integer disputeType) {
        this.disputeType = disputeType;
    }

}
