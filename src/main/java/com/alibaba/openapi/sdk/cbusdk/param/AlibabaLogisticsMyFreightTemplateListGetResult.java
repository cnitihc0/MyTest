package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaLogisticsMyFreightTemplateListGetResult {

    private AlibabalogisticsFreightTemplate[] result;

    /**
     * @return 
     */
    public AlibabalogisticsFreightTemplate[] getResult() {
        return result;
    }

    /**
     * 设置     *
          
     * 此参数必填
     */
    public void setResult(AlibabalogisticsFreightTemplate[] result) {
        this.result = result;
    }

    private String errorCode;

    /**
     * @return 错误码
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置错误码     *
          
     * 此参数必填
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private String errorMsg;

    /**
     * @return 错误描述
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置错误描述     *
          
     * 此参数必填
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
