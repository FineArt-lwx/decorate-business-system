package com.finearter.dbs.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finearter.dbs.mapper.ProjectGoodMappingMapper;
import com.finearter.dbs.model.entity.ProjectGoodMapping;
import com.finearter.dbs.service.ProjectGoodMappingService;

@Service
public class ProjectGoodMappingServiceImpl implements ProjectGoodMappingService {

    @Resource
    private ProjectGoodMappingMapper projectGoodMappingMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return projectGoodMappingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProjectGoodMapping record) {
        return projectGoodMappingMapper.insert(record);
    }

    @Override
    public int insertSelective(ProjectGoodMapping record) {
        return projectGoodMappingMapper.insertSelective(record);
    }

    @Override
    public ProjectGoodMapping selectByPrimaryKey(Integer id) {
        return projectGoodMappingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProjectGoodMapping record) {
        return projectGoodMappingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProjectGoodMapping record) {
        return projectGoodMappingMapper.updateByPrimaryKey(record);
    }

}

