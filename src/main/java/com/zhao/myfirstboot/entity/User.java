package com.zhao.myfirstboot.entity;

/**
 * 用户
 * Created by zhaoxudong on 2017/9/29.
 */
public class User {
    private String username;//用户名
    private String password;//密码
    private int key;//邀请码

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
