package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabalogisticsexpressExpressWTDOrderCreateParam {

    private Long solutionId;

    /**
     * @return 方案ID
     */
    public Long getSolutionId() {
        return solutionId;
    }

    /**
     * 设置方案ID     *
     * 参数示例：<pre>12346</pre>     
     * 此参数必填
     */
    public void setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
    }

    private String remark;

    /**
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String destinationCountryCode;

    /**
     * @return 目的国家代码，使用ISO 3166 2A
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * 设置目的国家代码，使用ISO 3166 2A     *
     * 参数示例：<pre>US</pre>     
     * 此参数必填
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    private AlibabalogisticsexpressCustomsDeclarationInfo customsDeclarationInfo;

    /**
     * @return 报关信息
     */
    public AlibabalogisticsexpressCustomsDeclarationInfo getCustomsDeclarationInfo() {
        return customsDeclarationInfo;
    }

    /**
     * 设置报关信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCustomsDeclarationInfo(AlibabalogisticsexpressCustomsDeclarationInfo customsDeclarationInfo) {
        this.customsDeclarationInfo = customsDeclarationInfo;
    }

    private AlibabalogisticsexpressLocalLogistics localLogistics;

    /**
     * @return 本地物流信息
     */
    public AlibabalogisticsexpressLocalLogistics getLocalLogistics() {
        return localLogistics;
    }

    /**
     * 设置本地物流信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setLocalLogistics(AlibabalogisticsexpressLocalLogistics localLogistics) {
        this.localLogistics = localLogistics;
    }

    private AlibabalogisticsexpressContact shipper;

    /**
     * @return 寄件人
     */
    public AlibabalogisticsexpressContact getShipper() {
        return shipper;
    }

    /**
     * 设置寄件人     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setShipper(AlibabalogisticsexpressContact shipper) {
        this.shipper = shipper;
    }

    private AlibabalogisticsexpressCommodity[] commoditys;

    /**
     * @return 商品信息
     */
    public AlibabalogisticsexpressCommodity[] getCommoditys() {
        return commoditys;
    }

    /**
     * 设置商品信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCommoditys(AlibabalogisticsexpressCommodity[] commoditys) {
        this.commoditys = commoditys;
    }

    private AlibabalogisticsexpressContact consignee;

    /**
     * @return 收件人
     */
    public AlibabalogisticsexpressContact getConsignee() {
        return consignee;
    }

    /**
     * 设置收件人     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setConsignee(AlibabalogisticsexpressContact consignee) {
        this.consignee = consignee;
    }

    private AlibabalogisticsexpressGoodsPackage goodsPackage;

    /**
     * @return 货物包裹
     */
    public AlibabalogisticsexpressGoodsPackage getGoodsPackage() {
        return goodsPackage;
    }

    /**
     * 设置货物包裹     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setGoodsPackage(AlibabalogisticsexpressGoodsPackage goodsPackage) {
        this.goodsPackage = goodsPackage;
    }

    private Boolean agreeUserAgreement;

    /**
     * @return 是否同意用户协议，必须同意协议才能创建订单
     */
    public Boolean getAgreeUserAgreement() {
        return agreeUserAgreement;
    }

    /**
     * 设置是否同意用户协议，必须同意协议才能创建订单     *
     * 参数示例：<pre>true</pre>     
     * 此参数必填
     */
    public void setAgreeUserAgreement(Boolean agreeUserAgreement) {
        this.agreeUserAgreement = agreeUserAgreement;
    }

}
