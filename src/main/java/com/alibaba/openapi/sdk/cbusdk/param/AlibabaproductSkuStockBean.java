package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaproductSkuStockBean {

    private String skuId;

    /**
     * @return 有的产品拥有sku信息，对已售数量的变更需要指定SKU信息。请注意：针对1688的业务场景，该字段请填写specId，不要填写skuId。
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * 设置有的产品拥有sku信息，对已售数量的变更需要指定SKU信息。请注意：针对1688的业务场景，该字段请填写specId，不要填写skuId。     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    private Integer stockChange;

    /**
     * @return 如果值为5，说明增加5个可售数量。如果值为-9，说明减少9个可售数量。
     */
    public Integer getStockChange() {
        return stockChange;
    }

    /**
     * 设置如果值为5，说明增加5个可售数量。如果值为-9，说明减少9个可售数量。     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setStockChange(Integer stockChange) {
        this.stockChange = stockChange;
    }

}
