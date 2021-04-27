package com.superyi.supermarket_springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.superyi.supermarket_springboot.model.entity.User;
import com.superyi.supermarket_springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hzy
 * @date 2021/4/13
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/list")
    public String findSupplierList(Model model,
                                   @RequestParam(defaultValue = "1") Integer pageNum) {
        PageHelper.startPage(pageNum, 5);
        List<User> users = userService.findUser();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        model.addAttribute("users", userPageInfo);
        return "user/user_list";
    }
}
