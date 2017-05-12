package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabatradeOrderViewModel {

    private String[] afterFlowIds;

    /**
     * @return 
     */
    public String[] getAfterFlowIds() {
        return afterFlowIds;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAfterFlowIds(String[] afterFlowIds) {
        this.afterFlowIds = afterFlowIds;
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

    private AlibabatradeMakeOrderModel orderModel;

    /**
     * @return 
     */
    public AlibabatradeMakeOrderModel getOrderModel() {
        return orderModel;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOrderModel(AlibabatradeMakeOrderModel orderModel) {
        this.orderModel = orderModel;
    }

}
