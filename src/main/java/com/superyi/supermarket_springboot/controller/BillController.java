package com.superyi.supermarket_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Super-Yi
 * @date 2021/3/12
 **/
@Controller
@RequestMapping("/bill")
public class BillController {

    @GetMapping("/list")
    public String billList() {
        return "bill/bill_list";
    }
}
