package com.finearter.dbs.mapper;

import com.finearter.dbs.model.entity.BusinessPartner;
import org.apache.ibatis.annotations.Mapper;import java.util.ArrayList;

@Mapper
public interface BusinessPartnerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessPartner record);

    int insertSelective(BusinessPartner record);

    BusinessPartner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessPartner record);

    int updateByPrimaryKey(BusinessPartner record);

    ArrayList<BusinessPartner> selectByAnyCondition(BusinessPartner businessPartner);
}