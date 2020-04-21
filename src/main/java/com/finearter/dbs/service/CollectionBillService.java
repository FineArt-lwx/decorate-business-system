package com.finearter.dbs.service;

import com.finearter.dbs.model.entity.CollectionBill;

public interface CollectionBillService {


    int deleteByPrimaryKey(Integer id);

    int insert(CollectionBill record);

    int insertSelective(CollectionBill record);

    CollectionBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollectionBill record);

    int updateByPrimaryKey(CollectionBill record);

}

