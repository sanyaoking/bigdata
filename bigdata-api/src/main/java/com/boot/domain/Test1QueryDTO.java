package com.boot.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:<描述>
 */
@Data
public class Test1QueryDTO implements Serializable {
    private Integer id;
    private String source_name;
    private String source_code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getSource_code() {
        return source_code;
    }

    public void setSource_code(String source_code) {
        this.source_code = source_code;
    }
}

