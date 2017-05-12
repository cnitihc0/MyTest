package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaopenplatformlogisticsDeliveryTemplateDTO {

    private String addressCodeText;

    /**
     * @return 地址区域编码对应的文本（包括省市区，必须用空格隔开。最后一个地区的行政区编码就是fromAreaCode字段的值）
     */
    public String getAddressCodeText() {
        return addressCodeText;
    }

    /**
     * 设置地址区域编码对应的文本（包括省市区，必须用空格隔开。最后一个地区的行政区编码就是fromAreaCode字段的值）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAddressCodeText(String addressCodeText) {
        this.addressCodeText = addressCodeText;
    }

    private String fromAreaCode;

    /**
     * @return 发货区编码，使用国家行政区代码
     */
    public String getFromAreaCode() {
        return fromAreaCode;
    }

    /**
     * 设置发货区编码，使用国家行政区代码     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setFromAreaCode(String fromAreaCode) {
        this.fromAreaCode = fromAreaCode;
    }

    private Long id;

    /**
     * @return 主模板id，更新模板时该字段必填
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主模板id，更新模板时该字段必填     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setId(Long id) {
        this.id = id;
    }

    private String memberId;

    /**
     * @return 会员memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设置会员memberId     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    private String name;

    /**
     * @return 模板名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置模板名称     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setName(String name) {
        this.name = name;
    }

    private String remark;

    /**
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Integer status;

    /**
     * @return 状态：1表示有效，-1表示失效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：1表示有效，-1表示失效     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
