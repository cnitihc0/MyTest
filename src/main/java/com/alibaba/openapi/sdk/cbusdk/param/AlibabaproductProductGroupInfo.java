package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaproductProductGroupInfo {

    private Long id;

    /**
     * @return 商品分组信息
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置商品分组信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setId(Long id) {
        this.id = id;
    }

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
     * @return 上级分组ID，如果当前为顶级分组则此值为-1
     */
    public Long getParentID() {
        return parentID;
    }

    /**
     * 设置上级分组ID，如果当前为顶级分组则此值为-1     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setParentID(Long parentID) {
        this.parentID = parentID;
    }

}
