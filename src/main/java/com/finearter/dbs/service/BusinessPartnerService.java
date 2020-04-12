package com.finearter.dbs.service;

import com.finearter.dbs.model.entity.BusinessPartner;
public interface BusinessPartnerService{


    int deleteByPrimaryKey(Integer id);

    int insert(BusinessPartner record);

    int insertSelective(BusinessPartner record);

    BusinessPartner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessPartner record);

    int updateByPrimaryKey(BusinessPartner record);

}
