package com.superyi.supermarket_springboot.model.dao;

import com.superyi.supermarket_springboot.model.entity.Bill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BillDao {
    List<Bill> findBill();

    /*int getTotalCount(Map<String, String[]> map);

    void deleteBillbyID(String id);

    Bill getBillbyID(String id);


    void updateBill(Bill bill);

    void addBill(Bill bill);*/
}
