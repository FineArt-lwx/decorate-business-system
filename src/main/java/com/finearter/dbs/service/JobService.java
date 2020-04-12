package com.finearter.dbs.service;

import com.finearter.dbs.model.entity.Job;

public interface JobService {


    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

}



