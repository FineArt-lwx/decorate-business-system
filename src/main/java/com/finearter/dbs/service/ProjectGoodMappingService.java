package com.finearter.dbs.service;

import com.finearter.dbs.model.entity.ProjectGoodMapping;

public interface ProjectGoodMappingService {


    int deleteByPrimaryKey(Integer id);

    int insert(ProjectGoodMapping record);

    int insertSelective(ProjectGoodMapping record);

    ProjectGoodMapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectGoodMapping record);

    int updateByPrimaryKey(ProjectGoodMapping record);

}

