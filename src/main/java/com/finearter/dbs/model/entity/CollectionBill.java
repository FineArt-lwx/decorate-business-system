package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "com-finearter-dbs-model-entity-CollectionBill")
@Data
public class CollectionBill implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 客户id
     */
    @ApiModelProperty(value = "客户id")
    private Integer customerId;

    /**
     * 单笔金额
     */
    @ApiModelProperty(value = "单笔金额")
    private Double amount;

    /**
     * 收款日期
     */
    @ApiModelProperty(value = "收款日期")
    private Date date;

    /**
     * 支付方式
     */
    @ApiModelProperty(value = "支付方式")
    private String payWay;

    /**
     * 支付状态
     */
    @ApiModelProperty(value = "支付状态")
    private String payStatus;

    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id")
    private Integer orderId;

    private static final long serialVersionUID = 1L;
}