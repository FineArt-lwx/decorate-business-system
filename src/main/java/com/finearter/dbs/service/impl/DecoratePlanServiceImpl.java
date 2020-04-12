package com.finearter.dbs.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finearter.dbs.mapper.DecoratePlanMapper;
import com.finearter.dbs.model.entity.DecoratePlan;
import com.finearter.dbs.service.DecoratePlanService;
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

}
