package com.finearter.dbs.controller;


import com.finearter.dbs.model.entity.User;
import com.finearter.dbs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lwx
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {


    private UserService userService;


    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }


    @GetMapping("/all")
    @ResponseBody
    public List<User> selectAllUsers(){
        log.info("userController...");
        return  userService.selectAllUsers();
    }
}
