package com.inttom.commmon;

import lombok.Data;

import java.io.Serializable;

/**
 * 结果集封装工具类，便于前后台数据的交互
 *
 * @author inttom
 * @date 2021/6/5
 */

@Data
public class Result implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode("200");
        result.setMsg("操作成功");
        result.setData(data);
        return result;
    }

    public static Result success(String msg, Object data) {
        Result result = new Result();
        result.setCode("200");
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setCode("400");
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    public static Result error(String msg, Object data) {
        Result result = new Result();
        result.setCode("400");
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

}