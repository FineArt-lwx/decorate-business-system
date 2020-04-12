package com.finearter.dbs.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finearter.dbs.model.entity.Dept;
import com.finearter.dbs.mapper.DeptMapper;
import com.finearter.dbs.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return deptMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Dept record) {
        return deptMapper.insert(record);
    }

    @Override
    public int insertSelective(Dept record) {
        return deptMapper.insertSelective(record);
    }

    @Override
    public Dept selectByPrimaryKey(Integer id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return deptMapper.updateByPrimaryKey(record);
    }

}



