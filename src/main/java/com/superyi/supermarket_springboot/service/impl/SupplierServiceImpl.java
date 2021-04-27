package com.superyi.supermarket_springboot.service.impl;

import com.superyi.supermarket_springboot.model.dao.ProviderDao;
import com.superyi.supermarket_springboot.model.entity.Provider;
import com.superyi.supermarket_springboot.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hzy
 * @date 2021/4/13
 **/
@Service
public class SupplierServiceImpl implements SupplierService {

    @Resource
    ProviderDao providerDao;

    @Override
    public List<Provider> findProvider() {
        return providerDao.findProvider();
    }
}
