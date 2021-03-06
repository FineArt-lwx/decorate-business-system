package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.DeptMapper;
import com.finearter.dbs.mapper.JobMapper;
import com.finearter.dbs.mapper.RoleMapper;
import com.finearter.dbs.mapper.UserMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.dto.UserDto;
import com.finearter.dbs.model.entity.Dept;
import com.finearter.dbs.model.entity.Job;
import com.finearter.dbs.model.entity.Role;
import com.finearter.dbs.model.entity.User;
import com.finearter.dbs.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;


/**
 * @author lwx
 */
@Slf4j
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private JobMapper jobMapper;

    @Autowired
    private DeptMapper deptMapper;


    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public ResultDto selectAllUsers(Integer pageIndex,Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<User> users = userMapper.selectByAnyCondition(new User());
        ArrayList<UserDto> userDtos=new ArrayList<>();
        for(User user:users){
            UserDto userDto = userConvertUserDto(user);
            userDtos.add(userDto);
        }

        PageInfo pageInfo=new PageInfo(users);
        pageInfo.setList(userDtos);

        ResultDto resultDto=new ResultDto();
        resultDto.setData(pageInfo);
        return  resultDto;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectByPhoneNum(String phoneNum, String password) {
       // userMapper.selectByPhoneNum()

        ResultDto resultDto=new ResultDto();
        User user=new User();
        user.setPhoneNum(phoneNum);
        user.setPassword(password);
        ArrayList<User> users=userMapper.selectByAnyCondition(user);
        if(users.size()==0){
            resultDto.setMessage("操作成功，但是密码错误");
        }else{
            User userResult = users.get(0);

            UserDto userDto=userConvertUserDto(userResult);

            resultDto.setData(userDto);
        }



        return resultDto;
    }

    @Override
    public ResultDto info(String phoneNum) {
        User condition=new User();
        condition.setPhoneNum(phoneNum);

        User user=null;
        UserDto userDto=null;
        ArrayList<User> users = userMapper.selectByAnyCondition(condition);
        if(users.size()!=0){
            user = users.get(0);
            userDto=userConvertUserDto(user);
        }

        ResultDto resultDto=new ResultDto();
        resultDto.setData(userDto);
        return resultDto;
    }

    /**
     * 添加用户核心代码
     * @param user
     * @return
     */
    @Override
    public ResultDto addUser(User user) {
        int insert = userMapper.insert(user);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(insert);
        return resultDto;
    }

    /**
     * 修改密码第一步：验证身份核心代码
     * @param id
     * @param idNumber
     * @param phoneNum
     * @return
     */
    @Override
    public ResultDto checkIdentity(Integer id, String idNumber, String phoneNum) {

        User condition =new User();
        condition.setId(id);
        condition.setIdNumber(idNumber);
        condition.setPhoneNum(phoneNum);

        ArrayList<User> users = userMapper.selectByAnyCondition(condition);
        ResultDto resultDto=new ResultDto();
        if(users.size()!=0){
            User user=users.get(0);
            resultDto.setData(user);
        }
        else {
            resultDto.setMessage("验证信息错误");
        }
        return resultDto;
    }

    /**
     * 修改密码第二步：验证原密码核心代码
     * @param id
     * @param password
     * @return
     */
    @Override
    public ResultDto checkPassword(Integer id, String password) {
        User condition =new User();
        condition.setId(id);
        condition.setPassword(password);
        ArrayList<User> users = userMapper.selectByAnyCondition(condition);

        ResultDto resultDto=new ResultDto();
        if(users.size()!=0){
            User user=users.get(0);
            resultDto.setData(user);
        }else{
            resultDto.setMessage("原密码错误");
        }


        return resultDto;
    }
    /**
     * 修改密码第三步：修改密码核心代码
     * @param id
     * @param password
     * @return
     */
    @Override
    public ResultDto updatePassword(Integer id, String password) {


        User user = userMapper.selectByPrimaryKey(id);
        user.setPassword(password);

        int i = userMapper.updateByPrimaryKey(user);

        ResultDto resultDto=new ResultDto();

        resultDto.setMessage("修改成功");
        resultDto.setData(i);

        return resultDto;
    }

    @Override
    public ResultDto updateById(User user) {

        int i = userMapper.updateByPrimaryKeySelective(user);

        ResultDto resultDto=new ResultDto();
        resultDto.setData(i);

        return resultDto;
    }

    private UserDto userConvertUserDto(User userResult) {

        UserDto userDto=new UserDto();
        Role role = roleMapper.selectByPrimaryKey(userResult.getRoleId());
        Job job = jobMapper.selectByPrimaryKey(userResult.getJobId());
        Dept dept = deptMapper.selectByPrimaryKey(userResult.getDeptId());
        userDto.setDept(dept);
        userDto.setJob(job);
        userDto.setRole(role);

        userDto.setId(userResult.getId());
        userDto.setEmail(userResult.getEmail());
        userDto.setIdNumber(userResult.getIdNumber());
        userDto.setName(userResult.getName());
        userDto.setPassword(userResult.getPassword());
        userDto.setPhoneNum(userResult.getPhoneNum());
        userDto.setSex(userResult.getSex());
        userDto.setSuperiorId(userResult.getSuperiorId());
        userDto.setWorkNum(userResult.getWorkNum());



        return userDto;

    }
}




