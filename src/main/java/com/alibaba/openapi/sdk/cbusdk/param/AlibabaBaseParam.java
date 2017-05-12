package com.alibaba.openapi.sdk.cbusdk.param;

public class AlibabaBaseParam {

    private String apiNamespace;
    private String apiName;
    private int apiVersion;

    public AlibabaBaseParam(String apiNamespace, String apiName, int apiVersion) {
        this.apiNamespace = apiNamespace;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
    }

    public void setApiNamespace(String apiNamespace) {
        this.apiNamespace = apiNamespace;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public void setApiVersion(int apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getApiNamespace() {

        return apiNamespace;
    }

    public String getApiName() {
        return apiName;
    }

    public int getApiVersion() {
        return apiVersion;
    }
}
