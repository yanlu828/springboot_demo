package com.silverdawn.mybatis.vo;

public class ResultVo {
    private String message = "ok";
    private String code = "0";
    private Object data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultVo() {
    }

    public ResultVo(String message, String code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }
}
