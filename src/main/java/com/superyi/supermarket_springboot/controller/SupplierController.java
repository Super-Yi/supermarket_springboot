package com.superyi.supermarket_springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.superyi.supermarket_springboot.model.entity.Provider;
import com.superyi.supermarket_springboot.service.SupplierService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hzy
 * @date 2021/4/13
 **/
@Controller
@RequestMapping("/supplier")
@Slf4j
public class SupplierController {
    @Resource
    SupplierService supplierService;

    @GetMapping("/list")
    public String findSupplierList(Model model,
                                   @RequestParam(defaultValue = "1") Integer pageNum) {
        PageHelper.startPage(pageNum, 5);
        List<Provider> providers = supplierService.findProvider();
        PageInfo<Provider> ProviderPageInfo = new PageInfo<>(providers);
        model.addAttribute("providers", ProviderPageInfo);
        return "supplier/provider_list";
    }



}
