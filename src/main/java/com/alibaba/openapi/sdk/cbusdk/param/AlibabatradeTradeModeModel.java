package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabatradeTradeModeModel {

    private Boolean canModifyTradeMode;

    /**
     * @return 是否能够修改交易方式
     */
    public Boolean getCanModifyTradeMode() {
        return canModifyTradeMode;
    }

    /**
     * 设置是否能够修改交易方式     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCanModifyTradeMode(Boolean canModifyTradeMode) {
        this.canModifyTradeMode = canModifyTradeMode;
    }

    private Alibabatradetrademode curSelectedTradeMode;

    /**
     * @return 默认选择交易模型
     */
    public Alibabatradetrademode getCurSelectedTradeMode() {
        return curSelectedTradeMode;
    }

    /**
     * 设置默认选择交易模型     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCurSelectedTradeMode(Alibabatradetrademode curSelectedTradeMode) {
        this.curSelectedTradeMode = curSelectedTradeMode;
    }

    private Alibabatradetrademode[] tradeModes;

    /**
     * @return 可选交易模型
     */
    public Alibabatradetrademode[] getTradeModes() {
        return tradeModes;
    }

    /**
     * 设置可选交易模型     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTradeModes(Alibabatradetrademode[] tradeModes) {
        this.tradeModes = tradeModes;
    }

}
