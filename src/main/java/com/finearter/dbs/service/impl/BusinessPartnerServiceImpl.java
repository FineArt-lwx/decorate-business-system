package com.finearter.dbs.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finearter.dbs.model.entity.BusinessPartner;
import com.finearter.dbs.mapper.BusinessPartnerMapper;
import com.finearter.dbs.service.BusinessPartnerService;
@Service
public class BusinessPartnerServiceImpl implements BusinessPartnerService{

    @Resource
    private BusinessPartnerMapper businessPartnerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return businessPartnerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BusinessPartner record) {
        return businessPartnerMapper.insert(record);
    }

    @Override
    public int insertSelective(BusinessPartner record) {
        return businessPartnerMapper.insertSelective(record);
    }

    @Override
    public BusinessPartner selectByPrimaryKey(Integer id) {
        return businessPartnerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessPartner record) {
        return businessPartnerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BusinessPartner record) {
        return businessPartnerMapper.updateByPrimaryKey(record);
    }

}
