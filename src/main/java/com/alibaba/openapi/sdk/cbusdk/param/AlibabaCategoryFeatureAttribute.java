package com.alibaba.openapi.sdk.cbusdk.param;

/**
 * Created by Administrator on 2017/5/12.
 */
public class AlibabaCategoryFeatureAttribute {
    private Long attrID;
    private String name;
    private Long valueId;
    private String value;
    private String unit;
    private String ordering;
    private String isKey;

    public void setAttrID(Long attrID) {
        this.attrID = attrID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    public void setIsKey(String isKey) {
        this.isKey = isKey;
    }

    public Long getAttrID() {

        return attrID;
    }

    public String getName() {
        return name;
    }

    public Long getValueId() {
        return valueId;
    }

    public String getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public String getOrdering() {
        return ordering;
    }

    public String getIsKey() {
        return isKey;
    }
}
