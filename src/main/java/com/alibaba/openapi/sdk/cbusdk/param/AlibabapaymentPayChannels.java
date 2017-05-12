package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabapaymentPayChannels {

    private AlibabapaymentPayChannel[] availbleChannels;

    /**
     * @return 可选支付渠道
     */
    public AlibabapaymentPayChannel[] getAvailbleChannels() {
        return availbleChannels;
    }

    /**
     * 设置可选支付渠道     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAvailbleChannels(AlibabapaymentPayChannel[] availbleChannels) {
        this.availbleChannels = availbleChannels;
    }

    private AlibabapaymentPayChannel defaultSelected;

    /**
     * @return 默认已选支付渠道
     */
    public AlibabapaymentPayChannel getDefaultSelected() {
        return defaultSelected;
    }

    /**
     * 设置默认已选支付渠道     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDefaultSelected(AlibabapaymentPayChannel defaultSelected) {
        this.defaultSelected = defaultSelected;
    }

}
