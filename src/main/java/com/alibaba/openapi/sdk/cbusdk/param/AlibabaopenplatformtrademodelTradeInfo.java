package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaopenplatformtrademodelTradeInfo {

    private AlibabaopenplatformtrademodelOrderBaseInfo baseInfo;

    /**
     * @return 订单基础信息
     */
    public AlibabaopenplatformtrademodelOrderBaseInfo getBaseInfo() {
        return baseInfo;
    }

    /**
     * 设置订单基础信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setBaseInfo(AlibabaopenplatformtrademodelOrderBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    private AlibabaopenplatformtrademodelGuaranteeTermsInfo guaranteesTerms;

    /**
     * @return 保障条款
     */
    public AlibabaopenplatformtrademodelGuaranteeTermsInfo getGuaranteesTerms() {
        return guaranteesTerms;
    }

    /**
     * 设置保障条款     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setGuaranteesTerms(AlibabaopenplatformtrademodelGuaranteeTermsInfo guaranteesTerms) {
        this.guaranteesTerms = guaranteesTerms;
    }

    private AlibabaopenplatformtrademodelInternationalLogisticsInfo internationalLogistics;

    /**
     * @return 国际物流
     */
    public AlibabaopenplatformtrademodelInternationalLogisticsInfo getInternationalLogistics() {
        return internationalLogistics;
    }

    /**
     * 设置国际物流     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setInternationalLogistics(AlibabaopenplatformtrademodelInternationalLogisticsInfo internationalLogistics) {
        this.internationalLogistics = internationalLogistics;
    }

    private AlibabaopenplatformtrademodelNativeLogisticsInfo nativeLogistics;

    /**
     * @return 国内物流
     */
    public AlibabaopenplatformtrademodelNativeLogisticsInfo getNativeLogistics() {
        return nativeLogistics;
    }

    /**
     * 设置国内物流     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setNativeLogistics(AlibabaopenplatformtrademodelNativeLogisticsInfo nativeLogistics) {
        this.nativeLogistics = nativeLogistics;
    }

    private AlibabaopenplatformtrademodelProductItemInfo[] productItems;

    /**
     * @return 商品条目信息
     */
    public AlibabaopenplatformtrademodelProductItemInfo[] getProductItems() {
        return productItems;
    }

    /**
     * 设置商品条目信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setProductItems(AlibabaopenplatformtrademodelProductItemInfo[] productItems) {
        this.productItems = productItems;
    }

    private AlibabaopenplatformtrademodelTradeTermsInfo[] tradeTerms;

    /**
     * @return 交易条款
     */
    public AlibabaopenplatformtrademodelTradeTermsInfo[] getTradeTerms() {
        return tradeTerms;
    }

    /**
     * 设置交易条款     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTradeTerms(AlibabaopenplatformtrademodelTradeTermsInfo[] tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

}
