package com.example.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/success")
    public String login() {
        return "登录成功！";
    }

    @GetMapping("/r/r1")
    public String getUrl() {
        return "访问资源1";
    }
    @GetMapping("/r/r2")
    public String getUrl2() {
        return "访问资源2";
    }
}
