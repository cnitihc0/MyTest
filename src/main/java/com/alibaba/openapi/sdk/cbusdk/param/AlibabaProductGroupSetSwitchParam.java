package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductGroupSetSwitchParam {

    private Boolean switchValue;

    /**
     * @return 设置状态，true：已开启；false：未开启
     */
    public Boolean getSwitchValue() {
        return switchValue;
    }

    /**
     * 设置设置状态，true：已开启；false：未开启     *
     * 参数示例：<pre>true</pre>     
     * 此参数必填
     */
    public void setSwitchValue(Boolean switchValue) {
        this.switchValue = switchValue;
    }

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

}
