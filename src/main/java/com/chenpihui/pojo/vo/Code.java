package com.chenpihui.pojo.vo;

public enum Code {

    SUCCESS("0","成功"),
    ERROR("1","失败");
    private String code ;
    private String msg;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private Code(String code,String msg){
        this.setCode(code);
        this.setMsg(msg);
    }

    @Override
    public String toString() {
        return code;
    }
}
