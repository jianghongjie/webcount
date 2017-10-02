package com.zhao.myfirstboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoxudong on 2017/9/22.
 */

@RestController
@RequestMapping(value = "/main")
@Api(value = "MainController",description = "maincontroller接口")
public class MainController {

    @ApiOperation(value = "首页接口",httpMethod = "GET")
    @RequestMapping(value = "/index")
    @ResponseBody
    public String index(){
        return "hello springboot";
    }
}
