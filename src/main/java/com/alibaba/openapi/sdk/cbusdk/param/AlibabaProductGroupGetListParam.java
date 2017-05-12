package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductGroupGetListParam {

    private Long groupID;

    /**
     * @return 分组ID
     */
    public Long getGroupID() {
        return groupID;
    }

    /**
     * 设置分组ID     *
     * 参数示例：<pre>如果传入分组ID，则返回该分组的所有子分组，如传入-1则返回所有一级分组</pre>     
     * 此参数必填
     */
    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    private String webSite;

    /**
     * @return 站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * 设置站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

}
