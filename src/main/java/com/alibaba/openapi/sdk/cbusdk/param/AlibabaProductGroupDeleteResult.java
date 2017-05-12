package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductGroupDeleteResult {

    private Boolean isSuccess;

    /**
     * @return 删除是否成功
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * 设置删除是否成功     *
          
     * 此参数必填
     */
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    private String reason;

    /**
     * @return 删除不成功的原因描述
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置删除不成功的原因描述     *
          
     * 此参数必填
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

}
