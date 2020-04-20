package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "com-finearter-dbs-model-entity-BusinessPartner")
@Data
public class BusinessPartner implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 合作商名称
     */
    @ApiModelProperty(value = "合作商名称")
    private String name;

    /**
     * 联系方式
     */
    @ApiModelProperty(value = "联系方式")
    private String phoneNum;

    /**
     * 负责人_id
     */
    @ApiModelProperty(value = "负责人_id")
    private Integer principalId;

    /**
     * 合作商类型
     */
    @ApiModelProperty(value = "合作商类型")
    private Integer partnerType;

    private static final long serialVersionUID = 1L;
}