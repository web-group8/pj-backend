package com.login.login.model;

/**
 * 向前端返回信息封装
 * @param <T> 可变类型
 */
public class Result {
    /**
     * 返回信息
     */
    private String msg;

    /**
     * 数据是否正常请求
     */
    private boolean success;

    /**
     * 具体返回的数据
     */

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
