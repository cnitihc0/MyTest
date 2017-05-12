package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabalogisticsexpressExpressWTDOrder {

    private String createOrderTime;

    /**
     * @return 下单时间（ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）
     */
    public String getCreateOrderTime() {
        return createOrderTime;
    }

    /**
     * 设置下单时间（ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCreateOrderTime(String createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    private String shippingTime;

    /**
     * @return 发货时间（ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）
     */
    public String getShippingTime() {
        return shippingTime;
    }

    /**
     * 设置发货时间（ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setShippingTime(String shippingTime) {
        this.shippingTime = shippingTime;
    }

    private String remark;

    /**
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String mainTrackingNumber;

    /**
     * @return 国际主运单号（快递单号）：可用于查询跟踪信息
     */
    public String getMainTrackingNumber() {
        return mainTrackingNumber;
    }

    /**
     * 设置国际主运单号（快递单号）：可用于查询跟踪信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMainTrackingNumber(String mainTrackingNumber) {
        this.mainTrackingNumber = mainTrackingNumber;
    }

    private String[] trackingNumbers;

    /**
     * @return 国际运单号（快递单号）
     */
    public String[] getTrackingNumbers() {
        return trackingNumbers;
    }

    /**
     * 设置国际运单号（快递单号）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTrackingNumbers(String[] trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    private Long orderId;

    /**
     * @return 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    private String warehouseMemo;

    /**
     * @return 入库时,仓库填写的备注
     */
    public String getWarehouseMemo() {
        return warehouseMemo;
    }

    /**
     * 设置入库时,仓库填写的备注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setWarehouseMemo(String warehouseMemo) {
        this.warehouseMemo = warehouseMemo;
    }

    private String status;

    /**
     * @return 状态，WAIT_ARRIVE_WAREHOUSE：待发货，
    CARGO_ARRIVE_WAREHOUSE：货物抵达仓库，
    CARGO_ENTER_WAREHOUSE：已入库，
    SHIPPED：已发货，
    FINISH：订单完成，
    WAREHOUSE_REJECT：仓库拒绝收货，
    CLOSE：关闭
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，WAIT_ARRIVE_WAREHOUSE：待发货，
    CARGO_ARRIVE_WAREHOUSE：货物抵达仓库，
    CARGO_ENTER_WAREHOUSE：已入库，
    SHIPPED：已发货，
    FINISH：订单完成，
    WAREHOUSE_REJECT：仓库拒绝收货，
    CLOSE：关闭     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setStatus(String status) {
        this.status = status;
    }

    private String destinationCountryCode;

    /**
     * @return 目的国家代码，使用ISO 3166 2A
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * 设置目的国家代码，使用ISO 3166 2A     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    private String actualPayedTime;

    /**
     * @return 支付时间（ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）
     */
    public String getActualPayedTime() {
        return actualPayedTime;
    }

    /**
     * 设置支付时间（ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setActualPayedTime(String actualPayedTime) {
        this.actualPayedTime = actualPayedTime;
    }

    private String leavePortTime;

    /**
     * @return 离港时间（ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）
     */
    public String getLeavePortTime() {
        return leavePortTime;
    }

    /**
     * 设置离港时间（ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setLeavePortTime(String leavePortTime) {
        this.leavePortTime = leavePortTime;
    }

    private AlibabalogisticsexpressCommodity[] commoditys;

    /**
     * @return 商品信息
     */
    public AlibabalogisticsexpressCommodity[] getCommoditys() {
        return commoditys;
    }

    /**
     * 设置商品信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCommoditys(AlibabalogisticsexpressCommodity[] commoditys) {
        this.commoditys = commoditys;
    }

    private AlibabalogisticsexpressGoodsPackage originalGoodsPackage;

    /**
     * @return 原始货物包裹
     */
    public AlibabalogisticsexpressGoodsPackage getOriginalGoodsPackage() {
        return originalGoodsPackage;
    }

    /**
     * 设置原始货物包裹     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOriginalGoodsPackage(AlibabalogisticsexpressGoodsPackage originalGoodsPackage) {
        this.originalGoodsPackage = originalGoodsPackage;
    }

    private AlibabalogisticscommonMoney payableAmount;

    /**
     * @return 应付费用金额
     */
    public AlibabalogisticscommonMoney getPayableAmount() {
        return payableAmount;
    }

    /**
     * 设置应付费用金额     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPayableAmount(AlibabalogisticscommonMoney payableAmount) {
        this.payableAmount = payableAmount;
    }

    private AlibabalogisticsexpressContact consignee;

    /**
     * @return 收件人
     */
    public AlibabalogisticsexpressContact getConsignee() {
        return consignee;
    }

    /**
     * 设置收件人     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setConsignee(AlibabalogisticsexpressContact consignee) {
        this.consignee = consignee;
    }

    private AlibabalogisticscommonMoney estimatedCost;

    /**
     * @return 预估费用
     */
    public AlibabalogisticscommonMoney getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * 设置预估费用     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setEstimatedCost(AlibabalogisticscommonMoney estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    private AlibabalogisticsexpressLocalLogistics localLogistics;

    /**
     * @return 本地物流信息
     */
    public AlibabalogisticsexpressLocalLogistics getLocalLogistics() {
        return localLogistics;
    }

    /**
     * 设置本地物流信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setLocalLogistics(AlibabalogisticsexpressLocalLogistics localLogistics) {
        this.localLogistics = localLogistics;
    }

    private AlibabalogisticsexpressContact shipper;

    /**
     * @return 寄件人
     */
    public AlibabalogisticsexpressContact getShipper() {
        return shipper;
    }

    /**
     * 设置寄件人     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setShipper(AlibabalogisticsexpressContact shipper) {
        this.shipper = shipper;
    }

    private AlibabalogisticsexpressCustomsDeclarationInfo customsDeclarationInfo;

    /**
     * @return 报关信息
     */
    public AlibabalogisticsexpressCustomsDeclarationInfo getCustomsDeclarationInfo() {
        return customsDeclarationInfo;
    }

    /**
     * 设置报关信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCustomsDeclarationInfo(AlibabalogisticsexpressCustomsDeclarationInfo customsDeclarationInfo) {
        this.customsDeclarationInfo = customsDeclarationInfo;
    }

    private AlibabalogisticsexpressGoodsPackage actualGoodsPackage;

    /**
     * @return 实际货物包裹（仓库称重后）
     */
    public AlibabalogisticsexpressGoodsPackage getActualGoodsPackage() {
        return actualGoodsPackage;
    }

    /**
     * 设置实际货物包裹（仓库称重后）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setActualGoodsPackage(AlibabalogisticsexpressGoodsPackage actualGoodsPackage) {
        this.actualGoodsPackage = actualGoodsPackage;
    }

    private AlibabalogisticscommonMoney actualPayedAmount;

    /**
     * @return 实际支付费用
     */
    public AlibabalogisticscommonMoney getActualPayedAmount() {
        return actualPayedAmount;
    }

    /**
     * 设置实际支付费用     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setActualPayedAmount(AlibabalogisticscommonMoney actualPayedAmount) {
        this.actualPayedAmount = actualPayedAmount;
    }

    private AlibabalogisticsexpressUserActionTrace[] userActionTraces;

    /**
     * @return 用户操作行为轨迹
     */
    public AlibabalogisticsexpressUserActionTrace[] getUserActionTraces() {
        return userActionTraces;
    }

    /**
     * 设置用户操作行为轨迹     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setUserActionTraces(AlibabalogisticsexpressUserActionTrace[] userActionTraces) {
        this.userActionTraces = userActionTraces;
    }

    private AlibabalogisticsexpressLogisticsTrackTrace[] logisticsTrackTraces;

    /**
     * @return 物流跟踪信息（已经出运的订单才有）
     */
    public AlibabalogisticsexpressLogisticsTrackTrace[] getLogisticsTrackTraces() {
        return logisticsTrackTraces;
    }

    /**
     * 设置物流跟踪信息（已经出运的订单才有）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setLogisticsTrackTraces(AlibabalogisticsexpressLogisticsTrackTrace[] logisticsTrackTraces) {
        this.logisticsTrackTraces = logisticsTrackTraces;
    }

    private String paymentStatus;

    /**
     * @return 支付状态。NEW：不需要支付，WAIT_PAY：待支付，PAYED：已支付
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * 设置支付状态。NEW：不需要支付，WAIT_PAY：待支付，PAYED：已支付     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    private String closeType;

    /**
     * @return 订单关闭类型，只有当status为CLOSE时才有值。USER_CANCEL_ORDER：用户取消，USER_RETURN_ORDER：用户申请退货，LEAVE_WAREHOUSE_RETURN：出库退货
     */
    public String getCloseType() {
        return closeType;
    }

    /**
     * 设置订单关闭类型，只有当status为CLOSE时才有值。USER_CANCEL_ORDER：用户取消，USER_RETURN_ORDER：用户申请退货，LEAVE_WAREHOUSE_RETURN：出库退货     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCloseType(String closeType) {
        this.closeType = closeType;
    }

    private String closeReason;

    /**
     * @return 订单关闭原因，只有当status为CLOSE时才有值。
     */
    public String getCloseReason() {
        return closeReason;
    }

    /**
     * 设置订单关闭原因，只有当status为CLOSE时才有值。     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    private String warehouseRejectReason;

    /**
     * @return 仓库拒绝收货原因，只有当status为WAREHOUSE_REJECT时才有值。
     */
    public String getWarehouseRejectReason() {
        return warehouseRejectReason;
    }

    /**
     * 设置仓库拒绝收货原因，只有当status为WAREHOUSE_REJECT时才有值。     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setWarehouseRejectReason(String warehouseRejectReason) {
        this.warehouseRejectReason = warehouseRejectReason;
    }

    private String promptText;

    /**
     * @return 订单提示文本（如：请及时发货，如果仓库30天内未收到您的货物，物流订单将自动关闭。)
     */
    public String getPromptText() {
        return promptText;
    }

    /**
     * 设置订单提示文本（如：请及时发货，如果仓库30天内未收到您的货物，物流订单将自动关闭。)     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPromptText(String promptText) {
        this.promptText = promptText;
    }

    private String orderUrl;

    /**
     * @return 在阿里系统的订单详情URL
     */
    public String getOrderUrl() {
        return orderUrl;
    }

    /**
     * 设置在阿里系统的订单详情URL     *
     * 参数示例：<pre>http://shipping.alibaba.com/orderDetail.htm?id=xxxx</pre>     
     * 此参数必填
     */
    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    private AlibabalogisticsexpressExpressWTDSolution solution;

    /**
     * @return 方案
     */
    public AlibabalogisticsexpressExpressWTDSolution getSolution() {
        return solution;
    }

    /**
     * 设置方案     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSolution(AlibabalogisticsexpressExpressWTDSolution solution) {
        this.solution = solution;
    }

}
