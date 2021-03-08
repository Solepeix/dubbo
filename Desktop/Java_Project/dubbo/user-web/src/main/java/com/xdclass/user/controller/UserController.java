package com.xdclass.user.controller;

import com.xdclass.user.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(){

        return userService.sayHello();

    }
}
