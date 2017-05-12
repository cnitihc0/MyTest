package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeGeneralPreorderParam {

    private AlibabatradeGoodsInfo[] goods;

    /**
     * @return 购买的货物列表
     */
    public AlibabatradeGoodsInfo[] getGoods() {
        return goods;
    }

    /**
     * 设置购买的货物列表     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setGoods(AlibabatradeGoodsInfo[] goods) {
        this.goods = goods;
    }

    private AlibabatradeReceiveAddress receiveAddress;

    /**
     * @return 收货地址，可以填写买家的收货地址ID，或者买家的收货地址信息
     */
    public AlibabatradeReceiveAddress getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * 设置收货地址，可以填写买家的收货地址ID，或者买家的收货地址信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setReceiveAddress(AlibabatradeReceiveAddress receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    private AlibabatradecomKeyValuePair[] extension;

    /**
     * @return 扩展信息
     */
    public AlibabatradecomKeyValuePair[] getExtension() {
        return extension;
    }

    /**
     * 设置扩展信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setExtension(AlibabatradecomKeyValuePair[] extension) {
        this.extension = extension;
    }

}
