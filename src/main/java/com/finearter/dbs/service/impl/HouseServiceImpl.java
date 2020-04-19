package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.HouseMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.House;
import com.finearter.dbs.service.HouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class HouseServiceImpl implements HouseService{

    @Resource
    private HouseMapper houseMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return houseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(House record) {
        return houseMapper.insert(record);
    }

    @Override
    public int insertSelective(House record) {
        return houseMapper.insertSelective(record);
    }

    @Override
    public House selectByPrimaryKey(Integer id) {
        return houseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(House record) {
        return houseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(House record) {
        return houseMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll() {

        ArrayList<House> houses=houseMapper.selectByAnyCondition(new House());
        ResultDto resultDto=new ResultDto();
        resultDto.setData(houses);
        return resultDto;
    }



}
