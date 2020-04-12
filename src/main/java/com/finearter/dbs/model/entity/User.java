package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value = "com-finearter-dbs-model-entity-User")
@Data
public class User implements Serializable {
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
    @ApiModelProperty(value = "角色id")
    private Integer roleId;

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
    @ApiModelProperty(value = "部门id")
    private Integer deptId;

    /**
     * 职位id
     */
    @ApiModelProperty(value = "职位id")
    private Integer jobId;

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

    private static final long serialVersionUID = 1L;
}