package com.finearter.dbs.controller;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Role;
import com.finearter.dbs.service.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Role)表控制层
 *
 * @author makejava
 * @since 2020-04-20 15:10:10
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    @GetMapping("/all")
    public ResultDto all(Integer pageIndex,Integer pageSize){
        return roleService.selectAll(pageIndex,pageSize);
    }

    /**
     * 添加角色
     * @param role
     * @return
     */
    @GetMapping("/addRole")
    public ResultDto addRole(Role role){
        return roleService.addRole(role);

    }
}
