package com.finearter.dbs.service;

import com.finearter.dbs.model.entity.Project;
public interface ProjectService{


    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

}
