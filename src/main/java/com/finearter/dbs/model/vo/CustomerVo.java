package com.finearter.dbs.model.vo;

import com.finearter.dbs.model.entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class CustomerVo {

    /**
     * 客户id
     */
    @ApiModelProperty(value = "客户id")
    private Integer id;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phoneNum;

    /**
     * 客户姓名
     */
    @ApiModelProperty(value = "客户姓名")
    private String customerName;

    /**
     * 客户性别
     */
    @ApiModelProperty(value = "客户性别")
    private String customerSex;

    /**
     * 客户身份证号
     */
    @ApiModelProperty(value = "客户身份证号")
    private String customerIdNum;

    /**
     * 客户住址
     */
    @ApiModelProperty(value = "客户住址")
    private String customerAddress;

    /**
     * 对接员工
     */
    @ApiModelProperty(value = "对接员工")
    private User user;
}
