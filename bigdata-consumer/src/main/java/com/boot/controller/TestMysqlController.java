package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.domain.BackData;
import com.boot.entity.Test1QueryUpModel;
import com.boot.service.FirstDBService;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:<描述>
 */
@RestController
@RequestMapping("testMysqlController")
public class TestMysqlController {
    @Reference(version = "1.0.0")
    private FirstDBService firstDBService;

    @PostMapping("sourceQuery")  //查询订单
    public BackData sourceQuery(@RequestBody String data) {
        BackData backData=new BackData();
        try{
            Gson gson = new Gson();
            Test1QueryUpModel test1QueryUpModel = gson.fromJson(data, Test1QueryUpModel.class);

            backData=firstDBService.sourceQuery(test1QueryUpModel.getSource_code());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return backData;
    }

}
