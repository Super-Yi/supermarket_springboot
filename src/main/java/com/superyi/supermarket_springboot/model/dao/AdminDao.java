package com.superyi.supermarket_springboot.model.dao;

import com.superyi.supermarket_springboot.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminDao {

    User getAdmin(User user);

    /*User CheckNameCode(String code);

    void updateUser(User user);

    int getTotalCount(Map<String, String[]> map);

    List<User> findUser(int start, int rows, Map<String, String[]> map);

    List<User> getUser(String name);

    User getUserbyID(String id);

    void deleteUserbyID(String id);

    void addUser(User user);

    void updatePassword(String password, int id);*/
}
