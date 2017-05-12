package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeQuotationOrderCreateParam {

    private AlibabaopenplatformtradeBizMakeSingleOrderGroup makeSingleOrderGroup;

    /**
     * @return 下单详情信息
     */
    public AlibabaopenplatformtradeBizMakeSingleOrderGroup getMakeSingleOrderGroup() {
        return makeSingleOrderGroup;
    }

    /**
     * 设置下单详情信息     *
     * 参数示例：<pre>{"receiveAddressGroup":{"address":"聚合路699号","areaCode":"330108","fullName":"洪洲阳","mobile":"13817748888","postCode":"311200"}}</pre>     
     * 此参数必填
     */
    public void setMakeSingleOrderGroup(AlibabaopenplatformtradeBizMakeSingleOrderGroup makeSingleOrderGroup) {
        this.makeSingleOrderGroup = makeSingleOrderGroup;
    }

    private String subBiz;

    /**
     * @return 下单流程类型，普通询报价："buyoffer";分阶段付款："bostep";多种类交易(item种类大于50个)："mulitem";其他方式，在交易下单页面选取："other";
     */
    public String getSubBiz() {
        return subBiz;
    }

    /**
     * 设置下单流程类型，普通询报价："buyoffer";分阶段付款："bostep";多种类交易(item种类大于50个)："mulitem";其他方式，在交易下单页面选取："other";     *
     * 参数示例：<pre>buyoffer</pre>     
     * 此参数必填
     */
    public void setSubBiz(String subBiz) {
        this.subBiz = subBiz;
    }

    private AlibabaopenplatformtradeQuotationIdParam quotationInfo;

    /**
     * @return 询报价单参数标志
     */
    public AlibabaopenplatformtradeQuotationIdParam getQuotationInfo() {
        return quotationInfo;
    }

    /**
     * 设置询报价单参数标志     *
     * 参数示例：<pre>{"buyerMemberId":"b2b-2248564064","quoteItemIds":[1107742990902],"supplyNoteId":"959751330902"}</pre>     
     * 此参数必填
     */
    public void setQuotationInfo(AlibabaopenplatformtradeQuotationIdParam quotationInfo) {
        this.quotationInfo = quotationInfo;
    }

}
