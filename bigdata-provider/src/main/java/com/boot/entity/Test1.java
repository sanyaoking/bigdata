package com.boot.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:<描述>
 */
@Data
@TableName("source")
public class Test1 implements Serializable {
    @TableId("id")
    private Integer id;

    @TableField("source_name")
    private String source_name;

    @TableField("source_code")
    private String source_code;

    @TableField("source_desc")
    private String source_desc;

    @TableField("is_show")
    private Integer is_show;

    @TableField("source_user")
    private String source_user;

    @TableField("source_phone")
    private String source_phone;

    @TableField("source_address")
    private String source_address;

    @TableField("add_time")
    private Date add_time;

    @TableField("is_check")
    private Integer is_check;

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

    public String getSource_desc() {
        return source_desc;
    }

    public void setSource_desc(String source_desc) {
        this.source_desc = source_desc;
    }

    public Integer getIs_show() {
        return is_show;
    }

    public void setIs_show(Integer is_show) {
        this.is_show = is_show;
    }

    public String getSource_user() {
        return source_user;
    }

    public void setSource_user(String source_user) {
        this.source_user = source_user;
    }

    public String getSource_phone() {
        return source_phone;
    }

    public void setSource_phone(String source_phone) {
        this.source_phone = source_phone;
    }

    public String getSource_address() {
        return source_address;
    }

    public void setSource_address(String source_address) {
        this.source_address = source_address;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public Integer getIs_check() {
        return is_check;
    }

    public void setIs_check(Integer is_check) {
        this.is_check = is_check;
    }
}
