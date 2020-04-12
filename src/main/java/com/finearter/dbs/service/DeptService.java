package com.finearter.dbs.service;

import com.finearter.dbs.model.entity.Dept;

public interface DeptService {


    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

}



