package com.fh.controller;

import com.fh.service.IDemoApi;
import com.fh.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author 孙新宇
 * @Date 2019/12/11 14:43
 * @Version 1.0
 **/

@RestController
public class UserController implements IDemoApi {
    @Override
    public String test(String test) {
        return "test: " + test;
    }

    @Override
    public User user(@RequestBody User user) {
        if (user == null) {
            user = new User(10, "嘻嘻");
        }
        return user;
    }
}
