package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value = "com-finearter-dbs-model-entity-Dept")
@Data
public class Dept implements Serializable {
    /**
     * 部门编号
     */
    @ApiModelProperty(value = "部门编号")
    private Integer id;

    /**
     * 部门名称
     */
    @ApiModelProperty(value = "部门名称")
    private String deptName;

    private static final long serialVersionUID = 1L;
}