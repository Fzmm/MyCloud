package com.sxmyt.city.common;/**
 * @title:
 * @projectName sxmyt
 * @description: 统一返回对象
 * @author fzm
 * @date 2019/5/723:09
 */

import java.io.Serializable;

/**
 *@author fzm
 *@date 2019/5/7
 */
public class ReturnMessage implements Serializable {

    /**
     * 编码code
     */
    private Integer code;

    /***
     * 返回消息
     */
    private String message;

    /**
     * 是否正确
     */
    private boolean flag;

    /***
     * 数据
     */
    private Object date;


    public ReturnMessage(Integer code, String message, boolean flag, Object date) {
        this.code = code;
        this.message = message;
        this.flag = flag;
        this.date = date;
    }

    public ReturnMessage(Object date) {
        this.code = 200;
        this.message = "ok";
        this.flag = true;
        this.date = date;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ReturnMessage{" +
                "code=" + code +
                ", message=" + message +
                ", flag=" + flag +
                ", date=" + date +
                '}';
    }
}
