package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductGetParam {

    private Long productID;

    /**
     * @return 商品ID
     */
    public Long getProductID() {
        return productID;
    }

    /**
     * 设置商品ID     *
     * 参数示例：<pre>123456</pre>     
     * 此参数必填
     */
    public void setProductID(Long productID) {
        this.productID = productID;
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
