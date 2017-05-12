package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabatradeGoodsInfo {

    private Long cartId;

    /**
     * @return 
     */
    public Long getCartId() {
        return cartId;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    private String ext;

    /**
     * @return 
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    private String flow;

    /**
     * @return 
     */
    public String getFlow() {
        return flow;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setFlow(String flow) {
        this.flow = flow;
    }

    private String id;

    /**
     * @return 
     */
    public String getId() {
        return id;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setId(String id) {
        this.id = id;
    }

    private Long offerId;

    /**
     * @return 
     */
    public Long getOfferId() {
        return offerId;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    private Double quantity;

    /**
     * @return 
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    private String specId;

    /**
     * @return 
     */
    public String getSpecId() {
        return specId;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSpecId(String specId) {
        this.specId = specId;
    }

    private String tradeMode;

    /**
     * @return 
     */
    public String getTradeMode() {
        return tradeMode;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode;
    }

    private String tradeWay;

    /**
     * @return 
     */
    public String getTradeWay() {
        return tradeWay;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTradeWay(String tradeWay) {
        this.tradeWay = tradeWay;
    }

    private AlibabatradecomKeyValuePair[] extParams;

    /**
     * @return 
     */
    public AlibabatradecomKeyValuePair[] getExtParams() {
        return extParams;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setExtParams(AlibabatradecomKeyValuePair[] extParams) {
        this.extParams = extParams;
    }

}
