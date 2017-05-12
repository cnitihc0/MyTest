package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductAddParam extends AlibabaBaseParam {
    public AlibabaProductAddParam() {
        super("com.alibaba.product", "alibaba.product.add", 1);
    }
    public AlibabaProductAddParam(String namespace, String name, int version) {
        super(namespace, name, version);
    }

    private String productType;

    /**
     * @return 商品类型，在线批发商品(wholesale)或者询盘商品(sourcing)，1688网站缺省为wholesale
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置商品类型，在线批发商品(wholesale)或者询盘商品(sourcing)，1688网站缺省为wholesale     *
     * 参数示例：<pre>wholesale</pre>     
     * 此参数必填
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    private Long categoryID;

    /**
     * @return 类目ID，由相应类目API获取
     */
    public Long getCategoryID() {
        return categoryID;
    }

    /**
     * 设置类目ID，由相应类目API获取     *
     * 参数示例：<pre>123456</pre>     
     * 此参数必填
     */
    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    private AlibabaproductProductAttribute[] attributes;

    /**
     * @return 商品属性和属性值
     */
    public AlibabaproductProductAttribute[] getAttributes() {
        return attributes;
    }

    /**
     * 设置商品属性和属性值     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAttributes(AlibabaproductProductAttribute[] attributes) {
        this.attributes = attributes;
    }

    private long[] groupID;

    /**
     * @return 分组ID，确定商品所属分组。1688可传入多个分组ID，国际站同一个商品只能属于一个分组，因此默认只取第一个
     */
    public long[] getGroupID() {
        return groupID;
    }

    /**
     * 设置分组ID，确定商品所属分组。1688可传入多个分组ID，国际站同一个商品只能属于一个分组，因此默认只取第一个     *
     * 参数示例：<pre>123456</pre>     
     * 此参数必填
     */
    public void setGroupID(long[] groupID) {
        this.groupID = groupID;
    }

    private String subject;

    /**
     * @return 商品标题，最多128个字符。标题内容将被系统切分作为关键字，因此API将不再单独提供关键字字段。
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置商品标题，最多128个字符。标题内容将被系统切分作为关键字，因此API将不再单独提供关键字字段。     *
     * 参数示例：<pre>新款女装 立领套头毛衫</pre>     
     * 此参数必填
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String description;

    /**
     * @return 商品详情描述，可包含图片中心的图片URL
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置商品详情描述，可包含图片中心的图片URL     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDescription(String description) {
        this.description = description;
    }

    private String language;

    /**
     * @return 语种，参见FAQ 语种枚举值，1688网站默认传入CHINESE
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置语种，参见FAQ 语种枚举值，1688网站默认传入CHINESE     *
     * 参数示例：<pre>ENGLISH</pre>     
     * 此参数必填
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    private Integer periodOfValidity;

    /**
     * @return 信息有效期，按天计算，国际站可不填
     */
    public Integer getPeriodOfValidity() {
        return periodOfValidity;
    }

    /**
     * 设置信息有效期，按天计算，国际站可不填     *
     * 参数示例：<pre>200</pre>     
     * 此参数必填
     */
    public void setPeriodOfValidity(Integer periodOfValidity) {
        this.periodOfValidity = periodOfValidity;
    }

    private Integer bizType;

    /**
     * @return 业务类型。1：商品，2：加工，3：代理，4：合作，5：商务服务；不传入默认按照商品发布；国际站按默认商品。
     */
    public Integer getBizType() {
        return bizType;
    }

    /**
     * 设置业务类型。1：商品，2：加工，3：代理，4：合作，5：商务服务；不传入默认按照商品发布；国际站按默认商品。     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    private Boolean pictureAuth;

    /**
     * @return 是否图片私密信息，国际站此字段无效
     */
    public Boolean getPictureAuth() {
        return pictureAuth;
    }

    /**
     * 设置是否图片私密信息，国际站此字段无效     *
     * 参数示例：<pre>true</pre>     
     * 此参数必填
     */
    public void setPictureAuth(Boolean pictureAuth) {
        this.pictureAuth = pictureAuth;
    }

    private AlibabaproductProductImageInfo image;

    /**
     * @return 商品主图
     */
    public AlibabaproductProductImageInfo getImage() {
        return image;
    }

    /**
     * 设置商品主图     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setImage(AlibabaproductProductImageInfo image) {
        this.image = image;
    }

    private AlibabaproductProductSKUInfo[] skuInfos;

    /**
     * @return SKU信息，这里可传入多组信息
     */
    public AlibabaproductProductSKUInfo[] getSkuInfos() {
        return skuInfos;
    }

    /**
     * 设置SKU信息，这里可传入多组信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSkuInfos(AlibabaproductProductSKUInfo[] skuInfos) {
        this.skuInfos = skuInfos;
    }

    private AlibabaproductProductSaleInfo saleInfo;

    /**
     * @return 商品销售信息
     */
    public AlibabaproductProductSaleInfo getSaleInfo() {
        return saleInfo;
    }

    /**
     * 设置商品销售信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setSaleInfo(AlibabaproductProductSaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    private AlibabaproductProductShippingInfo shippingInfo;

    /**
     * @return 商品物流信息
     */
    public AlibabaproductProductShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    /**
     * 设置商品物流信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setShippingInfo(AlibabaproductProductShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    private AlibabaproductProductInternationalTradeInfo internationalTradeInfo;

    /**
     * @return 商品国际贸易信息，1688无需处理此字段
     */
    public AlibabaproductProductInternationalTradeInfo getInternationalTradeInfo() {
        return internationalTradeInfo;
    }

    /**
     * 设置商品国际贸易信息，1688无需处理此字段     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setInternationalTradeInfo(AlibabaproductProductInternationalTradeInfo internationalTradeInfo) {
        this.internationalTradeInfo = internationalTradeInfo;
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
