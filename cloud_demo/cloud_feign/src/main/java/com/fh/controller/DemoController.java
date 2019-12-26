package com.fh.controller;

import com.fh.service.DemoFeignService;
import com.fh.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {
    /*@Resource
    DemoFeignService demoFeignService;
 
    @RequestMapping(value="/test", produces = "application/json;charset=utf-8")
    public String test() {
        return demoFeignService.test("test");
    }
 
    @RequestMapping(value="/user", produces = "application/json;charset=utf-8")
    public User user() {
        User user = new User();
        *//*user.setAge(10);
        user.setName("你好");*//*
        return demoFeignService.user(user);
    }*/
}