package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaproductProductShippingInfo {

    private Long freightTemplateID;

    /**
     * @return 运费模板ID，1688使用两类特殊模板来标明使用：运费说明、 卖家承担运费的情况。此参数通过调用运费模板相关API获取
     */
    public Long getFreightTemplateID() {
        return freightTemplateID;
    }

    /**
     * 设置运费模板ID，1688使用两类特殊模板来标明使用：运费说明、 卖家承担运费的情况。此参数通过调用运费模板相关API获取     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setFreightTemplateID(Long freightTemplateID) {
        this.freightTemplateID = freightTemplateID;
    }

    private Double unitWeight;

    /**
     * @return 单位重量
     */
    public Double getUnitWeight() {
        return unitWeight;
    }

    /**
     * 设置单位重量     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    private String packageSize;

    /**
     * @return 尺寸，单位是厘米，长宽高范围是1-9999999。1688无需关注此字段
     */
    public String getPackageSize() {
        return packageSize;
    }

    /**
     * 设置尺寸，单位是厘米，长宽高范围是1-9999999。1688无需关注此字段     *
     * 参数示例：<pre>10x20x50</pre>     
     * 此参数必填
     */
    public void setPackageSize(String packageSize) {
        this.packageSize = packageSize;
    }

    private Integer volume;

    /**
     * @return 体积，单位是立方厘米，范围是1-9999999，1688无需关注此字段
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * 设置体积，单位是立方厘米，范围是1-9999999，1688无需关注此字段     *
     * 参数示例：<pre>500</pre>     
     * 此参数必填
     */
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    private Integer handlingTime;

    /**
     * @return 备货期，单位是天，范围是1-60。1688无需处理此字段
     */
    public Integer getHandlingTime() {
        return handlingTime;
    }

    /**
     * 设置备货期，单位是天，范围是1-60。1688无需处理此字段     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setHandlingTime(Integer handlingTime) {
        this.handlingTime = handlingTime;
    }

    private Long sendGoodsAddressId;

    /**
     * @return 发货地址ID，国际站无需处理此字段
     */
    public Long getSendGoodsAddressId() {
        return sendGoodsAddressId;
    }

    /**
     * 设置发货地址ID，国际站无需处理此字段     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSendGoodsAddressId(Long sendGoodsAddressId) {
        this.sendGoodsAddressId = sendGoodsAddressId;
    }

}
