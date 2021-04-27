package com.superyi.supermarket_springboot.exception;

import com.superyi.supermarket_springboot.model.entity.CommonResult;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hzy
 * @date 2021/4/19
 **/
//@RestControllerAdvice
public class GlobelException {
    //@ExceptionHandler(Throwable.class)
    public CommonResult handleThrowable(Throwable e, HttpServletRequest request) {
        CommonResult error =CommonResult.fail("系统异常", 500);
        //log.error("URL:{} ,系统异常: ",request.getRequestURI(), e);
        return error;
    }
}
