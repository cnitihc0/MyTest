//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alibaba.openapi.sdk.cbusdk.param;

public class AlibabaopenplatformtraderesultTradeCreateGeneralOrderResult {
    private Boolean success;
    private Long totalSuccessAmount;
    private AlibabaopenplatformtradeBizOrderCommitResult[] commitResults;
    private AlibabaopenplatformtradeBizMutilOrderPublicData mutilOrderPublicData;
    private AlibabaopenplatformtradeResultCodeDef resultCode;
    private AlibabaopenplatformtradeKeyValuePairBizOrderCommitResult[] failOrderMap;
    private AlibabaopenplatformtradeKeyValuePairBizOrderCommitResult[] successOrderMap;

    public AlibabaopenplatformtraderesultTradeCreateGeneralOrderResult() {
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getTotalSuccessAmount() {
        return this.totalSuccessAmount;
    }

    public void setTotalSuccessAmount(Long totalSuccessAmount) {
        this.totalSuccessAmount = totalSuccessAmount;
    }

    public AlibabaopenplatformtradeBizOrderCommitResult[] getCommitResults() {
        return this.commitResults;
    }

    public void setCommitResults(AlibabaopenplatformtradeBizOrderCommitResult[] commitResults) {
        this.commitResults = commitResults;
    }

    public AlibabaopenplatformtradeBizMutilOrderPublicData getMutilOrderPublicData() {
        return this.mutilOrderPublicData;
    }

    public void setMutilOrderPublicData(AlibabaopenplatformtradeBizMutilOrderPublicData mutilOrderPublicData) {
        this.mutilOrderPublicData = mutilOrderPublicData;
    }

    public AlibabaopenplatformtradeResultCodeDef getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(AlibabaopenplatformtradeResultCodeDef resultCode) {
        this.resultCode = resultCode;
    }

    public AlibabaopenplatformtradeKeyValuePairBizOrderCommitResult[] getFailOrderMap() {
        return this.failOrderMap;
    }

    public void setFailOrderMap(AlibabaopenplatformtradeKeyValuePairBizOrderCommitResult[] failOrderMap) {
        this.failOrderMap = failOrderMap;
    }

    public AlibabaopenplatformtradeKeyValuePairBizOrderCommitResult[] getSuccessOrderMap() {
        return this.successOrderMap;
    }

    public void setSuccessOrderMap(AlibabaopenplatformtradeKeyValuePairBizOrderCommitResult[] successOrderMap) {
        this.successOrderMap = successOrderMap;
    }
}
