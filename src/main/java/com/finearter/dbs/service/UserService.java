package com.finearter.dbs.service;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.User;

public interface UserService {


    /**
     * 查询所有用户
     *
     * @return
     */
    ResultDto selectAllUsers(Integer pageIndex,Integer pageSize);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    ResultDto selectByPhoneNum(String phoneNum, String password);

    ResultDto info(String phoneNum);

    ResultDto addUser(User user);

    ResultDto checkIdentity(Integer id, String idNumber, String phoneNum);

    ResultDto checkPassword(Integer id, String password);

    ResultDto updatePassword(Integer id, String password);

    ResultDto updateById(User user);
}




