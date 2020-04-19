package com.finearter.dbs.service;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.User;

public interface UserService {


    /**
     * 查询所有用户
     *
     * @return
     */
    ResultDto selectAllUsers();

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    ResultDto selectByPhoneNum(String phoneNum, String password);

    ResultDto info(String phoneNum);
}




