package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value="com-finearter-dbs-model-entity-DecoratePlan")
@Data
public class DecoratePlan implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private String type;

    @ApiModelProperty(value="")
    private Double price;

    private static final long serialVersionUID = 1L;
}