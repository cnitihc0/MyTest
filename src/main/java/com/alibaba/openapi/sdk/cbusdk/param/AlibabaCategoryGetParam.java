package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaCategoryGetParam extends AlibabaBaseParam{
    public AlibabaCategoryGetParam() {
        super("com.alibaba.product", "alibaba.category.get", 1);
    }
    public AlibabaCategoryGetParam(String namespace, String name, int version) {
        super(namespace, name, version);
    }

    private Long categoryID;

    /**
     * @return 类目id,必须大于等于0， 如果为0，则查询所有一级类目
     */
    public Long getCategoryID() {
        return categoryID;
    }

    /**
     * 设置类目id,必须大于等于0， 如果为0，则查询所有一级类目     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
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
