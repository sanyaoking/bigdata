package com.boot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Description:<描述>
 */
@Data
public class TestQueryUpModel implements Serializable {
    private String id;

    public String getId() {
        return id;
    }
}
