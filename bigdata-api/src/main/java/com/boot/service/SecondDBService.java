package com.boot.service;

import com.boot.domain.BackData;
import com.boot.domain.TestQueryDTO;

/**
 * Author:dy
 * Date:2019-01-13-20:00
 * Description:<描述>
 */
public interface SecondDBService {
    BackData<TestQueryDTO> bankQuery(String id);
}
