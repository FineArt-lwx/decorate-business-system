package com.finearter.dbs.mapper;

import com.finearter.dbs.model.entity.Customer;
import org.apache.ibatis.annotations.Mapper;import java.util.ArrayList;

@Mapper
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    ArrayList<Customer> selectByName(String customerName);
}