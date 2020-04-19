package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.GoodMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Good;
import com.finearter.dbs.service.GoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class GoodServiceImpl implements GoodService {

    @Resource
    private GoodMapper goodMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return goodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Good record) {
        return goodMapper.insert(record);
    }

    @Override
    public int insertSelective(Good record) {
        return goodMapper.insertSelective(record);
    }

    @Override
    public Good selectByPrimaryKey(Integer id) {
        return goodMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Good record) {
        return goodMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Good record) {
        return goodMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll() {

        ArrayList<Good> goods= goodMapper.selectByAnyCondition(new Good());
        return null;
    }

}

