package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaLogisticsInternationalexpressWtdOrderCancelResult {

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

}
