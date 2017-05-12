package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeRefundResult {

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

    private String extErrorMessage;

    /**
     * @return 
     */
    public String getExtErrorMessage() {
        return extErrorMessage;
    }

    /**
     * 设置     *
          
     * 此参数必填
     */
    public void setExtErrorMessage(String extErrorMessage) {
        this.extErrorMessage = extErrorMessage;
    }

}
