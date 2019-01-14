package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.domain.User;
import com.boot.service.TestDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:<描述>
 */
@RestController
@RequestMapping("/")
public class TestController {
    @Reference(version = "1.0.0")
    private TestDataService testDataService;

    @GetMapping("hello")
    public String hello() {
        return testDataService.sayHello("Hello springboot and dubbo!");
    }

    @GetMapping("user")
    public User user() {
        return testDataService.findUser();
    }
}
