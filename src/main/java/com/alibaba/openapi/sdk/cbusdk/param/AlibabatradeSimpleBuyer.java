package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabatradeSimpleBuyer {

    private String memberId;

    /**
     * @return 会员memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设置会员memberId     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    private String name;

    /**
     * @return 会员名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置会员名字     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setName(String name) {
        this.name = name;
    }

    private Long userId;

    /**
     * @return userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置userId     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
