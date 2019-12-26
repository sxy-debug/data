package com.fh.entity;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author 孙新宇
 * @Date 2019/12/11 14:40
 * @Version 1.0
 **/
public class User implements Serializable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {}

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
