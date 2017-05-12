package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaopenplatformtradeBizSimpleOrderModel {

    private String buyerAlipayId;

    /**
     * @return 买家支付宝id
     */
    public String getBuyerAlipayId() {
        return buyerAlipayId;
    }

    /**
     * 设置买家支付宝id     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setBuyerAlipayId(String buyerAlipayId) {
        this.buyerAlipayId = buyerAlipayId;
    }

    private String buyerLoginId;

    /**
     * @return 买家中文站会员登录ID
     */
    public String getBuyerLoginId() {
        return buyerLoginId;
    }

    /**
     * 设置买家中文站会员登录ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setBuyerLoginId(String buyerLoginId) {
        this.buyerLoginId = buyerLoginId;
    }

    private String buyerMemberId;

    /**
     * @return 买家中文站会员ID
     */
    public String getBuyerMemberId() {
        return buyerMemberId;
    }

    /**
     * 设置买家中文站会员ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setBuyerMemberId(String buyerMemberId) {
        this.buyerMemberId = buyerMemberId;
    }

    private Long buyerUserId;

    /**
     * @return 买家阿里帐号ID(包括淘宝帐号Id)
     */
    public Long getBuyerUserId() {
        return buyerUserId;
    }

    /**
     * 设置买家阿里帐号ID(包括淘宝帐号Id)     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setBuyerUserId(Long buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    private Long id;

    /**
     * @return 订单主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置订单主键ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setId(Long id) {
        this.id = id;
    }

    private String outOrderId;

    /**
     * @return 
     */
    public String getOutOrderId() {
        return outOrderId;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    private String sellerAlipayId;

    /**
     * @return 卖家支付宝id
     */
    public String getSellerAlipayId() {
        return sellerAlipayId;
    }

    /**
     * 设置卖家支付宝id     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSellerAlipayId(String sellerAlipayId) {
        this.sellerAlipayId = sellerAlipayId;
    }

    private String sellerLoginId;

    /**
     * @return 卖家中文站会员登录ID
     */
    public String getSellerLoginId() {
        return sellerLoginId;
    }

    /**
     * 设置卖家中文站会员登录ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSellerLoginId(String sellerLoginId) {
        this.sellerLoginId = sellerLoginId;
    }

    private String sellerMemberId;

    /**
     * @return 卖家中文站会员ID
     */
    public String getSellerMemberId() {
        return sellerMemberId;
    }

    /**
     * 设置卖家中文站会员ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSellerMemberId(String sellerMemberId) {
        this.sellerMemberId = sellerMemberId;
    }

    private Long sellerUserId;

    /**
     * @return 卖家阿里帐号ID(包括淘宝帐号Id)
     */
    public Long getSellerUserId() {
        return sellerUserId;
    }

    /**
     * 设置卖家阿里帐号ID(包括淘宝帐号Id)     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSellerUserId(Long sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    private Long subBuyerUserId;

    /**
     * @return 买家子帐号ID
     */
    public Long getSubBuyerUserId() {
        return subBuyerUserId;
    }

    /**
     * 设置买家子帐号ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSubBuyerUserId(Long subBuyerUserId) {
        this.subBuyerUserId = subBuyerUserId;
    }

    private Long succSumPayment;

    /**
     * @return 应付款金额
     */
    public Long getSuccSumPayment() {
        return succSumPayment;
    }

    /**
     * 设置应付款金额     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSuccSumPayment(Long succSumPayment) {
        this.succSumPayment = succSumPayment;
    }

    private Long tbId;

    /**
     * @return 淘宝订单主键ID
     */
    public Long getTbId() {
        return tbId;
    }

    /**
     * 设置淘宝订单主键ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTbId(Long tbId) {
        this.tbId = tbId;
    }

    private String tradeTypeStr;

    /**
     * @return 交易类型
     */
    public String getTradeTypeStr() {
        return tradeTypeStr;
    }

    /**
     * 设置交易类型     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTradeTypeStr(String tradeTypeStr) {
        this.tradeTypeStr = tradeTypeStr;
    }

    private AlibabaopenplatformtradeBizSimpleOrderEntryModel[] orderEntryModel;

    /**
     * @return 子订单明细,简易的子订单模型
     */
    public AlibabaopenplatformtradeBizSimpleOrderEntryModel[] getOrderEntryModel() {
        return orderEntryModel;
    }

    /**
     * 设置子订单明细,简易的子订单模型     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOrderEntryModel(AlibabaopenplatformtradeBizSimpleOrderEntryModel[] orderEntryModel) {
        this.orderEntryModel = orderEntryModel;
    }

}
