package com.alibaba.openapi.sdk.cbusdk.param;

/**
 * Created by Administrator on 2017/5/11.
 */
public class AlibabaCategoryAttributeGetResult extends AlibabaBaseResult {
    private AlibabaCategoryAttributeGetParam[] attributes;
    private AlibabaCategoryPostLevelAttrRel[] levelAttrRelList;

    public void setAttributes(AlibabaCategoryAttributeGetParam[] attributes) {
        this.attributes = attributes;
    }

    public void setLevelAttrRelList(AlibabaCategoryPostLevelAttrRel[] levelAttrRelList) {
        this.levelAttrRelList = levelAttrRelList;
    }

    public AlibabaCategoryAttributeGetParam[] getAttributes() {

        return attributes;
    }

    public AlibabaCategoryPostLevelAttrRel[] getLevelAttrRelList() {
        return levelAttrRelList;
    }
}
