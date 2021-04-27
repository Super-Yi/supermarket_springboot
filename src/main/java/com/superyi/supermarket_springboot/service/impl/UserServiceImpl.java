package com.superyi.supermarket_springboot.service.impl;

import com.superyi.supermarket_springboot.model.dao.UserDao;
import com.superyi.supermarket_springboot.model.entity.User;
import com.superyi.supermarket_springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hzy
 * @date 2021/4/13
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> findUser() {
        return userDao.findUser();
    }
}
