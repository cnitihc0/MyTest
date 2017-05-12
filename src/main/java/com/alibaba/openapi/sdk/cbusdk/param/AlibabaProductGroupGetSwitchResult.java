package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductGroupGetSwitchResult {

    private Boolean switchValue;

    /**
     * @return true：已开启；false：未开启
     */
    public Boolean getSwitchValue() {
        return switchValue;
    }

    /**
     * 设置true：已开启；false：未开启     *
          
     * 此参数必填
     */
    public void setSwitchValue(Boolean switchValue) {
        this.switchValue = switchValue;
    }

}
