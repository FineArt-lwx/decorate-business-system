package com.finearter.dbs.service;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.DecoratePlan;

public interface DecoratePlanService {


    int deleteByPrimaryKey(Integer id);

    int insert(DecoratePlan record);

    int insertSelective(DecoratePlan record);

    DecoratePlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DecoratePlan record);

    int updateByPrimaryKey(DecoratePlan record);

    ResultDto all(Integer pageIndex, Integer pageIndex1);
}

