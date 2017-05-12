package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaLogisticsMySendGoodsAddressListGetResult {

    private AlibabalgisticsMySendGoodsAddress[] result;

    /**
     * @return 返回结果列表
     */
    public AlibabalgisticsMySendGoodsAddress[] getResult() {
        return result;
    }

    /**
     * 设置返回结果列表     *
          
     * 此参数必填
     */
    public void setResult(AlibabalgisticsMySendGoodsAddress[] result) {
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

    private String errorMsg;

    /**
     * @return 
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置     *
          
     * 此参数必填
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
