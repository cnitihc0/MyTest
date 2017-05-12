package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabalogisticsexpressPackageItem {

    private BigDecimal weight;

    /**
     * @return 重量，限制条件参照：http://service.alibaba.com/supplier/faq_detail/13840826.htm?id=13840826
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置重量，限制条件参照：http://service.alibaba.com/supplier/faq_detail/13840826.htm?id=13840826     *
     * 参数示例：<pre>2.34</pre>     
     * 此参数必填
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    private BigDecimal height;

    /**
     * @return 高，限制条件参照：http://service.alibaba.com/supplier/faq_detail/13840826.htm?id=13840826
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * 设置高，限制条件参照：http://service.alibaba.com/supplier/faq_detail/13840826.htm?id=13840826     *
     * 参数示例：<pre>2.34</pre>     
     * 此参数必填
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    private String packageType;

    /**
     * @return 包装类型，box：纸箱
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * 设置包装类型，box：纸箱     *
     * 参数示例：<pre>box</pre>     
     * 此参数必填
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    private BigDecimal width;

    /**
     * @return 宽，限制条件参照：http://service.alibaba.com/supplier/faq_detail/13840826.htm?id=13840826
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * 设置宽，限制条件参照：http://service.alibaba.com/supplier/faq_detail/13840826.htm?id=13840826     *
     * 参数示例：<pre>2.34</pre>     
     * 此参数必填
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    private BigDecimal length;

    /**
     * @return 长，限制条件参照：http://service.alibaba.com/supplier/faq_detail/13840826.htm?id=13840826
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * 设置长，限制条件参照：http://service.alibaba.com/supplier/faq_detail/13840826.htm?id=13840826     *
     * 参数示例：<pre>2.34</pre>     
     * 此参数必填
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    private Integer quantity;

    /**
     * @return 数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置数量     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
