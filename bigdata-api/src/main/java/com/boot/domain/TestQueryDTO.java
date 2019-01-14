package com.boot.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Description:<描述>
 */

@Data
public class TestQueryDTO implements Serializable {
    private Integer id;
    private String bankname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
}
