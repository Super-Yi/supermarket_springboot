package com.superyi.supermarket_springboot.service;

import com.superyi.supermarket_springboot.model.entity.Provider;

import java.util.List;

/**
 * @author hzy
 * @date 2021/4/13
 **/
public interface SupplierService {

    List<Provider> findProvider();
}
