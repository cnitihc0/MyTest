package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaPhotobankAlbumGetListParam extends AlibabaBaseParam {

    public AlibabaPhotobankAlbumGetListParam() {
        super("com.alibaba.product", "alibaba.photobank.album.getList", 1);
    }
    public AlibabaPhotobankAlbumGetListParam(String namespace, String name, int version) {
        super(namespace, name, version);
    }

    /**
     * MY:我的相册(系统相册); OFF:下架相册(系统相册); AUDTING:审核中(系统相册); NOPASS:审核不通过(系统相册); CUSTOM:自定义;
     */
    private String albumType;

    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    public String getAlbumType() {

        return albumType;
    }

    private Long id;

    /**
     * @return 如传入相册ID，1688返回当前相册信息，国际站返回当前相册及下级信息。如不传此参数，1688返回所有相册信息列表，国际站返回所有一级相册列表
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置如传入相册ID，1688返回当前相册信息，国际站返回当前相册及下级信息。如不传此参数，1688返回所有相册信息列表，国际站返回所有一级相册列表     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setId(Long id) {
        this.id = id;
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
