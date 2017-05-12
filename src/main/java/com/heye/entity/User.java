package com.heye.entity;

/**
 * Created by Administrator on 2017/4/25.
 */
public class User {
    private String userId;
    private String userName;
    private String realName;

    public User() {
    }

    public User(String userId, String userName, String realName) {
        this.userId = userId;
        this.userName = userName;
        this.realName = realName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserId() {

        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }
}
