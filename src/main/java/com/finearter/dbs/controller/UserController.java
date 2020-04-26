package com.finearter.dbs.controller;


import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.User;
import com.finearter.dbs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lwx
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {


    private UserService userService;


    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }


    /**
     * 登陆接口
     * @param phoneNum
     * @param password
     * @return
     */
    @PostMapping("/login")
    public ResultDto login(String phoneNum,String password){
        return userService.selectByPhoneNum(phoneNum,password);
    }



    @GetMapping("/info")
    public ResultDto info(String phoneNum){
        return userService.info(phoneNum);
    }


    /**
     * 查找所有用户
     * @return
     */
    @GetMapping("/all")
    public ResultDto selectAllUsers(Integer pageIndex,Integer pageSize){

        return  userService.selectAllUsers(pageIndex,pageSize);
    }


    @PutMapping("/addUser")
    public ResultDto addUser(User user){
        return userService.addUser(user);
    }


    /**
     * 修改密码第一步：验证身份
     * @param id
     * @param idNumber
     * @param phoneNum
     * @return
     */
    @PostMapping("checkIdentity")
    public ResultDto checkIdentity(Integer id,String idNumber,String phoneNum){
        return userService.checkIdentity(id,idNumber,phoneNum);
    }

    /**
     * 修改密码第二步：验证原密码
     * @param id
     * @param password
     * @return
     */
    @PostMapping("checkPassword")
    public ResultDto checkPassword(Integer id,String password){
        return userService.checkPassword(id,password);
    }

    /**
     * 修改密码第三步：修改密码
     * @param id
     * @param password
     * @return
     */
    @PostMapping("updatePassword")
    public ResultDto updatePassword(Integer id,String password){
        return userService.updatePassword(id,password);
    }



    @PostMapping("updateById")
    public ResultDto updateById(User user){
        return  userService.updateById(user);
    }






}
