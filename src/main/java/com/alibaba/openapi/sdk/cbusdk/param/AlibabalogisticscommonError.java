//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alibaba.openapi.sdk.cbusdk.param;

public class AlibabalogisticscommonError {
    private String message;
    private String code;
    private AlibabalogisticscommonSubError[] subErrors;

    public AlibabalogisticscommonError() {
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AlibabalogisticscommonSubError[] getSubErrors() {
        return this.subErrors;
    }

    public void setSubErrors(AlibabalogisticscommonSubError[] subErrors) {
        this.subErrors = subErrors;
    }
}
