package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabapaymentChannelPreparePayResult {

    private String paymentCode;

    /**
     * @return 
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    private AlibabapaymentbankAccountInfo sellerBankAccountInfo;

    /**
     * @return 
     */
    public AlibabapaymentbankAccountInfo getSellerBankAccountInfo() {
        return sellerBankAccountInfo;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSellerBankAccountInfo(AlibabapaymentbankAccountInfo sellerBankAccountInfo) {
        this.sellerBankAccountInfo = sellerBankAccountInfo;
    }

}
