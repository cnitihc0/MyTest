package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeGetLogisticsTraceInfoBuyerViewResult {

    private AlibabalogisticsOpenPlatformLogisticsTrace[] logisticsTrace;

    /**
     * @return 跟踪单详情
     */
    public AlibabalogisticsOpenPlatformLogisticsTrace[] getLogisticsTrace() {
        return logisticsTrace;
    }

    /**
     * 设置跟踪单详情     *
          
     * 此参数必填
     */
    public void setLogisticsTrace(AlibabalogisticsOpenPlatformLogisticsTrace[] logisticsTrace) {
        this.logisticsTrace = logisticsTrace;
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
