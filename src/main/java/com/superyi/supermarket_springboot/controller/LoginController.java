package com.superyi.supermarket_springboot.controller;

import com.superyi.supermarket_springboot.model.entity.User;
import com.superyi.supermarket_springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author Super-Yi
 * @create 2021/3/5
 **/
@Controller
public class LoginController {

    @Autowired
    AdminService adminService;

    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String getAdmin(User user, HttpSession session, Model model) {
        if (!ObjectUtils.isEmpty(user.getUserCode()) && !ObjectUtils.isEmpty(user.getUserPassword())) {
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "账号密码错误");
            return "login";
        }
    }
}
