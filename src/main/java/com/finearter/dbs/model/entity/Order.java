package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-finearter-dbs-model-entity-Order")
@Data
public class Order implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Date date;

    @ApiModelProperty(value="")
    private String status;

    @ApiModelProperty(value="")
    private Integer customerId;

    @ApiModelProperty(value="")
    private String note;

    @ApiModelProperty(value="")
    private Integer employeeId;

    @ApiModelProperty(value="")
    private Integer billId;

    private static final long serialVersionUID = 1L;
}