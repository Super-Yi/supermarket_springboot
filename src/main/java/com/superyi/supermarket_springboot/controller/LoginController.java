package com.superyi.supermarket_springboot.controller;

import com.superyi.supermarket_springboot.model.entity.User;
import com.superyi.supermarket_springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Super-Yi
 * @create 2021/3/5
 **/
@Controller
public class LoginController {

    @Autowired
    AdminService adminService;

    @PostMapping("/login")
    public void getAdmin(User user) {
        System.out.println(user.toString());
        //return adminService.getAdmin(user);
    }
}
