package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductModifyStockParam {

    private AlibabaproductProductStock[] productStockChange;

    /**
     * @return 产品库存变更信息
     */
    public AlibabaproductProductStock[] getProductStockChange() {
        return productStockChange;
    }

    /**
     * 设置产品库存变更信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setProductStockChange(AlibabaproductProductStock[] productStockChange) {
        this.productStockChange = productStockChange;
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
