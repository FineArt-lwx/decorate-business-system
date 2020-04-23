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




    @PostMapping("checkIdentity")
    public ResultDto checkIdentity(Integer id,String idNumber,String phoneNum){
        return userService.checkIdentity(id,idNumber,phoneNum);
    }


    @PostMapping("checkPassword")
    public ResultDto checkPassword(Integer id,String password){
        return userService.checkPassword(id,password);
    }


    @PostMapping("updatePassword")
    public ResultDto updatePassword(Integer id,String password){
        return userService.updatePassword(id,password);
    }






}
