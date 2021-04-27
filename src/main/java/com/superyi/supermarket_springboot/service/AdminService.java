package com.superyi.supermarket_springboot.service;

import com.superyi.supermarket_springboot.model.entity.User;

/**
 * @author hzy
 * @date 2021/4/8
 **/
public interface AdminService {
    User getAdmin(User user);
}
