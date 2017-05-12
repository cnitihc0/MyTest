package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaPhotobankPhotoAddParam extends AlibabaBaseParam {

    public AlibabaPhotobankPhotoAddParam() {

        super("com.alibaba.product", "alibaba.photobank.photo.add", 1);

    }
    public AlibabaPhotobankPhotoAddParam(String namespace, String name, int version) {
        super(namespace, name, version);
    }

    private Long albumID;
    /**
     * @return 相册ID，1688必须传此参数，国际站可不传
     */
    public Long getAlbumID() {
        return albumID;
    }

    /**
     * 设置相册ID，1688必须传此参数，国际站可不传     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAlbumID(Long albumID) {
        this.albumID = albumID;
    }

    private String name;

    /**
     * @return 图片名称。最长30个中文字符
     */
    public String getName() {
        return name;
    }

    /**
     * 设置图片名称。最长30个中文字符     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setName(String name) {
        this.name = name;
    }

    private String description;

    /**
     * @return 图片描述。最长2000个中文字符
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置图片描述。最长2000个中文字符     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDescription(String description) {
        this.description = description;
    }

    private Boolean drawTxt;

    /**
     * @return 是否打上默认水印，国际站无需处理此字段
     */
    public Boolean getDrawTxt() {
        return drawTxt;
    }

    /**
     * 设置是否打上默认水印，国际站无需处理此字段     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDrawTxt(Boolean drawTxt) {
        this.drawTxt = drawTxt;
    }

    private byte[] imageBytes;

    /**
     * @return 图片的二进制数据，向服务端提交文件即可 (二进制文件数组 PHP 的话，用 base64_encode 转换 ，JAVA 是 通过 IOUtils.toByteArray 转换)
     */
    public byte[] getImageBytes() {
        return imageBytes;
    }

    /**
     * 设置图片的二进制数据，向服务端提交文件即可 (二进制文件数组 PHP 的话，用 base64_encode 转换 ，JAVA 是 通过 IOUtils.toByteArray 转换)     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
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
