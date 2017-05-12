package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductAddResult extends AlibabaBaseResult {

    private Long productID;

    /**
     * @return 操作成功的情况下会返回商品ID
     */
    public Long getProductID() {
        return productID;
    }

    /**
     * 设置操作成功的情况下会返回商品ID     *
          
     * 此参数必填
     */
    public void setProductID(Long productID) {
        this.productID = productID;
    }

    private String errorMsg;

    /**
     * @return 错误返回信息
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置错误返回信息     *
          
     * 此参数必填
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
