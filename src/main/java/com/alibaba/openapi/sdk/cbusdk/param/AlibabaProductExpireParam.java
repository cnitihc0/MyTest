package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductExpireParam {

    private long[] productIds;

    /**
     * @return 过期商品的ID列表
     */
    public long[] getProductIds() {
        return productIds;
    }

    /**
     * 设置过期商品的ID列表     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setProductIds(long[] productIds) {
        this.productIds = productIds;
    }

    private String webSite;

    /**
     * @return 1688或者alibaba
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * 设置1688或者alibaba     *
     * 参数示例：<pre>1688</pre>     
     * 此参数必填
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

}
