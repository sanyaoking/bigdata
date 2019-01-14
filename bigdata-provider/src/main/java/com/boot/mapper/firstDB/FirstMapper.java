package com.boot.mapper.firstDB;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boot.entity.Test1;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

/**
 * Description:<描述>
 */
@Mapper
public interface FirstMapper extends BaseMapper<Test1> {
    Test1 selectBySourcecode(HashMap<Object, Object> hm);
}