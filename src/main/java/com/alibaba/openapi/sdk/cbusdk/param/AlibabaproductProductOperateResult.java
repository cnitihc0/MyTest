package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaproductProductOperateResult {

    private Long productId;

    /**
     * @return 
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    private Boolean result;

    /**
     * @return 
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setResult(Boolean result) {
        this.result = result;
    }

    private String code;

    /**
     * @return 
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCode(String code) {
        this.code = code;
    }

    private String desc;

    /**
     * @return 
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
