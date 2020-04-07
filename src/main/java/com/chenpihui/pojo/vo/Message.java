package com.chenpihui.pojo.vo;

import java.io.Serializable;

public class Message<T> implements Serializable {

    private static final long serialVersionUID = -2539073549604514779L;
    private String code;
    private String msg;
    private T data;

    public static <T> Message<T> success(T data){
        return new Message<T>(Code.SUCCESS,data);
    }
    public static <T> Message<String> success(){
        return success("SUCCESS");
    }

    public static <T> Message<T> error(T data){
        return new Message<T>(Code.ERROR,data);
    }
    public static Message<String> error(){
        return error("FAIL");
    }

    public Message() {
        super();
    }
    public Message(Code code) {
        super();
        this.setCode(code.getCode());
        this.setMsg(code.getMsg());
    }

    public Message(Code code, String msg) {
        super();
        this.setCode(code.getCode());
        this.setMsg(msg);
    }

    public Message(Code code, T data) {
        super();
        this.setCode(code.getCode());
        this.setMsg(code.getMsg());
        this.setData(data);
    }
    public Message(String code, String msg, T data) {
        super();
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }
    public Message(String code, String msg) {
        super();
        this.setCode(code);
        this.setMsg(msg);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String msgCode) {
        this.code = msgCode;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
