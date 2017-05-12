package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductGroupAddParam {

    private String name;

    /**
     * @return 分组名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分组名称     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setName(String name) {
        this.name = name;
    }

    private Long parentID;

    /**
     * @return 上级分组ID，如果建立顶级分组设为-1
     */
    public Long getParentID() {
        return parentID;
    }

    /**
     * 设置上级分组ID，如果建立顶级分组设为-1     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setParentID(Long parentID) {
        this.parentID = parentID;
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
