package com.finearter.dbs.service;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.House;
public interface HouseService{


    int deleteByPrimaryKey(Integer id);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    ResultDto selectAll(Integer pageIndex,Integer pageSize);

    ResultDto addHouse(House house);

    ResultDto selectById(Integer id);
}
