package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value = "com-finearter-dbs-model-entity-ProjectGoodMapping")
@Data
public class ProjectGoodMapping implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 工程id
     */
    @ApiModelProperty(value = "工程id")
    private Integer projectId;

    /**
     * 材料id
     */
    @ApiModelProperty(value = "材料id")
    private Integer goodId;

    /**
     * 数量
     */
    @ApiModelProperty(value = "数量")
    private Double amount;

    /**
     * 数量的单位（米，千克）
     */
    @ApiModelProperty(value = "数量的单位（米，千克）")
    private String unit;

    private static final long serialVersionUID = 1L;
}