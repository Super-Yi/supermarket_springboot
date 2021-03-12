package com.superyi.supermarket_springboot.service;

import com.superyi.supermarket_springboot.model.dao.BillDao;
import com.superyi.supermarket_springboot.model.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Super-Yi
 * @date 2021/3/12
 **/
@Service
@Transactional
public class BillService {
    @Autowired
    BillDao billDao;

    public List<Bill> findBill() {
        return billDao.findBill();
    }
}
