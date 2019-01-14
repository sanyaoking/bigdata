package com.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.domain.User;
import com.boot.service.TestDataService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:dy
 * Date:2019-01-12-9:47
 * Description:<描述>
 */
@Service(version = "1.0.0")
public class TestDataServiceImpl implements TestDataService {

    @Override
    public String sayHello(String str) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date()) + ": " + str;
    }

    @Override
    public User findUser() {
        User user = new User();
        user.setId(1001);
        user.setUsername("zhangsan");
        user.setPassword("zhangsan");
        user.setAge(20);
        user.setGender(0);
        return user;
    }
}
