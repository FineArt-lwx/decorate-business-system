package com.finearter.dbs.service;

import com.finearter.dbs.model.entity.GoodBusinessPartnerMapping;
public interface GoodBusinessPartnerMappingService{


    int deleteByPrimaryKey(Integer id);

    int insert(GoodBusinessPartnerMapping record);

    int insertSelective(GoodBusinessPartnerMapping record);

    GoodBusinessPartnerMapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodBusinessPartnerMapping record);

    int updateByPrimaryKey(GoodBusinessPartnerMapping record);

}
