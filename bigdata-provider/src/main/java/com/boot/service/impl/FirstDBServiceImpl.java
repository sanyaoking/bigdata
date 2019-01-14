package com.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.domain.BackData;
import com.boot.domain.Test1QueryDTO;
import com.boot.entity.Test1;
import com.boot.mapper.firstDB.FirstMapper;
import com.boot.service.FirstDBService;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Author:
 * Description:<描述>
 */
@Service(version = "1.0.0")
public class FirstDBServiceImpl implements FirstDBService {
    @Resource
    private FirstMapper firstMapper;

    @Override   //生成订单
    public BackData<Test1QueryDTO> sourceQuery(String source_code) {
        Test1QueryDTO test1QueryDTO = new Test1QueryDTO();

        try {

            //查询支付渠道信息
            HashMap<Object, Object> sourceinfo = new HashMap<>();
            sourceinfo.put("source_code", source_code);
            Test1 test1 = new Test1();
            test1 = firstMapper.selectBySourcecode(sourceinfo);
            test1QueryDTO.setId(test1.getId());
            test1QueryDTO.setSource_code(test1.getSource_code());
            test1QueryDTO.setSource_name(test1.getSource_name());
        } catch (Exception e) {

            return new BackData(50,e.getMessage());
        }

        return new BackData(0,"成功", test1QueryDTO);
    }
}
