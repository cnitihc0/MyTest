package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeHtmlGetResult {

    private AlibabaassuranceorderDetail result;

    /**
     * @return 信保订单详情
     */
    public AlibabaassuranceorderDetail getResult() {
        return result;
    }

    /**
     * 设置信保订单详情     *
          
     * 此参数必填
     */
    public void setResult(AlibabaassuranceorderDetail result) {
        this.result = result;
    }

    private String errorCode;

    /**
     * @return 
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置     *
          
     * 此参数必填
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private String errorMessage;

    /**
     * @return 
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 设置     *
          
     * 此参数必填
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
