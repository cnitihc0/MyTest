package com.alibaba.openapi.sdk.cbusdk.param;

/**
 * Created by Administrator on 2017/5/12.
 */
public class AlibabaCategorySpuInfo {
    private Long spuId;
    private Long categoryId;
    private String name;
    private String details;
    private String table;
    private Long standardSpuAttrValues;

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setStandardSpuAttrValues(Long standardSpuAttrValues) {
        this.standardSpuAttrValues = standardSpuAttrValues;
    }

    public Long getSpuId() {

        return spuId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getTable() {
        return table;
    }

    public Long getStandardSpuAttrValues() {
        return standardSpuAttrValues;
    }

    @Override
    public String toString() {
        return "AlibabaCategorySpuInfo{" +
                "spuId=" + spuId +
                ", categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", table='" + table + '\'' +
                ", standardSpuAttrValues=" + standardSpuAttrValues +
                '}';
    }
}
