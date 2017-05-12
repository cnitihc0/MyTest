package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductGroupSetSwitchResult {

    private Boolean isSuccess;

    /**
     * @return 是否设置成功，true设置成功，false设置失败
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * 设置是否设置成功，true设置成功，false设置失败     *
          
     * 此参数必填
     */
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
