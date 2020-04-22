package com.finearter.dbs.service.impl;


import com.finearter.dbs.mapper.CustomerMapper;
import com.finearter.dbs.mapper.UserMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Customer;
import com.finearter.dbs.model.entity.User;
import com.finearter.dbs.model.vo.CustomerVo;
import com.finearter.dbs.service.CustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerMapper customerMapper;

    @Resource
    private UserMapper userMapper;

    @Override
    public ResultDto selectByName(String customerName,Integer pageIndex,Integer pageSize) {

//        ArrayList<Customer> customers = customerMapper.selectByName(customerName);


        Customer condition=new Customer();
        condition.setCustomerName(customerName);
        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<Customer> customers = customerMapper.selectByAnyCondition(condition);
        ArrayList<CustomerVo> customerVos=new ArrayList<>();
        for(Customer customer:customers){
            CustomerVo customerVo = customerConvertCustomerVo(customer);
            customerVos.add(customerVo);
        }
        PageInfo pageInfo=new PageInfo(customers);
        pageInfo.setList(customerVos);
        ResultDto resultDto = new ResultDto();
        resultDto.setData(pageInfo);
//        resultDto.setData(customers);

        return resultDto;
    }

    @Override
    public ResultDto selectAll(Integer pageIndex,Integer pageSize) {

        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<Customer> customers=customerMapper.selectByAnyCondition(new Customer());

        ArrayList<CustomerVo> customerVos=new ArrayList<>();

        for(Customer customer:customers){
            CustomerVo customerVo=customerConvertCustomerVo(customer);
            customerVos.add(customerVo);

        }


        PageInfo pageInfo=new PageInfo(customers);
        pageInfo.setList(customerVos);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(pageInfo);
        return resultDto;
    }

    private CustomerVo customerConvertCustomerVo(Customer customer) {
        CustomerVo customerVo=new CustomerVo();
        User user = userMapper.selectByPrimaryKey(customer.getEmployeeId());
        customerVo.setUser(user);

        customerVo.setCustomerName(customer.getCustomerName());
        customerVo.setCustomerIdNum(customer.getCustomerIdNum());
        customerVo.setCustomerSex(customer.getCustomerSex());
        customerVo.setId(customer.getId());
        customerVo.setPhoneNum(customer.getPhoneNum());
        customerVo.setCustomerAddress(customer.getCustomerAddress());
        return customerVo;
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

    @Override
    public ResultDto addCustomer(Customer customer) {

        int insert = customerMapper.insert(customer);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(insert);
        return resultDto;
    }

    @Override
    public ResultDto deleteById(Integer id) {
        int i = customerMapper.deleteByPrimaryKey(id);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(i);
        return resultDto;
    }

    @Override
    public ResultDto updateById(Customer customer) {
        int i = customerMapper.updateByPrimaryKey(customer);

        ResultDto resultDto=new ResultDto();
        resultDto.setData(i);
        return resultDto;
    }
}



