package com.finearter.dbs.service;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Role;

public interface RoleService {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    ResultDto selectAll(Integer pageIndex, Integer pageSize);

    ResultDto addRole(Role role);
}




