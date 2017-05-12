package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabatradeOrderMutilViewResult {

    private AlibabatradeSimpleBuyer buyer;

    /**
     * @return 
     */
    public AlibabatradeSimpleBuyer getBuyer() {
        return buyer;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setBuyer(AlibabatradeSimpleBuyer buyer) {
        this.buyer = buyer;
    }

    private AlibabatradeOrderViewModel[] orderModels;

    /**
     * @return 
     */
    public AlibabatradeOrderViewModel[] getOrderModels() {
        return orderModels;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOrderModels(AlibabatradeOrderViewModel[] orderModels) {
        this.orderModels = orderModels;
    }

    private AlibabatradeReceiveAddress receiveAddress;

    /**
     * @return 
     */
    public AlibabatradeReceiveAddress getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setReceiveAddress(AlibabatradeReceiveAddress receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    private AlibabatraderesultCodeDef resultCode;

    /**
     * @return 
     */
    public AlibabatraderesultCodeDef getResultCode() {
        return resultCode;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setResultCode(AlibabatraderesultCodeDef resultCode) {
        this.resultCode = resultCode;
    }

}
