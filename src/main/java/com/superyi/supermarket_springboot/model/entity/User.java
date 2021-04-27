package com.superyi.supermarket_springboot.model.entity;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String userCode;
    private String userName;
    private String userPassword;
    private Integer gender;
    private String birthday;
    private String phone;
    private String address;
    private Integer userRole;
    private String creationDate;
}
