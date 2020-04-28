package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-finearter-dbs-model-entity-DecoratePlan")
@Data
public class DecoratePlan {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String imgUrl;

    @ApiModelProperty(value = "")
    private Integer designerId;
}