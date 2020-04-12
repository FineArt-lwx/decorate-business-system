package com.finearter.dbs.mapper;

import com.finearter.dbs.model.entity.GoodBusinessPartnerMapping;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodBusinessPartnerMappingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodBusinessPartnerMapping record);

    int insertSelective(GoodBusinessPartnerMapping record);

    GoodBusinessPartnerMapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodBusinessPartnerMapping record);

    int updateByPrimaryKey(GoodBusinessPartnerMapping record);
}