package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaproductProductStock {

    private Long productId;

    /**
     * @return 产品ID
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置产品ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    private Integer productAmountChange;

    /**
     * @return 有的产品没有sku信息，对已售数量的变更设置在这里。如果值为5，说明增加5个可售数量。如果值为-9，说明减少9个可售数量。
     */
    public Integer getProductAmountChange() {
        return productAmountChange;
    }

    /**
     * 设置有的产品没有sku信息，对已售数量的变更设置在这里。如果值为5，说明增加5个可售数量。如果值为-9，说明减少9个可售数量。     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setProductAmountChange(Integer productAmountChange) {
        this.productAmountChange = productAmountChange;
    }

    private AlibabaproductSkuStockBean[] skuStocks;

    /**
     * @return SKU的库存的变更信息
     */
    public AlibabaproductSkuStockBean[] getSkuStocks() {
        return skuStocks;
    }

    /**
     * 设置SKU的库存的变更信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSkuStocks(AlibabaproductSkuStockBean[] skuStocks) {
        this.skuStocks = skuStocks;
    }

}
