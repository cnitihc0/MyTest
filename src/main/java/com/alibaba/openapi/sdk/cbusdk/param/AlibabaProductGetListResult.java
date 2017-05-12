package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductGetListResult {

    private AlibabaproductProductInfo[] productInfos;

    /**
     * @return 商品列表
     */
    public AlibabaproductProductInfo[] getProductInfos() {
        return productInfos;
    }

    /**
     * 设置商品列表     *
          
     * 此参数必填
     */
    public void setProductInfos(AlibabaproductProductInfo[] productInfos) {
        this.productInfos = productInfos;
    }

    private Integer count;

    /**
     * @return 总条数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置总条数     *
          
     * 此参数必填
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    private Integer currentPage;

    /**
     * @return 当前页
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置当前页     *
          
     * 此参数必填
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    private Integer pageSize;

    /**
     * @return 每页大小
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置每页大小     *
          
     * 此参数必填
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    private String errorMsg;

    /**
     * @return 错误信息
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置错误信息     *
          
     * 此参数必填
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
