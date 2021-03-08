package com.superyi.supermarket_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Super-Yi
 * @create 2021/3/8
 **/
@Controller
public class IndexController {

    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }
}
