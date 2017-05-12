package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeSendGoodsParam {

    private String webSite;

    /**
     * @return 站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * 设置站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）     *
     * 参数示例：<pre>1688</pre>     
     * 此参数必填
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    private String orderId;

    /**
     * @return 订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID     *
     * 参数示例：<pre>123423</pre>     
     * 此参数必填
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private String orderEntryIds;

    /**
     * @return 订单明细ID, 多个明细请用英文逗号分隔
     */
    public String getOrderEntryIds() {
        return orderEntryIds;
    }

    /**
     * 设置订单明细ID, 多个明细请用英文逗号分隔     *
     * 参数示例：<pre>13234,1233</pre>     
     * 此参数必填
     */
    public void setOrderEntryIds(String orderEntryIds) {
        this.orderEntryIds = orderEntryIds;
    }

    private String remarks;

    /**
     * @return 用户备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置用户备注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    private String logisticsCompanyId;

    /**
     * @return 物流公司ID
     */
    public String getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    /**
     * 设置物流公司ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setLogisticsCompanyId(String logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    private String selfCompanyName;

    /**
     * @return logisticsCompanyId=8时，这个字段必填，需要填写其他的物流公司名称
     */
    public String getSelfCompanyName() {
        return selfCompanyName;
    }

    /**
     * 设置logisticsCompanyId=8时，这个字段必填，需要填写其他的物流公司名称     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSelfCompanyName(String selfCompanyName) {
        this.selfCompanyName = selfCompanyName;
    }

    private String logisticsBillNo;

    /**
     * @return 物流公司运单号
     */
    public String getLogisticsBillNo() {
        return logisticsBillNo;
    }

    /**
     * 设置物流公司运单号     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setLogisticsBillNo(String logisticsBillNo) {
        this.logisticsBillNo = logisticsBillNo;
    }

    private String gmtSystemSend;

    /**
     * @return 系统发货时间
     */
    public String getGmtSystemSend() {
        return gmtSystemSend;
    }

    /**
     * 设置系统发货时间     *
     * 参数示例：<pre>2012-04-13 09:38:00</pre>     
     * 此参数必填
     */
    public void setGmtSystemSend(String gmtSystemSend) {
        this.gmtSystemSend = gmtSystemSend;
    }

    private String gmtLogisticsCompanySend;

    /**
     * @return 卖家发货时间
     */
    public String getGmtLogisticsCompanySend() {
        return gmtLogisticsCompanySend;
    }

    /**
     * 设置卖家发货时间     *
     * 参数示例：<pre>2012-04-13 09:38:00</pre>     
     * 此参数必填
     */
    public void setGmtLogisticsCompanySend(String gmtLogisticsCompanySend) {
        this.gmtLogisticsCompanySend = gmtLogisticsCompanySend;
    }

}
