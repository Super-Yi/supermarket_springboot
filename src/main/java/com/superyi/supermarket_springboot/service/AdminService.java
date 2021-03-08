package com.superyi.supermarket_springboot.service;

import com.superyi.supermarket_springboot.model.dao.AdminDao;
import com.superyi.supermarket_springboot.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Super-Yi
 * @create 2021/3/5
 **/
@Service
public class AdminService {

    @Autowired
    AdminDao adminDao;

    public User getAdmin(User user) {
        return adminDao.getAdmin(user);
    }
}
