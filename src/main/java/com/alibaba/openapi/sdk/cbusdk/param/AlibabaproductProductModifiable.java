package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaproductProductModifiable {

    private Long productId;

    /**
     * @return 商品ID
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    private Boolean modifiable;

    /**
     * @return 是否可以修改
     */
    public Boolean getModifiable() {
        return modifiable;
    }

    /**
     * 设置是否可以修改     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setModifiable(Boolean modifiable) {
        this.modifiable = modifiable;
    }

    private String desc;

    /**
     * @return 如果不能修改，描述信息
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置如果不能修改，描述信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
