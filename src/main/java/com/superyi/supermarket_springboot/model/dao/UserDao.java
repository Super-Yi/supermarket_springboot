package com.superyi.supermarket_springboot.model.dao;

import com.superyi.supermarket_springboot.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author hzy
 * @date 2021/4/13
 **/
@Mapper
public interface UserDao {

    List<User> findUser();
}
