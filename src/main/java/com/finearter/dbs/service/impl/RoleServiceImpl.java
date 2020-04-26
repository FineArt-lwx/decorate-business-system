package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.RoleMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Role;
import com.finearter.dbs.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class RoleServiceImpl implements RoleService {

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

    @Override
    public ResultDto selectAll(Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<Role> roles=roleMapper.selectByAnyCondition(new Role());
        PageInfo pageInfo=new PageInfo(roles);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(pageInfo);
        return resultDto;
    }

    /**
     * 添加角色核心代码
     * @param role
     * @return
     */
    @Override
    public ResultDto addRole(Role role) {
        int insert = roleMapper.insert(role);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(insert);
        return resultDto;
    }

}



