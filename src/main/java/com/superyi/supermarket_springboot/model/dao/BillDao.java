package com.superyi.supermarket_springboot.model.dao;

import com.superyi.supermarket_springboot.model.entity.Bill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BillDao {

    List<Bill> findBill();

    void addBill(Bill bill);

    void updateBill(Bill bill);

    Bill findBillById(Integer id);

    void deleteBillByID(Integer id);

    /*int getTotalCount(Map<String, String[]> map);



    Bill getBillbyID(String id);



    */
}
