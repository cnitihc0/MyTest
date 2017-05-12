package com.heye.entity;

/**
 * Created by Administrator on 2017/4/25.
 */
public class Response {
    private String code = "0";
    private String message;

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {

        return code;
    }

    public String getMessage() {
        return message;
    }
}
