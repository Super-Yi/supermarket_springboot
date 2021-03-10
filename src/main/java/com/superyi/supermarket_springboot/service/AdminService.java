package com.superyi.supermarket_springboot.service;

import com.superyi.supermarket_springboot.model.dao.AdminDao;
import com.superyi.supermarket_springboot.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Super-Yi
 **/
@Service
@Transactional
public class AdminService {

    @Autowired
    AdminDao adminDao;

    public User getAdmin(User user) {
        User admin = adminDao.getAdmin(user);
        System.out.println(admin.toString());
        return admin;
    }
}
