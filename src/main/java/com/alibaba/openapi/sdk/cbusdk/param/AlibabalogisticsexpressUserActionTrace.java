package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabalogisticsexpressUserActionTrace {

    private String eventDesc;

    /**
     * @return 事件说明，备注
     */
    public String getEventDesc() {
        return eventDesc;
    }

    /**
     * 设置事件说明，备注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    private String eventValue;

    /**
     * @return 事件Value（保留，暂时没有值）
     */
    public String getEventValue() {
        return eventValue;
    }

    /**
     * 设置事件Value（保留，暂时没有值）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setEventValue(String eventValue) {
        this.eventValue = eventValue;
    }

    private String eventCode;

    /**
     * @return 事件代码
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * 设置事件代码     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    private String eventName;

    /**
     * @return 事件名称
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * 设置事件名称     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    private String eventTime;

    /**
     * @return 事件时间(ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）
     */
    public String getEventTime() {
        return eventTime;
    }

    /**
     * 设置事件时间(ISO 8601 GMT/UTC，例：2004-05-03T17:30:08+08:00）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

}
