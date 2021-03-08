package com.superyi.supermarket_springboot.controller;

import com.superyi.supermarket_springboot.model.entity.User;
import com.superyi.supermarket_springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Super-Yi
 * @create 2021/3/5
 **/
@Controller
public class LoginController {

    @Autowired
    AdminService adminService;

    @ResponseBody
    @PostMapping("/login")
    public User getAdmin(User user) {
        return adminService.getAdmin(user);
    }
}
