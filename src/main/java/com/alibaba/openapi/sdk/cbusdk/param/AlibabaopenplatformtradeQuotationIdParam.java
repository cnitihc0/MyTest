package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaopenplatformtradeQuotationIdParam {

    private String buyerMemberId;

    /**
     * @return 采购商 memberId（必填）
     */
    public String getBuyerMemberId() {
        return buyerMemberId;
    }

    /**
     * 设置采购商 memberId（必填）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setBuyerMemberId(String buyerMemberId) {
        this.buyerMemberId = buyerMemberId;
    }

    private Long purchaseNoteId;

    /**
     * @return 报价项Id（选填）
     */
    public Long getPurchaseNoteId() {
        return purchaseNoteId;
    }

    /**
     * 设置报价项Id（选填）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPurchaseNoteId(Long purchaseNoteId) {
        this.purchaseNoteId = purchaseNoteId;
    }

    private long[] quoteItemIds;

    /**
     * @return 询价单/招标单ID（选填）
     */
    public long[] getQuoteItemIds() {
        return quoteItemIds;
    }

    /**
     * 设置询价单/招标单ID（选填）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setQuoteItemIds(long[] quoteItemIds) {
        this.quoteItemIds = quoteItemIds;
    }

    private String supplyNoteId;

    /**
     * @return 报价单/投标单ID（必填）
     */
    public String getSupplyNoteId() {
        return supplyNoteId;
    }

    /**
     * 设置报价单/投标单ID（必填）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSupplyNoteId(String supplyNoteId) {
        this.supplyNoteId = supplyNoteId;
    }

}
