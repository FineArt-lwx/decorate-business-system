package com.finearter.dbs.service.impl;


import com.finearter.dbs.mapper.CustomerMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Customer;
import com.finearter.dbs.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public ResultDto selectByName(String customerName) {

//        ArrayList<Customer> customers = customerMapper.selectByName(customerName);

        Customer customer=new Customer();
        customer.setCustomerName(customerName);
        ArrayList<Customer> customers = customerMapper.selectByAnyCondition(customer);
        ResultDto resultDto = new ResultDto();
        resultDto.setData(customers);
//        resultDto.setData(customers);

        return resultDto;
    }

    @Override
    public ResultDto selectAll() {
        ArrayList<Customer> customers=customerMapper.selectByAnyCondition(new Customer());

        ResultDto resultDto=new ResultDto();
        resultDto.setData(customers);
        return resultDto;
    }





    @Override
    public int deleteByPrimaryKey(Integer id) {
        return customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Customer record) {
        return customerMapper.insert(record);
    }

    @Override
    public int insertSelective(Customer record) {
        return customerMapper.insertSelective(record);
    }

    @Override
    public Customer selectByPrimaryKey(Integer id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return customerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return customerMapper.updateByPrimaryKey(record);
    }
}



