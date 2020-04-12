package com.finearter.dbs.service;

import com.finearter.dbs.model.dto.ResultDto;import com.finearter.dbs.model.entity.Customer;

public interface CustomerService {


    ResultDto selectByName(String customerName);

    ResultDto selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}


