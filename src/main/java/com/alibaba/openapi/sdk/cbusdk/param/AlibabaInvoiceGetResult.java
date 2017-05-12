package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaInvoiceGetResult {

    private AlibabainvoiceOrderInvoiceModel result;

    /**
     * @return 发票信息
     */
    public AlibabainvoiceOrderInvoiceModel getResult() {
        return result;
    }

    /**
     * 设置发票信息     *
          
     * 此参数必填
     */
    public void setResult(AlibabainvoiceOrderInvoiceModel result) {
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

    private String errorMessage;

    /**
     * @return 错误描述
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 设置错误描述     *
          
     * 此参数必填
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
