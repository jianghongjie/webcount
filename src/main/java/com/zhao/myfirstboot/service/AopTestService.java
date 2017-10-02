package com.zhao.myfirstboot.service;

import com.zhao.myfirstboot.entity.AopTest;
import org.springframework.stereotype.Service;

/**
 * Aop例子服务层
 * Created by zhaoxudong on 2017/10/1.
 */
@Service
public class AopTestService {
    public AopTest save(AopTest aopTest){
        aopTest.setRemark("aop实体备注");
        return aopTest;
    }
}
