package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabapaymentPayChannel {

    private String errorCode;

    /**
     * @return 
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private Boolean isAvaliable;

    /**
     * @return 
     */
    public Boolean getIsAvaliable() {
        return isAvaliable;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setIsAvaliable(Boolean isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    private Boolean isNeedBuyerSign;

    /**
     * @return 
     */
    public Boolean getIsNeedBuyerSign() {
        return isNeedBuyerSign;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setIsNeedBuyerSign(Boolean isNeedBuyerSign) {
        this.isNeedBuyerSign = isNeedBuyerSign;
    }

    private String name;

    /**
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setName(String name) {
        this.name = name;
    }

}
