package com.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.domain.BackData;
import com.boot.domain.TestQueryDTO;
import com.boot.entity.Test;
import com.boot.mapper.secondDB.SecondMapper;
import com.boot.service.SecondDBService;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Author:
 * Description:<描述>
 */
@Service(version = "1.0.0")
public class SecondDBServiceImpl implements SecondDBService {
    @Resource
    private SecondMapper secondMapper;

    @Override   //生成订单
    public BackData<TestQueryDTO> bankQuery(String id) {
        TestQueryDTO testQueryDTO = new TestQueryDTO();

        try {

            HashMap<Object, Object> bankinfo = new HashMap<>();
            bankinfo.put("id", id);
            Test test = new Test();
            test = secondMapper.selectByBankId(bankinfo);
            testQueryDTO.setId(test.getId());
            testQueryDTO.setBankname(test.getBankname());
        } catch (Exception e) {

            return new BackData(50,e.getMessage());
        }

        return new BackData(0,"成功", testQueryDTO);
    }
}
