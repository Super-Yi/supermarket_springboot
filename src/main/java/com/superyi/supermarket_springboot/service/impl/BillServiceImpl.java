package com.superyi.supermarket_springboot.service.impl;

import com.superyi.supermarket_springboot.model.dao.BillDao;
import com.superyi.supermarket_springboot.model.entity.Bill;
import com.superyi.supermarket_springboot.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Super-Yi
 * @date 2021/3/12
 **/
@Service
@Transactional
public class BillServiceImpl implements BillService {
    @Resource
    BillDao billDao;

    public List<Bill> findBill() {
        return billDao.findBill();
    }

    public void addBill(Bill bill) {
        billDao.addBill(bill);
    }

    @Override
    public void update(Bill bill) {
        billDao.updateBill(bill);
    }

    @Override
    public Bill findBillById(Integer id) {
        return billDao.findBillById(id);
    }

    @Override
    public void deleteBill(Integer id) {
        billDao.deleteBillByID(id);
    }


}
