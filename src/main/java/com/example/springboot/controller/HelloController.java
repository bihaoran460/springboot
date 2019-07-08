package com.example.springboot.controller;

import com.example.springboot.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }
    @RequestMapping("getUser")
    public User getUser(){
        User user=new User();
        user.setUsername("bihaoran");
        user.setPassword("123456");
        return user;
    }


}
