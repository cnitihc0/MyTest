package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeCancelParam {

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

    private Long tradeID;

    /**
     * @return 交易id
     */
    public Long getTradeID() {
        return tradeID;
    }

    /**
     * 设置交易id     *
     * 参数示例：<pre>123456</pre>     
     * 此参数必填
     */
    public void setTradeID(Long tradeID) {
        this.tradeID = tradeID;
    }

    private String cancelReason;

    /**
     * @return 原因描述
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * 设置原因描述     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
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
