package com.fh.service;

import com.fh.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface IDemoApi {
    /**
     * 入参为字段，返回值为字段
     */
    @RequestMapping(value="/api/test", method= RequestMethod.GET)
    String test(@RequestParam(value = "test") String test);
    /**
     * 入参为对象，返回值为对象
     */
    @RequestMapping(value="/api/user", method=RequestMethod.POST)
    User user(@RequestBody User user);
}