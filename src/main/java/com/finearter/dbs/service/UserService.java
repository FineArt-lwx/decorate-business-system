package com.finearter.dbs.service;

import com.finearter.dbs.model.entity.User;

import java.util.List;

public interface UserService {


    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> selectAllUsers();

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}




