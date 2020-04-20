package com.finearter.dbs.model.vo;


import com.finearter.dbs.model.entity.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class ProjectVo {

    /**
     * 主键
     */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 房屋id
     */
    @ApiModelProperty(value="房屋")
    private House house;

    /**
     * 客户id
     */
    @ApiModelProperty(value="客户")
    private Customer customer;

    /**
     * 装修方案id
     */
    @ApiModelProperty(value="装修方案")
    private DecoratePlan decoratePlan;

    /**
     * 负责人id
     */
    @ApiModelProperty(value="负责人")
    private User principal;

    /**
     * 工程周期
     */
    @ApiModelProperty(value="工程周期")
    private String projectCycle;

    /**
     * 开始时间
     */
    @ApiModelProperty(value="开始时间")
    private Date startDate;

    /**
     * 预计结束时间
     */
    @ApiModelProperty(value="预计结束时间")
    private Date expectEndDate;

    /**
     * 浮动时间说明
     */
    @ApiModelProperty(value="浮动时间说明")
    private String floatDateDeclare;


    private ArrayList<Good> goods;
}
