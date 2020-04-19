package com.finearter.dbs.model.dto;


import com.finearter.dbs.model.entity.Dept;
import com.finearter.dbs.model.entity.Job;
import com.finearter.dbs.model.entity.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserDto {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String name;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String sex;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phoneNum;

    /**
     * 角色id
     */
    @ApiModelProperty(value = "角色")
    private Role role;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    /**
     * 部门id
     */
    @ApiModelProperty(value = "部门")
    private Dept dept;

    /**
     * 职位id
     */
    @ApiModelProperty(value = "职位")
    private Job job;

    /**
     * 上级id
     */
    @ApiModelProperty(value = "上级id")
    private Integer superiorId;

    /**
     * 工号
     */
    @ApiModelProperty(value = "工号")
    private String workNum;

}
