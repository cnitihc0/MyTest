package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaPhotobankPhotoGetListParam {

    private Long albumID;

    /**
     * @return 相册ID
     */
    public Long getAlbumID() {
        return albumID;
    }

    /**
     * 设置相册ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAlbumID(Long albumID) {
        this.albumID = albumID;
    }

    private Integer pageNo;

    /**
     * @return 页码。取值范围:大于零的整数;默认值为1，即返回第一页数据
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * 设置页码。取值范围:大于零的整数;默认值为1，即返回第一页数据     *
     * 参数示例：<pre>5</pre>     
     * 此参数必填
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    private Integer pageSize;

    /**
     * @return 返回列表结果集每页条数。取值范围:大于零的整数;最大值：30
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置返回列表结果集每页条数。取值范围:大于零的整数;最大值：30     *
     * 参数示例：<pre>20</pre>     
     * 此参数必填
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
