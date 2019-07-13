package com.pinyougou.entity;

import java.io.Serializable;

/**
 * web返回结果对象
 */
public class Result implements Serializable {
    private boolean success;  //执行结果,true为成功,false为失败
    private String message;  //返回结果消息
    private Object data;  //返回数据

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Result(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
