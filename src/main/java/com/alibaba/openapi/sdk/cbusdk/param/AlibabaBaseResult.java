package com.alibaba.openapi.sdk.cbusdk.param;

/**
 * Created by Administrator on 2017/5/10.
 */
public class AlibabaBaseResult {
    private String errorCode;
    private String errorMsg;

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {

        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
