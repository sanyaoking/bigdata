package com.boot.service;

import com.boot.domain.BackData;
import com.boot.domain.Test1QueryDTO;

/**
 * Author:dy
 * Date:2019-01-13-20:00
 * Description:<描述>
 */
public interface FirstDBService {
    BackData<Test1QueryDTO> sourceQuery(String source_code);
}
