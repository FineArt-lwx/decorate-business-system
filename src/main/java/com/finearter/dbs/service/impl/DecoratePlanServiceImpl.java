package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.DecoratePlanMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.DecoratePlan;
import com.finearter.dbs.service.DecoratePlanService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class DecoratePlanServiceImpl implements DecoratePlanService{

    @Resource
    private DecoratePlanMapper decoratePlanMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return decoratePlanMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DecoratePlan record) {
        return decoratePlanMapper.insert(record);
    }

    @Override
    public int insertSelective(DecoratePlan record) {
        return decoratePlanMapper.insertSelective(record);
    }

    @Override
    public DecoratePlan selectByPrimaryKey(Integer id) {
        return decoratePlanMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DecoratePlan record) {
        return decoratePlanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DecoratePlan record) {
        return decoratePlanMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto all(Integer pageIndex, Integer pageSize) {

        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<DecoratePlan> decoratePlans=decoratePlanMapper.selectByAnyCondition(new DecoratePlan());

        PageInfo pageInfo=new PageInfo(decoratePlans);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(pageInfo);


        return resultDto;
    }

}
