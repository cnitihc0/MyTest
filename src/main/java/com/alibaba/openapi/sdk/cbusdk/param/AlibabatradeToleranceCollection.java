package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabatradeToleranceCollection {

    private String toleranceFreight;

    /**
     * @return 运费是否被容错. 0: 没有容错。 1：被容错.
     */
    public String getToleranceFreight() {
        return toleranceFreight;
    }

    /**
     * 设置运费是否被容错. 0: 没有容错。 1：被容错.     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setToleranceFreight(String toleranceFreight) {
        this.toleranceFreight = toleranceFreight;
    }

}
