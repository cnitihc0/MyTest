package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaLogisticsInternationalexpressWtdOrderGetListResult {

    private AlibabalogisticscommonError error;

    /**
     * @return 错误信息
     */
    public AlibabalogisticscommonError getError() {
        return error;
    }

    /**
     * 设置错误信息     *
          
     * 此参数必填
     */
    public void setError(AlibabalogisticscommonError error) {
        this.error = error;
    }

    private AlibabalogisticsexpressExpressWTDOrder[] orders;

    /**
     * @return 订单信息
     */
    public AlibabalogisticsexpressExpressWTDOrder[] getOrders() {
        return orders;
    }

    /**
     * 设置订单信息     *
          
     * 此参数必填
     */
    public void setOrders(AlibabalogisticsexpressExpressWTDOrder[] orders) {
        this.orders = orders;
    }

    private Boolean success;

    /**
     * @return 是否处理成功：true为成功，false为失败，失败原因见error
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * 设置是否处理成功：true为成功，false为失败，失败原因见error     *
          
     * 此参数必填
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    private Integer count;

    /**
     * @return 总记录数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置总记录数     *
          
     * 此参数必填
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    private Integer currentPage;

    /**
     * @return 当前页号
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置当前页号     *
          
     * 此参数必填
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    private Integer pageSize;

    /**
     * @return 每页记录数
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置每页记录数     *
          
     * 此参数必填
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
