package com.superyi.supermarket_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Super-Yi
 * @date 2021/3/8
 **/
@Controller
public class IndexController {

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }
}
