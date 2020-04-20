package com.finearter.dbs.mapper;

import com.finearter.dbs.model.entity.ProjectGoodMapping;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ProjectGoodMappingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectGoodMapping record);

    int insertSelective(ProjectGoodMapping record);

    ProjectGoodMapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectGoodMapping record);

    int updateByPrimaryKey(ProjectGoodMapping record);

    ArrayList<ProjectGoodMapping> selectByAnyCondition(ProjectGoodMapping projectGoodMapping);
}