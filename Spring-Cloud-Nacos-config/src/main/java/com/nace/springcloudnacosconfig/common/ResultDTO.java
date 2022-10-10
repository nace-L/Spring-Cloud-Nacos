package com.nace.springcloudnacosconfig.common;

import java.io.Serializable;

public class ResultDTO<T> implements Serializable {

    private int code;

    private T data;

    private String msg;

    public ResultDTO() {
    }

    public ResultDTO(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public ResultDTO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> ResultDTO<T> ok(){
        return new ResultDTO(200,"success");
    }
    public static <T> ResultDTO<T> ok(T data){
        return new ResultDTO(200,data,"success");
    }
    public static <T> ResultDTO<T> ok(T data,String msg){
        return new ResultDTO(200,data,msg);
    }
    public static <T> ResultDTO<T> failed(String msg){
        return new ResultDTO(500,msg);
    }
    public static <T> ResultDTO<T> failed(int code,String msg){
        return new ResultDTO(code,msg);
    }
    public static <T> ResultDTO<T> failed(int code,T data,String msg){
        return new ResultDTO(code,data,msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
