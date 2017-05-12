package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabacategoryAttributeInfo {

    private Long attrID;

    /**
     * @return 属性id
     */
    public Long getAttrID() {
        return attrID;
    }

    /**
     * 设置属性id     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAttrID(Long attrID) {
        this.attrID = attrID;
    }

    private String name;

    /**
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setName(String name) {
        this.name = name;
    }

    private Boolean required;

    /**
     * @return 是否必填属性
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * 设置是否必填属性     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

    private String[] units;

    /**
     * @return 该属性的单位
     */
    public String[] getUnits() {
        return units;
    }

    /**
     * 设置该属性的单位     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setUnits(String[] units) {
        this.units = units;
    }

    private Boolean isSKUAttribute;

    /**
     * @return 该属性能否当成SKU属性
     */
    public Boolean getIsSKUAttribute() {
        return isSKUAttribute;
    }

    /**
     * 设置该属性能否当成SKU属性     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setIsSKUAttribute(Boolean isSKUAttribute) {
        this.isSKUAttribute = isSKUAttribute;
    }

    private AlibabacategoryAttributeValueInfo[] attrValues;

    /**
     * @return 属性可选的属性值
     */
    public AlibabacategoryAttributeValueInfo[] getAttrValues() {
        return attrValues;
    }

    /**
     * 设置属性可选的属性值     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAttrValues(AlibabacategoryAttributeValueInfo[] attrValues) {
        this.attrValues = attrValues;
    }

    private String inputType;

    /**
     * @return 输入类型
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * 设置输入类型     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    private Boolean isSupportCustomizeValue;

    /**
     * @return 用成SKU属性时，是否支持自定义属性值名称，1688不返回该信息
     */
    public Boolean getIsSupportCustomizeValue() {
        return isSupportCustomizeValue;
    }

    /**
     * 设置用成SKU属性时，是否支持自定义属性值名称，1688不返回该信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setIsSupportCustomizeValue(Boolean isSupportCustomizeValue) {
        this.isSupportCustomizeValue = isSupportCustomizeValue;
    }

    private Boolean isSupportCustomizeImage;

    /**
     * @return 用成SKU属性时，是否支持自定义图片展示，1688不返回该信息
     */
    public Boolean getIsSupportCustomizeImage() {
        return isSupportCustomizeImage;
    }

    /**
     * 设置用成SKU属性时，是否支持自定义图片展示，1688不返回该信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setIsSupportCustomizeImage(Boolean isSupportCustomizeImage) {
        this.isSupportCustomizeImage = isSupportCustomizeImage;
    }

}
