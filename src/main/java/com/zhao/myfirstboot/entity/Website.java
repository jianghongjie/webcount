package com.zhao.myfirstboot.entity;

/**
 * 网站实体
 * Created by zhaoxudong on 2017/9/30.
 */
public class Website {
    private String url;//url

    private String ip;//访问ip

    private long count;//访问次数

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
