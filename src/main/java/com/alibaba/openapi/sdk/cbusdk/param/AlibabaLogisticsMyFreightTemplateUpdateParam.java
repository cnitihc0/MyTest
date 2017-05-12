package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaLogisticsMyFreightTemplateUpdateParam {

    private AlibabaopenplatformlogisticsDeliveryTemplateDTO mainTemplate;

    /**
     * @return 主运费模板，必填。必填字段：id（主模板id），name（模板名称），remark（备注），fromAreaCode（发货区编码），addressCodeText（发货区编码对应文本，以空格分割）
     */
    public AlibabaopenplatformlogisticsDeliveryTemplateDTO getMainTemplate() {
        return mainTemplate;
    }

    /**
     * 设置主运费模板，必填。必填字段：id（主模板id），name（模板名称），remark（备注），fromAreaCode（发货区编码），addressCodeText（发货区编码对应文本，以空格分割）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMainTemplate(AlibabaopenplatformlogisticsDeliveryTemplateDTO mainTemplate) {
        this.mainTemplate = mainTemplate;
    }

    private AlibabaopenplatformlogisticsDeliverySubTemplateDTO expressSubTemplate;

    /**
     * @return 快递子模板基本信息（必填）。必填字段：id(子模板id),chargeType（1:按重量计价，1-按件数，2-按体积），serviceChargeType（0-卖家承担运费，1-买家承担运费），operateType（操作类型，只能填UPDATE或不填，因为快递模板是必须的）
     */
    public AlibabaopenplatformlogisticsDeliverySubTemplateDTO getExpressSubTemplate() {
        return expressSubTemplate;
    }

    /**
     * 设置快递子模板基本信息（必填）。必填字段：id(子模板id),chargeType（1:按重量计价，1-按件数，2-按体积），serviceChargeType（0-卖家承担运费，1-买家承担运费），operateType（操作类型，只能填UPDATE或不填，因为快递模板是必须的）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setExpressSubTemplate(AlibabaopenplatformlogisticsDeliverySubTemplateDTO expressSubTemplate) {
        this.expressSubTemplate = expressSubTemplate;
    }

    private AlibabaopenplatformlogisticsDeliveryRateDetailDTO[] expressSubRateList;

    /**
     * @return 快递子模板的费率设置（必填）。第一个设置针对全国的费率，后面的看情况针对个别省份。必填字段见示例（INSERT时可以不填），注意id填费率id，operateType不填则默认UPDATE（其余为INSERT，DELETE）。
     */
    public AlibabaopenplatformlogisticsDeliveryRateDetailDTO[] getExpressSubRateList() {
        return expressSubRateList;
    }

    /**
     * 设置快递子模板的费率设置（必填）。第一个设置针对全国的费率，后面的看情况针对个别省份。必填字段见示例（INSERT时可以不填），注意id填费率id，operateType不填则默认UPDATE（其余为INSERT，DELETE）。     *
     * 参数示例：<pre>[
    {
        "toAreaCodeText": "全国",
        "operateType": "INSERT",
        "rateDTO": {
            "firstUnit": 10,
            "firstUnitFee": 20,
            "nextUnit": 15,
            "nextUnitFee": 25,
            "toAreaCodeList": [
                "1"
            ]
        }
    },
    {
        "toAreaCodeText": "上海、福建省、广东省",
        "operateType": "DELETE",
        "rateDTO": {
            "id": 3456789,
            "firstUnit": 10,
            "firstUnitFee": 20,
            "nextUnit": 15,
            "nextUnitFee": 25,
            "toAreaCodeList": [
                "310000",
                "350000",
                "440000"
            ]
        },
        {
            "toAreaCodeText": "江苏省",
            "operateType": "UPDATE",
            "rateDTO": {
                "id": 9876551,
                "firstUnit": 10,
                "firstUnitFee": 20,
                "nextUnit": 15,
                "nextUnitFee": 25,
                "toAreaCodeList": [
                    "320000"
                ]
            }
        }
    ]</pre>     
     * 此参数必填
     */
    public void setExpressSubRateList(AlibabaopenplatformlogisticsDeliveryRateDetailDTO[] expressSubRateList) {
        this.expressSubRateList = expressSubRateList;
    }

    private AlibabaopenplatformlogisticsDeliverySubTemplateDTO cashSubTemplate;

    /**
     * @return 货到付款子模板基本信息（可不填）。若需要则必填字段：id(子模板id，INSERT时可以不填),chargeType（1:按重量计价，1-按件数，2-按体积），serviceChargeType（0-卖家承担运费，1-买家承担运费），operateType（INSERT，UPDATE，DELETE，不填默认UPDATE）
     */
    public AlibabaopenplatformlogisticsDeliverySubTemplateDTO getCashSubTemplate() {
        return cashSubTemplate;
    }

    /**
     * 设置货到付款子模板基本信息（可不填）。若需要则必填字段：id(子模板id，INSERT时可以不填),chargeType（1:按重量计价，1-按件数，2-按体积），serviceChargeType（0-卖家承担运费，1-买家承担运费），operateType（INSERT，UPDATE，DELETE，不填默认UPDATE）     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCashSubTemplate(AlibabaopenplatformlogisticsDeliverySubTemplateDTO cashSubTemplate) {
        this.cashSubTemplate = cashSubTemplate;
    }

    private AlibabaopenplatformlogisticsDeliveryRateDetailDTO[] cashSubRateList;

    /**
     * @return 货到付款子模板的费率设置（若cashSubTemplate为空，则此字段亦无效）。第一个设置针对全国的费率，后面的看情况针对个别省份。必填字段见示例，注意id是费率id（INSERT时可不填），operateType不填默认UPDATE（其他还有INSERT，DELETE）
     */
    public AlibabaopenplatformlogisticsDeliveryRateDetailDTO[] getCashSubRateList() {
        return cashSubRateList;
    }

    /**
     * 设置货到付款子模板的费率设置（若cashSubTemplate为空，则此字段亦无效）。第一个设置针对全国的费率，后面的看情况针对个别省份。必填字段见示例，注意id是费率id（INSERT时可不填），operateType不填默认UPDATE（其他还有INSERT，DELETE）     *
     * 参数示例：<pre>[
    {
        "toAreaCodeText": "全国",
        "operateType": "INSERT",
        "rateDTO": {
            "firstUnit": 10,
            "firstUnitFee": 20,
            "nextUnit": 15,
            "nextUnitFee": 25,
            "toAreaCodeList": [
                "1"
            ]
        }
    },
    {
        "toAreaCodeText": "上海、福建省、广东省",
        "operateType": "DELETE",
        "rateDTO": {
            "id": 3456789,
            "firstUnit": 10,
            "firstUnitFee": 20,
            "nextUnit": 15,
            "nextUnitFee": 25,
            "toAreaCodeList": [
                "310000",
                "350000",
                "440000"
            ]
        },
        {
            "toAreaCodeText": "江苏省",
            "operateType": "UPDATE",
            "rateDTO": {
                "id": 9876551,
                "firstUnit": 10,
                "firstUnitFee": 20,
                "nextUnit": 15,
                "nextUnitFee": 25,
                "toAreaCodeList": [
                    "320000"
                ]
            }
        }
    ]</pre>     
     * 此参数必填
     */
    public void setCashSubRateList(AlibabaopenplatformlogisticsDeliveryRateDetailDTO[] cashSubRateList) {
        this.cashSubRateList = cashSubRateList;
    }

}
