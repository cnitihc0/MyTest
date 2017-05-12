package com.taobao;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaOpenIbankProfileGetResponse;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/12.
 */
public class ItempropsGetRequest extends BaseTaobaoRequest<ItempropsGetResponse> {
    private Long cid;

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {

        return cid;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.itemprops.get";
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }

        return txtParams;
    }

    @Override
    public Class<ItempropsGetResponse> getResponseClass() {
        return ItempropsGetResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }
}
