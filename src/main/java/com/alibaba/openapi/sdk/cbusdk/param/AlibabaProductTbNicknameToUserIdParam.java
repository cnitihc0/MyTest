package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductTbNicknameToUserIdParam {

    private String nickname;

    /**
     * @return 淘宝登录名
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置淘宝登录名     *
     * 参数示例：<pre>yqq002</pre>     
     * 此参数必填
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
