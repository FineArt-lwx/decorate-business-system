package com.finearter.dbs.mapper;

import com.finearter.dbs.model.entity.Good;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
}