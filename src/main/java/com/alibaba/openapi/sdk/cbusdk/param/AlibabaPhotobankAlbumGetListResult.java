package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaPhotobankAlbumGetListResult extends AlibabaBaseResult {

    private AlibabaphotobankphotoAlbumDomain[] albumInfos;

    /**
     * @return 相册信息
     */
    public AlibabaphotobankphotoAlbumDomain[] getAlbumInfos() {
        return albumInfos;
    }

    /**
     * 设置相册信息     *
          
     * 此参数必填
     */
    public void setAlbumInfos(AlibabaphotobankphotoAlbumDomain[] albumInfos) {
        this.albumInfos = albumInfos;
    }

    private String errorMsg;

    /**
     * @return 错误信息
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置错误信息     *
          
     * 此参数必填
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    private String errorCode;

    /**
     * @return 错误码
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置错误码     *
          
     * 此参数必填
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
