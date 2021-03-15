package com.superyi.supermarket_springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.superyi.supermarket_springboot.model.entity.Bill;
import com.superyi.supermarket_springboot.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Super-Yi
 * @date 2021/3/12
 **/
@Controller
@RequestMapping("/bill")
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping("/list")
    public String billList(Model model,
                           @RequestParam(defaultValue = "1") Integer pageNum) {
        PageHelper.startPage(pageNum, 5);
        List<Bill> bills = billService.findBill();
        PageInfo<Bill> billPageInfo = new PageInfo<>(bills);
        model.addAttribute("bills", billPageInfo);
        return "bill/bill_list";
    }
}
