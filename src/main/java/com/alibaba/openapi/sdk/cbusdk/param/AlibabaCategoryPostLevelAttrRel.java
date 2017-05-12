package com.alibaba.openapi.sdk.cbusdk.param;

/**
 * Created by Administrator on 2017/5/11.
 */
public class AlibabaCategoryPostLevelAttrRel {
    private int fid;
    private int[] subFids;
    private int attrType;

    public void setFid(int fid) {
        this.fid = fid;
    }

    public void setSubFids(int[] subFids) {
        this.subFids = subFids;
    }

    public void setAttrType(int attrType) {
        this.attrType = attrType;
    }

    public int getFid() {

        return fid;
    }

    public int[] getSubFids() {
        return subFids;
    }

    public int getAttrType() {
        return attrType;
    }
}
