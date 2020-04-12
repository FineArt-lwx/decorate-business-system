package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value="com-finearter-dbs-model-entity-GoodBusinessPartnerMapping")
@Data
public class GoodBusinessPartnerMapping implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 合作商id
    */
    @ApiModelProperty(value="合作商id")
    private Integer businessPartnerId;

    /**
    * 商品id
    */
    @ApiModelProperty(value="商品id")
    private Integer goodId;

    private static final long serialVersionUID = 1L;
}