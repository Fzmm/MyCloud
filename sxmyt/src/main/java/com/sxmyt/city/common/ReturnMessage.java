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
    private Object data;


    public ReturnMessage(Integer code, String message, boolean flag, Object data) {
        this.code = code;
        this.message = message;
        this.flag = flag;
        this.data = data;
    }

    public ReturnMessage(Object data) {
        this.code = 200;
        this.message = "ok";
        this.flag = true;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object date) {
        this.data = date;
    }

    @Override
    public String toString() {
        return "ReturnMessage{" +
                "code=" + code +
                ", message=" + message +
                ", flag=" + flag +
                ", date=" + data +
                '}';
    }
}
