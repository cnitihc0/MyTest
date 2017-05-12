package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Alibabaassuranceflag {

    private Boolean pauseStatus;

    /**
     * @return 信保灭灯状态，true为灭灯，false为非灭灯
     */
    public Boolean getPauseStatus() {
        return pauseStatus;
    }

    /**
     * 设置信保灭灯状态，true为灭灯，false为非灭灯     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setPauseStatus(Boolean pauseStatus) {
        this.pauseStatus = pauseStatus;
    }

    private String[] flagList;

    /**
     * @return 若信保灭灯状态为false，返回四种flag html文本
     */
    public String[] getFlagList() {
        return flagList;
    }

    /**
     * 设置若信保灭灯状态为false，返回四种flag html文本     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setFlagList(String[] flagList) {
        this.flagList = flagList;
    }

    private String guideURL;

    /**
     * @return 若信保灭灯状态为true，返回引导url
     */
    public String getGuideURL() {
        return guideURL;
    }

    /**
     * 设置若信保灭灯状态为true，返回引导url     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setGuideURL(String guideURL) {
        this.guideURL = guideURL;
    }

}
