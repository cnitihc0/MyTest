package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaLogisticsFreightTemplateGetListResult {

    private AlibabashippingFreightTemplateInfo[] freightTemplates;

    /**
     * @return 运费模板列表
     */
    public AlibabashippingFreightTemplateInfo[] getFreightTemplates() {
        return freightTemplates;
    }

    /**
     * 设置运费模板列表     *
          
     * 此参数必填
     */
    public void setFreightTemplates(AlibabashippingFreightTemplateInfo[] freightTemplates) {
        this.freightTemplates = freightTemplates;
    }

    private String errorCode;

    /**
     * @return 错误编码
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置错误编码     *
          
     * 此参数必填
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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
