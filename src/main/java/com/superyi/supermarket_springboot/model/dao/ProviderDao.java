package com.superyi.supermarket_springboot.model.dao;

import com.superyi.supermarket_springboot.model.entity.Provider;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface ProviderDao {
    List<Provider> findProvider();

/*    int getTotalCount(Map<String, String[]> map);

    void deleteProviderbyID(String id);

    Provider  (String id);

    void updateProvider(Provider provider);

    void addProvider(Provider provider);

    List<Provider> findPro();*/
}
