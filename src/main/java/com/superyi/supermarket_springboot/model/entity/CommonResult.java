package com.superyi.supermarket_springboot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hzy
 * @date 2021/4/19
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private String msg;
    private int code = 500;
    private T data;

    private CommonResult(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public static CommonResult fail(String msg, int code) {
        return new CommonResult(msg, code);
    }
}
