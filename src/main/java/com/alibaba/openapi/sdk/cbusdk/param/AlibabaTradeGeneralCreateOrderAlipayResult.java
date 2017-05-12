package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeGeneralCreateOrderAlipayResult {

    private AlibabaopenplatformtraderesultTradeCreateGeneralOrderResult result;

    /**
     * @return 
     */
    public AlibabaopenplatformtraderesultTradeCreateGeneralOrderResult getResult() {
        return result;
    }

    /**
     * 设置     *
          
     * 此参数必填
     */
    public void setResult(AlibabaopenplatformtraderesultTradeCreateGeneralOrderResult result) {
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
