package com.superyi.supermarket_springboot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String userCode;
    private String userName;
    private String userPassword;
    private int gender;
    private String birthday;
    private String phone;
    private String address;
    private int userRole;
    private String creationDate;
}
