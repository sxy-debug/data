package com.fh.service;

import com.fh.entity.User;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoServiceFallback
 * @Description TODO
 * @Author 孙新宇
 * @Date 2019/12/11 14:48
 * @Version 1.0
 **/
//@Component
public class DemoServiceFallback implements DemoFeignService {
    @Override
    public String test(String test) {
        return "error";
    }

    @Override
    public User user(User user) {
        return null;
    }
}
