package com.zhao.myfirstboot.entity;

import java.util.Date;

/**
 * Created by zhaoxudong on 2017/10/1.
 */
public class AopTest {
    private int id;
    private Date credate;//创建时间
    private String creuser;//创建人
    private String remark;//备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCredate() {
        return credate;
    }

    public void setCredate(Date credate) {
        this.credate = credate;
    }

    public String getCreuser() {
        return creuser;
    }

    public void setCreuser(String creuser) {
        this.creuser = creuser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
