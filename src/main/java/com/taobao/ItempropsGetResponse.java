package com.taobao;

import com.taobao.api.TaobaoResponse;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/12.
 */
public class ItempropsGetResponse extends TaobaoResponse {
    private Date last_modified;

    public void setLast_modified(Date last_modified) {
        this.last_modified = last_modified;
    }

    public Date getLast_modified() {

        return last_modified;
    }
}
