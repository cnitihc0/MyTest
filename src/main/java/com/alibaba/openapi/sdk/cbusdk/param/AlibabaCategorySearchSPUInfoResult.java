package com.alibaba.openapi.sdk.cbusdk.param;

/**
 * Created by Administrator on 2017/5/12.
 */
public class AlibabaCategorySearchSPUInfoResult extends AlibabaBaseResult {
    private  AlibabaCategorySpuInfo[] result;
    private int totalRecords;

    public void setResult(AlibabaCategorySpuInfo[] result) {
        this.result = result;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public AlibabaCategorySpuInfo[] getResult() {

        return result;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        if (result != null)
        for (AlibabaCategorySpuInfo a : result) {
            buffer.append(a.toString());
        }
        return buffer.toString();
    }
}
