package com.finearter.dbs.mapper;

import com.finearter.dbs.model.entity.DecoratePlan;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface DecoratePlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DecoratePlan record);

    int insertSelective(DecoratePlan record);

    DecoratePlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DecoratePlan record);

    int updateByPrimaryKey(DecoratePlan record);

    ArrayList<DecoratePlan> selectByAnyCondition(DecoratePlan decoratePlan);
}