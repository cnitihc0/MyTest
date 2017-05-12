package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaCategoryGetResult extends AlibabaBaseResult {

    private AlibabacategoryCategoryInfo[] categoryInfo;

    /**
     * @return 类目列表
     */
    public AlibabacategoryCategoryInfo[] getCategoryInfo() {
        return categoryInfo;
    }

    /**
     * 设置类目列表     *
          
     * 此参数必填
     */
    public void setCategoryInfo(AlibabacategoryCategoryInfo[] categoryInfo) {
        this.categoryInfo = categoryInfo;
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
