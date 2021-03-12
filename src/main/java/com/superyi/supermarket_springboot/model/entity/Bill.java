package com.superyi.supermarket_springboot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    private int id;
    private String billCode;
    private String productName;
    private String productDesc;
    private String productUnit;
    private Integer productCount;
    private Integer totalPrice;
    private Integer isPayment;
    private String creationDate;
    private Integer providerId;
    private String proName;
}
