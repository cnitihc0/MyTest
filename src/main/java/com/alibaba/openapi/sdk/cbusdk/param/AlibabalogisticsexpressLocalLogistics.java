package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabalogisticsexpressLocalLogistics {

    private String[] logisticsNumbers;

    /**
     * @return 国内物流单号
     */
    public String[] getLogisticsNumbers() {
        return logisticsNumbers;
    }

    /**
     * 设置国内物流单号     *
     * 参数示例：<pre>1324，13445</pre>     
     * 此参数必填
     */
    public void setLogisticsNumbers(String[] logisticsNumbers) {
        this.logisticsNumbers = logisticsNumbers;
    }

    private String logisticsCompany;

    /**
     * @return 国内物流公司，EMS：EMS，
    Yuantong Express：圆通速递，
    ZTO Express：中通速递，
    SHENTONG Express：申通速递，
    YUNDA：韵达快运，
    TTKExpress(TianTianExpress)：天天快递，
    S.F.Express：顺丰速运，
    FedEx：联邦快递，
    ZJS Express：宅急送，
    EBON Express：一邦速递，
    CRE(ZhongTIEExpress)：中铁快运，
    Deppon Express：德邦物流，
    HT Express：汇通快运，
    CNEX Express：佳吉快运，
    Stars Express：星晨急便，
    CCES：CCES，
    OTHERS：其它
     */
    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    /**
     * 设置国内物流公司，EMS：EMS，
    Yuantong Express：圆通速递，
    ZTO Express：中通速递，
    SHENTONG Express：申通速递，
    YUNDA：韵达快运，
    TTKExpress(TianTianExpress)：天天快递，
    S.F.Express：顺丰速运，
    FedEx：联邦快递，
    ZJS Express：宅急送，
    EBON Express：一邦速递，
    CRE(ZhongTIEExpress)：中铁快运，
    Deppon Express：德邦物流，
    HT Express：汇通快运，
    CNEX Express：佳吉快运，
    Stars Express：星晨急便，
    CCES：CCES，
    OTHERS：其它     *
     * 参数示例：<pre>YUNDA</pre>     
     * 此参数必填
     */
    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    private Integer packageQuantity;

    /**
     * @return 包裹数量
     */
    public Integer getPackageQuantity() {
        return packageQuantity;
    }

    /**
     * 设置包裹数量     *
     * 参数示例：<pre>3</pre>     
     * 此参数必填
     */
    public void setPackageQuantity(Integer packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

}
