package com.zhao.myfirstboot.controller;

import com.zhao.myfirstboot.entity.AopTest;
import com.zhao.myfirstboot.service.AopTestService;
import com.zhao.myfirstboot.util.RunnableThreadWebCount;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.el.ValueExpressionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Aop例子控制层
 * Created by zhaoxudong on 2017/10/1.
 */

@RestController
@RequestMapping(value = "/aoptest")
@Api(value = "AopTestController",description = "Aop例子")
public class AopTestController {

    @Autowired
    private AopTestService aopTestService;

    @ApiOperation(value = "保存操作",httpMethod = "POST")
    @RequestMapping(value = "/save")
    @ResponseBody
    public AopTest save(@RequestBody AopTest aopTest){

        return aopTestService.save(aopTest);
    }
}
