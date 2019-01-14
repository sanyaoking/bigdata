package com.boot.mapper.secondDB;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boot.entity.Test;

import java.util.HashMap;

/**
 * Description:<描述>
 */

public interface SecondMapper extends BaseMapper<Test> {
    Test selectByBankId(HashMap<Object, Object> hm);
}