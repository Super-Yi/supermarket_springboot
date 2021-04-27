package com.superyi.supermarket_springboot.model.entity;


import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    @Excel(name = "id")
    private Integer id;
    @Excel(name = "编号")
    private String billCode;
    @Excel(name = "商品名")
    private String productName;
    @Excel(name = "单位")
    private String productUnit;
    @Excel(name = "数量")
    private String productCount;
    @Excel(name = "总量")
    private Integer totalPrice;
    @Excel(name = "是否付款")
    private Integer isPayment;
    @Excel(name = "创建时间")
    private String creationDate;
    @Excel(name = "供货商id")
    private Integer providerId;
    @Excel(name = "供货商名称")
    private String proName;

}
