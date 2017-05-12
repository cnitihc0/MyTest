package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaproductProductSaleInfo {

    private Boolean supportOnlineTrade;

    /**
     * @return 是否支持网上交易。true：支持 false：不支持，国际站不需关注此字段
     */
    public Boolean getSupportOnlineTrade() {
        return supportOnlineTrade;
    }

    /**
     * 设置是否支持网上交易。true：支持 false：不支持，国际站不需关注此字段     *
     * 参数示例：<pre>TRUE</pre>     
     * 此参数必填
     */
    public void setSupportOnlineTrade(Boolean supportOnlineTrade) {
        this.supportOnlineTrade = supportOnlineTrade;
    }

    private Boolean mixWholeSale;

    /**
     * @return 是否支持混批，国际站无需关注此字段
     */
    public Boolean getMixWholeSale() {
        return mixWholeSale;
    }

    /**
     * 设置是否支持混批，国际站无需关注此字段     *
     * 参数示例：<pre>TRUE</pre>     
     * 此参数必填
     */
    public void setMixWholeSale(Boolean mixWholeSale) {
        this.mixWholeSale = mixWholeSale;
    }

    private String saleType;

    /**
     * @return 销售方式，按件卖(normal)或者按批卖(batch)，1688站点无需关注此字段
     */
    public String getSaleType() {
        return saleType;
    }

    /**
     * 设置销售方式，按件卖(normal)或者按批卖(batch)，1688站点无需关注此字段     *
     * 参数示例：<pre>normal</pre>     
     * 此参数必填
     */
    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    private Boolean priceAuth;

    /**
     * @return 是否价格私密信息，国际站无需关注此字段
     */
    public Boolean getPriceAuth() {
        return priceAuth;
    }

    /**
     * 设置是否价格私密信息，国际站无需关注此字段     *
     * 参数示例：<pre>TRUE</pre>     
     * 此参数必填
     */
    public void setPriceAuth(Boolean priceAuth) {
        this.priceAuth = priceAuth;
    }

    private AlibabaproductProductPriceRange[] priceRanges;

    /**
     * @return 区间价格。按数量范围设定的区间价格
     */
    public AlibabaproductProductPriceRange[] getPriceRanges() {
        return priceRanges;
    }

    /**
     * 设置区间价格。按数量范围设定的区间价格     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPriceRanges(AlibabaproductProductPriceRange[] priceRanges) {
        this.priceRanges = priceRanges;
    }

    private Double amountOnSale;

    /**
     * @return 可售数量，国际站无需关注此字段
     */
    public Double getAmountOnSale() {
        return amountOnSale;
    }

    /**
     * 设置可售数量，国际站无需关注此字段     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAmountOnSale(Double amountOnSale) {
        this.amountOnSale = amountOnSale;
    }

    private String unit;

    /**
     * @return 计量单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置计量单位     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    private Integer minOrderQuantity;

    /**
     * @return 最小起订量，范围是1-99999。1688无需处理此字段
     */
    public Integer getMinOrderQuantity() {
        return minOrderQuantity;
    }

    /**
     * 设置最小起订量，范围是1-99999。1688无需处理此字段     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMinOrderQuantity(Integer minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    private Integer batchNumber;

    /**
     * @return 每批数量，默认为空或者非零值
     */
    public Integer getBatchNumber() {
        return batchNumber;
    }

    /**
     * 设置每批数量，默认为空或者非零值     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    private Double retailprice;

    /**
     * @return 建议零售价，国际站无需关注
     */
    public Double getRetailprice() {
        return retailprice;
    }

    /**
     * 设置建议零售价，国际站无需关注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRetailprice(Double retailprice) {
        this.retailprice = retailprice;
    }

    private String tax;

    /**
     * @return 税率相关信息，内容由用户自定，国际站无需关注
     */
    public String getTax() {
        return tax;
    }

    /**
     * 设置税率相关信息，内容由用户自定，国际站无需关注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    private String sellunit;

    /**
     * @return 售卖单位，如果为批量售卖，代表售卖的单位，例如1"手"=12“件"的"手"，国际站无需关注
     */
    public String getSellunit() {
        return sellunit;
    }

    /**
     * 设置售卖单位，如果为批量售卖，代表售卖的单位，例如1"手"=12“件"的"手"，国际站无需关注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSellunit(String sellunit) {
        this.sellunit = sellunit;
    }

    private Integer quoteType;

    /**
     * @return 普通报价-FIXED_PRICE("0"),SKU规格报价-SKU_PRICE("1"),SKU区间报价（商品维度）-SKU_PRICE_RANGE_FOR_OFFER("2"),SKU区间报价（SKU维度）-SKU_PRICE_RANGE("3")，国际站无需关注
     */
    public Integer getQuoteType() {
        return quoteType;
    }

    /**
     * 设置普通报价-FIXED_PRICE("0"),SKU规格报价-SKU_PRICE("1"),SKU区间报价（商品维度）-SKU_PRICE_RANGE_FOR_OFFER("2"),SKU区间报价（SKU维度）-SKU_PRICE_RANGE("3")，国际站无需关注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setQuoteType(Integer quoteType) {
        this.quoteType = quoteType;
    }

}
