package com.zhao.myfirstboot.controller;

import com.zhao.myfirstboot.entity.People;
import com.zhao.myfirstboot.service.PeopleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * People控制层
 * Created by zhaoxudong on 2017/9/27.
 */
@RestController
@RequestMapping("/border/people")
@Api(value = "PeopleController" ,description = "People信息")
public class PeopleController {

    @Autowired
    PeopleService peopleService;

    /**
     * 列表显示
     */
    @ApiOperation(value = "列表",httpMethod = "GET")
    @RequestMapping(value = "index")
    @ResponseBody
    public List<People> index(){
        return peopleService.index();
    }
}
