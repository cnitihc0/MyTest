//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alibaba.openapi.sdk.cbusdk.param;

public class AlibabaopenplatformtradeBizOrderCommitResult {
    private String[] afterFlowIds;
    private Boolean customOffer;
    private Long orderAmount;
    private Long orderId;
    private String[] outBizEntryIds;
    private String payChannel;
    private Boolean success;
    private AlibabaopenplatformtradeBizSimpleOrderModel orderModel;
    private AlibabaopenplatformtradeResultCodeDef resultCode;
    private AlibabatradecomKeyValuePair[] extModels;

    public AlibabaopenplatformtradeBizOrderCommitResult() {
    }

    public String[] getAfterFlowIds() {
        return this.afterFlowIds;
    }

    public void setAfterFlowIds(String[] afterFlowIds) {
        this.afterFlowIds = afterFlowIds;
    }

    public Boolean getCustomOffer() {
        return this.customOffer;
    }

    public void setCustomOffer(Boolean customOffer) {
        this.customOffer = customOffer;
    }

    public Long getOrderAmount() {
        return this.orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String[] getOutBizEntryIds() {
        return this.outBizEntryIds;
    }

    public void setOutBizEntryIds(String[] outBizEntryIds) {
        this.outBizEntryIds = outBizEntryIds;
    }

    public String getPayChannel() {
        return this.payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public AlibabaopenplatformtradeBizSimpleOrderModel getOrderModel() {
        return this.orderModel;
    }

    public void setOrderModel(AlibabaopenplatformtradeBizSimpleOrderModel orderModel) {
        this.orderModel = orderModel;
    }

    public AlibabaopenplatformtradeResultCodeDef getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(AlibabaopenplatformtradeResultCodeDef resultCode) {
        this.resultCode = resultCode;
    }

    public AlibabatradecomKeyValuePair[] getExtModels() {
        return this.extModels;
    }

    public void setExtModels(AlibabatradecomKeyValuePair[] extModels) {
        this.extModels = extModels;
    }
}
