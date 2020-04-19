package com.finearter.dbs.mapper;

import com.finearter.dbs.model.entity.House;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface HouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    ArrayList<House> selectByAnyCondition(House house);
}