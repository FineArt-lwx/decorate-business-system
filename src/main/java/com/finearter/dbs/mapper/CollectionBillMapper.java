package com.finearter.dbs.mapper;

import com.finearter.dbs.model.entity.CollectionBill;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectionBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CollectionBill record);

    int insertSelective(CollectionBill record);

    CollectionBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollectionBill record);

    int updateByPrimaryKey(CollectionBill record);
}