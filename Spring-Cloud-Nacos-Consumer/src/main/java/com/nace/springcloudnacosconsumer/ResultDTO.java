package com.nace.springcloudnacosconsumer;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultDTO<T> implements Serializable {

    private T data;
    private String msg;
    private Integer code;

    public ResultDTO() {
    }

    public ResultDTO(T data, String msg, Integer code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    public static ResultDTO ok(){
        return new ResultDTO(null,"success",200);
    }

    public static <T> ResultDTO<T> ok(T data){
        return new ResultDTO(data,"success",200);
    }

    public static ResultDTO failed(){
        return new ResultDTO(null,"failed",500);
    }

    public static ResultDTO failed(String msg){
        return new ResultDTO(null,msg,500);
    }

    public static ResultDTO failed(String msg, Integer code){
        return new ResultDTO(null,msg,code);
    }
}
