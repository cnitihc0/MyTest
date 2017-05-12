package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeGeneralCreateOrderAlipayParam {

    private AlibabaopenplatformtradeBizCargoGroup[] cargoGroups;

    /**
     * @return 商品信息列表。JSON串，其中：offerId，quantity（数量），specId（sku offer对应的specId），unitPrice（单价）这几个字段必须有值
     */
    public AlibabaopenplatformtradeBizCargoGroup[] getCargoGroups() {
        return cargoGroups;
    }

    /**
     * 设置商品信息列表。JSON串，其中：offerId，quantity（数量），specId（sku offer对应的specId），unitPrice（单价）这几个字段必须有值     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCargoGroups(AlibabaopenplatformtradeBizCargoGroup[] cargoGroups) {
        this.cargoGroups = cargoGroups;
    }

    private AlibabaopenplatformtradeBizInvoiceGroup invoiceGroup;

    /**
     * @return 发票信息，若没有可不填。
     */
    public AlibabaopenplatformtradeBizInvoiceGroup getInvoiceGroup() {
        return invoiceGroup;
    }

    /**
     * 设置发票信息，若没有可不填。     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setInvoiceGroup(AlibabaopenplatformtradeBizInvoiceGroup invoiceGroup) {
        this.invoiceGroup = invoiceGroup;
    }

    private AlibabaopenplatformtradeBizOtherInfoGroup otherInfoGroup;

    /**
     * @return 其它信息，针对订单级别。JSON串格式，重要字段：message（买家留言），totalAmount（必填字段，总金额= 货品总金额 + 运费，单位: 元），mixAmount（混批金额，必填），mixNumber（混批数量，除非为0否则必填），sumCarriage（总运费，单位元。除非为0否则必填），filledCarriage（用户填写的运费 单位:元），promotionId(优惠id，如果有订单级别优惠，必须传此值才有效)，additionalFee（附加费,单位元）
     */
    public AlibabaopenplatformtradeBizOtherInfoGroup getOtherInfoGroup() {
        return otherInfoGroup;
    }

    /**
     * 设置其它信息，针对订单级别。JSON串格式，重要字段：message（买家留言），totalAmount（必填字段，总金额= 货品总金额 + 运费，单位: 元），mixAmount（混批金额，必填），mixNumber（混批数量，除非为0否则必填），sumCarriage（总运费，单位元。除非为0否则必填），filledCarriage（用户填写的运费 单位:元），promotionId(优惠id，如果有订单级别优惠，必须传此值才有效)，additionalFee（附加费,单位元）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOtherInfoGroup(AlibabaopenplatformtradeBizOtherInfoGroup otherInfoGroup) {
        this.otherInfoGroup = otherInfoGroup;
    }

    private AlibabaopenplatformtradeBizReceiveAddressGroup receiveAddressGroup;

    /**
     * @return 收货地址。JSON串，主要字段：addressId（用户在阿里巴巴保存的地址的id。若能提供，其他可以不填。若不能提供，请设为-1），fullName（收货人姓名），areaCode，cityCode，provinceCode（县/区，市，省份编码。参考”行政区划代码“），address（街道地址），mobile（手机），phone（电话），postCode（邮编）
     */
    public AlibabaopenplatformtradeBizReceiveAddressGroup getReceiveAddressGroup() {
        return receiveAddressGroup;
    }

    /**
     * 设置收货地址。JSON串，主要字段：addressId（用户在阿里巴巴保存的地址的id。若能提供，其他可以不填。若不能提供，请设为-1），fullName（收货人姓名），areaCode，cityCode，provinceCode（县/区，市，省份编码。参考”行政区划代码“），address（街道地址），mobile（手机），phone（电话），postCode（邮编）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setReceiveAddressGroup(AlibabaopenplatformtradeBizReceiveAddressGroup receiveAddressGroup) {
        this.receiveAddressGroup = receiveAddressGroup;
    }

    private String tradeWay;

    /**
     * @return 交易方式
     */
    public String getTradeWay() {
        return tradeWay;
    }

    /**
     * 设置交易方式     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTradeWay(String tradeWay) {
        this.tradeWay = tradeWay;
    }

    private String tradeMode;

    /**
     * @return 交易模型
     */
    public String getTradeMode() {
        return tradeMode;
    }

    /**
     * 设置交易模型     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode;
    }

}
