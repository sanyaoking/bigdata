package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.domain.BackData;
import com.boot.entity.TestQueryUpModel;
import com.boot.service.SecondDBService;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:<描述>
 */
@RestController
@RequestMapping("testSqlServerController")
public class TestSqlServerController {
    @Reference(version = "1.0.0")
    private SecondDBService secondDBService;

    @PostMapping("bankQuery")
    public BackData bankQuery(@RequestBody String data) {
        BackData backData=new BackData();
        try{
            Gson gson = new Gson();
            TestQueryUpModel testQueryUpModel = gson.fromJson(data, TestQueryUpModel.class);

            backData= secondDBService.bankQuery(testQueryUpModel.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return backData;
    }

}