package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabalogisticsexpressExpressWTDSolution {

    private Long solutionId;

    /**
     * @return 方案ID
     */
    public Long getSolutionId() {
        return solutionId;
    }

    /**
     * 设置方案ID     *
     * 参数示例：<pre>123456</pre>     
     * 此参数必填
     */
    public void setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
    }

    private String solutionName;

    /**
     * @return 方案名称
     */
    public String getSolutionName() {
        return solutionName;
    }

    /**
     * 设置方案名称     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    private String originZip;

    /**
     * @return 起始地邮编
     */
    public String getOriginZip() {
        return originZip;
    }

    /**
     * 设置起始地邮编     *
     * 参数示例：<pre>315001</pre>     
     * 此参数必填
     */
    public void setOriginZip(String originZip) {
        this.originZip = originZip;
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

    private String carrierCode;

    /**
     * @return 承运商代码，最终负责承运的服务商
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * 设置承运商代码，最终负责承运的服务商     *
     * 参数示例：<pre>FEDEX</pre>     
     * 此参数必填
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    private String providerCode;

    /**
     * @return 服务商代码
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * 设置服务商代码     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    private String serviceName;

    /**
     * @return 服务类型名称
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 设置服务类型名称     *
     * 参数示例：<pre>FedEx IE</pre>     
     * 此参数必填
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    private BigDecimal discount;

    /**
     * @return 折扣：报价/基本价格 * 10，保留一位小数，如3.5
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣：报价/基本价格 * 10，保留一位小数，如3.5     *
     * 参数示例：<pre>3.5</pre>     
     * 此参数必填
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    private String logisticsType;

    /**
     * @return 物流类型，EXPRESS_WTD：快递仓到门
     */
    public String getLogisticsType() {
        return logisticsType;
    }

    /**
     * 设置物流类型，EXPRESS_WTD：快递仓到门     *
     * 参数示例：<pre>EXPRESS_WTD</pre>     
     * 此参数必填
     */
    public void setLogisticsType(String logisticsType) {
        this.logisticsType = logisticsType;
    }

    private String providerName;

    /**
     * @return 服务商名称
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * 设置服务商名称     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    private String cutoffTime;

    /**
     * @return 进仓截至时间
     */
    public String getCutoffTime() {
        return cutoffTime;
    }

    /**
     * 设置进仓截至时间     *
     * 参数示例：<pre>工作日 16:00</pre>     
     * 此参数必填
     */
    public void setCutoffTime(String cutoffTime) {
        this.cutoffTime = cutoffTime;
    }

    private String carrierName;

    /**
     * @return 承运商名称
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * 设置承运商名称     *
     * 参数示例：<pre>FEDEX</pre>     
     * 此参数必填
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    private String serviceCode;

    /**
     * @return 服务类型代码，如FedEx IE、UPS-Expedited
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * 设置服务类型代码，如FedEx IE、UPS-Expedited     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    private AlibabalogisticsexpressWarehouse deliverToWarehouse;

    /**
     * @return 交货的仓库
     */
    public AlibabalogisticsexpressWarehouse getDeliverToWarehouse() {
        return deliverToWarehouse;
    }

    /**
     * 设置交货的仓库     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDeliverToWarehouse(AlibabalogisticsexpressWarehouse deliverToWarehouse) {
        this.deliverToWarehouse = deliverToWarehouse;
    }

    private AlibabalogisticscommonMoney estimatedCost;

    /**
     * @return 预算费用
     */
    public AlibabalogisticscommonMoney getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * 设置预算费用     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setEstimatedCost(AlibabalogisticscommonMoney estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    private Integer transportMinDays;

    /**
     * @return 运输时效最小天数
     */
    public Integer getTransportMinDays() {
        return transportMinDays;
    }

    /**
     * 设置运输时效最小天数     *
     * 参数示例：<pre>3</pre>     
     * 此参数必填
     */
    public void setTransportMinDays(Integer transportMinDays) {
        this.transportMinDays = transportMinDays;
    }

    private Integer transportMaxDays;

    /**
     * @return 运输时效最大天数
     */
    public Integer getTransportMaxDays() {
        return transportMaxDays;
    }

    /**
     * 设置运输时效最大天数     *
     * 参数示例：<pre>6</pre>     
     * 此参数必填
     */
    public void setTransportMaxDays(Integer transportMaxDays) {
        this.transportMaxDays = transportMaxDays;
    }

    private String userAgreementName;

    /**
     * @return 用户协议名称
     */
    public String getUserAgreementName() {
        return userAgreementName;
    }

    /**
     * 设置用户协议名称     *
     * 参数示例：<pre>《XXX用户协议》</pre>     
     * 此参数必填
     */
    public void setUserAgreementName(String userAgreementName) {
        this.userAgreementName = userAgreementName;
    }

    private String userAgreementLink;

    /**
     * @return 用户协议链接
     */
    public String getUserAgreementLink() {
        return userAgreementLink;
    }

    /**
     * 设置用户协议链接     *
     * 参数示例：<pre>http://xxx.xxx.com/xxx.htm</pre>     
     * 此参数必填
     */
    public void setUserAgreementLink(String userAgreementLink) {
        this.userAgreementLink = userAgreementLink;
    }

}
