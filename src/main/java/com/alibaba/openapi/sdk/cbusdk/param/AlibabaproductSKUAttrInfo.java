package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaproductSKUAttrInfo {

    private Long attributeID;

    /**
     * @return sku属性ID
     */
    public Long getAttributeID() {
        return attributeID;
    }

    /**
     * 设置sku属性ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAttributeID(Long attributeID) {
        this.attributeID = attributeID;
    }

    private Long attValueID;

    /**
     * @return sku值ID，1688不用关注
     */
    public Long getAttValueID() {
        return attValueID;
    }

    /**
     * 设置sku值ID，1688不用关注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAttValueID(Long attValueID) {
        this.attValueID = attValueID;
    }

    private String attributeValue;

    /**
     * @return sku值内容，国际站不用关注
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * 设置sku值内容，国际站不用关注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    private String customValueName;

    /**
     * @return 自定义属性值名称，1688无需关注
     */
    public String getCustomValueName() {
        return customValueName;
    }

    /**
     * 设置自定义属性值名称，1688无需关注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCustomValueName(String customValueName) {
        this.customValueName = customValueName;
    }

    private String skuImageUrl;

    /**
     * @return sku图片
     */
    public String getSkuImageUrl() {
        return skuImageUrl;
    }

    /**
     * 设置sku图片     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSkuImageUrl(String skuImageUrl) {
        this.skuImageUrl = skuImageUrl;
    }

}
