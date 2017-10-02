package com.zhao.myfirstboot.entity;

/**
 * 人实体类
 * Created by zhaoxudong on 2017/9/27.
 */
public class People {

    private int id;
    private int cardId;
    private String name;
    private String school;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
