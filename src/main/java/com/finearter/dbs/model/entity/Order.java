package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "com-finearter-dbs-model-entity-Order")
@Data
public class Order implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 订单生成日期
     */
    @ApiModelProperty(value = "订单生成日期")
    private Date date;

    /**
     * 订单状态
     */
    @ApiModelProperty(value = "订单状态")
    private String status;

    /**
     * 工程id
     */
    @ApiModelProperty(value = "工程id")
    private Integer projectId;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String note;

    /**
     * 财务负责人
     */
    @ApiModelProperty(value = "财务负责人")
    private Integer principalId;

    private static final long serialVersionUID = 1L;
}