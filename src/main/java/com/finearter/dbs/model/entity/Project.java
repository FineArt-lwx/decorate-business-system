package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-finearter-dbs-model-entity-Project")
@Data
public class Project implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 房屋id
    */
    @ApiModelProperty(value="房屋id")
    private Integer houseId;

    /**
    * 客户id
    */
    @ApiModelProperty(value="客户id")
    private Integer customerId;

    /**
    * 装修方案id
    */
    @ApiModelProperty(value="装修方案id")
    private Integer decorateId;

    /**
    * 负责人id
    */
    @ApiModelProperty(value="负责人id")
    private Integer principalId;

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

    private static final long serialVersionUID = 1L;
}