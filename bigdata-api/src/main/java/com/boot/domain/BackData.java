package com.boot.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Author:
 * Description:<描述>
 */
@Data
public class BackData<T> implements Serializable {
    private Integer errcode;
    private String errmessage;
    private T data;

    public BackData(Integer errcode,String errmessage,T data)
    {
        this();
        this.errcode=errcode;
        this.errmessage=errmessage;
        this.data=data;
    }

    public BackData(Integer errcode,String errmessage)
    {
        this();
        this.errcode=errcode;
        this.errmessage=errmessage;
        this.data=null;
    }

    public BackData(T data){
        this();
        this.data=data;
    }

    public BackData(){
        this.errcode=0;
        this.errmessage="成功";
    }

}
