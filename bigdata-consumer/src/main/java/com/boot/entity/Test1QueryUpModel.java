package com.boot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Description:<描述>
 */
@Data
public class Test1QueryUpModel implements Serializable {
    private String source_code;

    public void setSource_code(String source_code) {
        this.source_code = source_code;
    }

    public String getSource_code() {
        return source_code;
    }

    public Test1QueryUpModel(String source_code) {
        this.source_code = source_code;
    }
}
