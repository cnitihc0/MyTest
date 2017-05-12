package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabalogisticsexpressGoodsPackage {

    private BigDecimal totalVolume;

    /**
     * @return 总体积
     */
    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    /**
     * 设置总体积     *
     * 参数示例：<pre>2.34</pre>     
     * 此参数必填
     */
    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    private String dimUnit;

    /**
     * @return 尺寸单位，cm：厘米
     */
    public String getDimUnit() {
        return dimUnit;
    }

    /**
     * 设置尺寸单位，cm：厘米     *
     * 参数示例：<pre>cm</pre>     
     * 此参数必填
     */
    public void setDimUnit(String dimUnit) {
        this.dimUnit = dimUnit;
    }

    private Integer totalQuantity;

    /**
     * @return 总件数
     */
    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * 设置总件数     *
     * 参数示例：<pre>5</pre>     
     * 此参数必填
     */
    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    private String weightUnit;

    /**
     * @return 重量单位，kg：公斤
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * 设置重量单位，kg：公斤     *
     * 参数示例：<pre>kg</pre>     
     * 此参数必填
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    private BigDecimal totalWeight;

    /**
     * @return 总重量
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * 设置总重量     *
     * 参数示例：<pre>2.34</pre>     
     * 此参数必填
     */
    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    private AlibabalogisticsexpressPackageItem[] packageItems;

    /**
     * @return 包裹项
     */
    public AlibabalogisticsexpressPackageItem[] getPackageItems() {
        return packageItems;
    }

    /**
     * 设置包裹项     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPackageItems(AlibabalogisticsexpressPackageItem[] packageItems) {
        this.packageItems = packageItems;
    }

}
