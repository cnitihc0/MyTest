package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaLogisticsInternationalexpressWtdOrderCancelParam {

    private String webSite;

    /**
     * @return 站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * 设置站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    private Long orderId;

    /**
     * @return 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID     *
     * 参数示例：<pre>123456</pre>     
     * 此参数必填
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    private String[] cancelReasonTypes;

    /**
     * @return 取消原因类型，可多选。<br>not_payment：未收到货款，
    buyer_cancel_order：买家取消订单，
    expected_delivery_time：赶不上预定发货期，
    product_quality_problem：货物质量问题，
    logistics_price_high：物流服务价格太高，
    transport_long_time：物流服务运输时间太长，
    on_service：对服务态度不满意，
    operation_complex：操作太复杂，
    loss_goods：货物丢失，
    damaged_goods：货物破损，
    no_container：没有舱位，
    user_cancle_container：用户要求取消订舱，
    goods_cannot_clearance：货物无法通关，
    other_reasons：其它原因
     */
    public String[] getCancelReasonTypes() {
        return cancelReasonTypes;
    }

    /**
     * 设置取消原因类型，可多选。<br>not_payment：未收到货款，
    buyer_cancel_order：买家取消订单，
    expected_delivery_time：赶不上预定发货期，
    product_quality_problem：货物质量问题，
    logistics_price_high：物流服务价格太高，
    transport_long_time：物流服务运输时间太长，
    on_service：对服务态度不满意，
    operation_complex：操作太复杂，
    loss_goods：货物丢失，
    damaged_goods：货物破损，
    no_container：没有舱位，
    user_cancle_container：用户要求取消订舱，
    goods_cannot_clearance：货物无法通关，
    other_reasons：其它原因     *
     * 参数示例：<pre>not_payment</pre>     
     * 此参数必填
     */
    public void setCancelReasonTypes(String[] cancelReasonTypes) {
        this.cancelReasonTypes = cancelReasonTypes;
    }

    private String remark;

    /**
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

}
