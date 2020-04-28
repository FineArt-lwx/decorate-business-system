package com.finearter.dbs.mapper;

import com.finearter.dbs.model.entity.DecoratePlan;import java.util.ArrayList;

public interface DecoratePlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DecoratePlan record);

    int insertSelective(DecoratePlan record);

    DecoratePlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DecoratePlan record);

    int updateByPrimaryKey(DecoratePlan record);

    ArrayList<DecoratePlan> selectByAnyCondition(DecoratePlan decoratePlan);
}