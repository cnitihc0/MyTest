package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabatradeSendGoodsResult {

    private String logisticsId;

    /**
     * @return 物流单号
     */
    public String getLogisticsId() {
        return logisticsId;
    }

    /**
     * 设置物流单号     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    private String orderId;

    /**
     * @return 订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单号     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private String orderEntryIds;

    /**
     * @return 订单明细ID，以逗号分隔
     */
    public String getOrderEntryIds() {
        return orderEntryIds;
    }

    /**
     * 设置订单明细ID，以逗号分隔     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOrderEntryIds(String orderEntryIds) {
        this.orderEntryIds = orderEntryIds;
    }

}
