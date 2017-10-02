package com.zhao.myfirstboot.controller;

import com.zhao.myfirstboot.entity.User;
import com.zhao.myfirstboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制层
 * Created by zhaoxudong on 2017/9/29.
 */
@RestController
@RequestMapping("/border/user")
@Api(value = "UserController" ,description = "用户操作")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     */
    @ApiOperation(value = "用户登录",httpMethod = "GET")
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(@RequestBody User user){
        User loginresult=userService.login(user);
        if(null==loginresult){
            return "error";
        }
        return "success";
    }


}
