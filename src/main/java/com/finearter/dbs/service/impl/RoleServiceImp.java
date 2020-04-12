package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.RoleMapper;
import com.finearter.dbs.model.entity.Role;
import com.finearter.dbs.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class RoleServiceImp implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    
    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    
    @Override
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

}
