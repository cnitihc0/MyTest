package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabalogisticsexpressExpressWTDOrderCreateResult {

    private Long orderId;

    /**
     * @return 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    private AlibabalogisticscommonMoney estimatedCost;

    /**
     * @return 预估费用
     */
    public AlibabalogisticscommonMoney getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * 设置预估费用     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setEstimatedCost(AlibabalogisticscommonMoney estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

}
