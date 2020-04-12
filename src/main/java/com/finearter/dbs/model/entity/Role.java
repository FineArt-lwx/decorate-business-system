package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value = "com-finearter-dbs-model-entity-Role")
@Data
public class Role implements Serializable {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String description;

    private static final long serialVersionUID = 1L;
}