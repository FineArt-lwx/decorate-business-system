package com.finearter.dbs.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finearter.dbs.mapper.CollectionBillMapper;
import com.finearter.dbs.model.entity.CollectionBill;
import com.finearter.dbs.service.CollectionBillService;
@Service
public class CollectionBillServiceImpl implements CollectionBillService{

    @Resource
    private CollectionBillMapper collectionBillMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return collectionBillMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CollectionBill record) {
        return collectionBillMapper.insert(record);
    }

    @Override
    public int insertSelective(CollectionBill record) {
        return collectionBillMapper.insertSelective(record);
    }

    @Override
    public CollectionBill selectByPrimaryKey(Integer id) {
        return collectionBillMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CollectionBill record) {
        return collectionBillMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CollectionBill record) {
        return collectionBillMapper.updateByPrimaryKey(record);
    }

}
