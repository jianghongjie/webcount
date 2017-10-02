package com.zhao.myfirstboot.controller;

import com.zhao.myfirstboot.util.RunnableThreadWebCount;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
/**
 * 网站访问控制层
 * Created by zhaoxudong on 2017/9/30.
 */
@RestController
@RequestMapping(value = "/border/website")
@Api(value = "WebsiteController" ,description = "网站访问")
public class WebsiteController {

    @ApiOperation(value = "count", httpMethod = "GET")
    @RequestMapping(value = "/count")
    @ResponseBody
    public int count(@RequestParam("key") String key) {
        return RunnableThreadWebCount.addCount(key);
    }
}
