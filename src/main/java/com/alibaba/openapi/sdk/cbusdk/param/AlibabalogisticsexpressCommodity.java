//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alibaba.openapi.sdk.cbusdk.param;

import java.math.BigDecimal;

public class AlibabalogisticsexpressCommodity {
    private BigDecimal netWeight;
    private String unit;
    private String enName;
    private String zhName;
    private String originCountryCode;
    private String[] statusDescTags;
    private BigDecimal quantity;
    private String hscode;
    private AlibabalogisticscommonMoney price;

    public AlibabalogisticsexpressCommodity() {
    }

    public BigDecimal getNetWeight() {
        return this.netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getZhName() {
        return this.zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getOriginCountryCode() {
        return this.originCountryCode;
    }

    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    public String[] getStatusDescTags() {
        return this.statusDescTags;
    }

    public void setStatusDescTags(String[] statusDescTags) {
        this.statusDescTags = statusDescTags;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getHscode() {
        return this.hscode;
    }

    public void setHscode(String hscode) {
        this.hscode = hscode;
    }

    public AlibabalogisticscommonMoney getPrice() {
        return this.price;
    }

    public void setPrice(AlibabalogisticscommonMoney price) {
        this.price = price;
    }
}
