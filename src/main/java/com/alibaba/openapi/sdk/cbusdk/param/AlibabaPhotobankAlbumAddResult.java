package com.alibaba.openapi.sdk.cbusdk.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaPhotobankAlbumAddResult {

    private Long albumID;

    /**
     * @return 相册ID
     */
    public Long getAlbumID() {
        return albumID;
    }

    /**
     * 设置相册ID     *
          
     * 此参数必填
     */
    public void setAlbumID(Long albumID) {
        this.albumID = albumID;
    }

    private String errCode;

    /**
     * @return 错误编码
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 设置错误编码     *
          
     * 此参数必填
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    private String errMsg;

    /**
     * @return 错误信息
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * 设置错误信息     *
          
     * 此参数必填
     */
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

}
