package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value = "com-finearter-dbs-model-entity-Good")
@Data
public class Good implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称")
    private String name;

    /**
     * 品牌
     */
    @ApiModelProperty(value = "品牌")
    private String brand;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String type;

    /**
     * 价格
     */
    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    /**
     * 尺寸
     */
    @ApiModelProperty(value = "尺寸")
    private String size;

    /**
     * 模型
     */
    @ApiModelProperty(value = "模型")
    private String model;

    /**
     * 用途
     */
    @ApiModelProperty(value = "用途")
    private String usage;

    private static final long serialVersionUID = 1L;
}