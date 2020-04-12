package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-finearter-dbs-model-entity-CollectionBill")
@Data
public class CollectionBill implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer customerId;

    @ApiModelProperty(value="")
    private String payee;

    @ApiModelProperty(value="")
    private Double amount;

    @ApiModelProperty(value="")
    private Date date;

    @ApiModelProperty(value="")
    private String payWay;

    @ApiModelProperty(value="")
    private String payStatus;

    @ApiModelProperty(value="")
    private Integer decorateId;

    private static final long serialVersionUID = 1L;
}