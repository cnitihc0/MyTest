//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alibaba.openapi.sdk.cbusdk.param;

public class AlibabalogisticsOpenPlatformLogisticsTrace {
    private String logisticsId;
    private Long orderId;
    private String logisticsBillNo;
    private AlibabalogisticsOpenPlatformLogisticsStep[] logisticsSteps;
    private AlibabalogisticsOpenPlatformTraceNode[] traceNodeList;

    public AlibabalogisticsOpenPlatformLogisticsTrace() {
    }

    public String getLogisticsId() {
        return this.logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getLogisticsBillNo() {
        return this.logisticsBillNo;
    }

    public void setLogisticsBillNo(String logisticsBillNo) {
        this.logisticsBillNo = logisticsBillNo;
    }

    public AlibabalogisticsOpenPlatformLogisticsStep[] getLogisticsSteps() {
        return this.logisticsSteps;
    }

    public void setLogisticsSteps(AlibabalogisticsOpenPlatformLogisticsStep[] logisticsSteps) {
        this.logisticsSteps = logisticsSteps;
    }

    public AlibabalogisticsOpenPlatformTraceNode[] getTraceNodeList() {
        return this.traceNodeList;
    }

    public void setTraceNodeList(AlibabalogisticsOpenPlatformTraceNode[] traceNodeList) {
        this.traceNodeList = traceNodeList;
    }
}
