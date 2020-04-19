package com.finearter.dbs.controller;


import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResultDto selectAllUsers(){

        return  userService.selectAllUsers();
    }
}
