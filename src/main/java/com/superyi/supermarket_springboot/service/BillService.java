package com.superyi.supermarket_springboot.service;

import com.superyi.supermarket_springboot.model.entity.Bill;

import java.util.List;

/**
 * @author hzy
 * @date 2021/4/8
 **/
public interface BillService {
    List<Bill> findBill();

    void addBill(Bill bill);

    void update(Bill bill);

    Bill findBillById(Integer id);

    void deleteBill(Integer id);
}
