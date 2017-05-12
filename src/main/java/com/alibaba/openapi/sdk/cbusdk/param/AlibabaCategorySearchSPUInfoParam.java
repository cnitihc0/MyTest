package com.alibaba.openapi.sdk.cbusdk.param;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by Administrator on 2017/5/12.
 */
public class AlibabaCategorySearchSPUInfoParam extends AlibabaBaseParam {

    public AlibabaCategorySearchSPUInfoParam(String apiNamespace, String apiName, int apiVersion) {
        super(apiNamespace, apiName, apiVersion);
    }
    public AlibabaCategorySearchSPUInfoParam() {
        super("com.alibaba.product", "alibaba.category.searchSPUInfo", 1);
    }

    private Long categoryId;
    private boolean isNeedKeyAttr;
    private boolean isOnlyKeyAttr;
    private int index;
    private int size;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setIsNeedKeyAttr(boolean needKeyAttr) {
        isNeedKeyAttr = needKeyAttr;
    }

    public void setIsOnlyKeyAttr(boolean onlyKeyAttr) {
        isOnlyKeyAttr = onlyKeyAttr;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Long getCategoryId() {

        return categoryId;
    }

    public boolean getIsNeedKeyAttr() {
        return isNeedKeyAttr;
    }

    public boolean getIsOnlyKeyAttr() {
        return isOnlyKeyAttr;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return size;
    }
}
