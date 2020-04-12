package com.finearter.dbs.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finearter.dbs.model.entity.Job;
import com.finearter.dbs.mapper.JobMapper;
import com.finearter.dbs.service.JobService;

@Service
public class JobServiceImpl implements JobService {

    @Resource
    private JobMapper jobMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jobMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Job record) {
        return jobMapper.insert(record);
    }

    @Override
    public int insertSelective(Job record) {
        return jobMapper.insertSelective(record);
    }

    @Override
    public Job selectByPrimaryKey(Integer id) {
        return jobMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Job record) {
        return jobMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Job record) {
        return jobMapper.updateByPrimaryKey(record);
    }

}



