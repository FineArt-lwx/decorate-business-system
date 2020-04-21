package com.finearter.dbs.model.vo;

import com.finearter.dbs.model.entity.Customer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class HouseVo {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 房屋所有者
     */
    @ApiModelProperty(value = "房屋所有者")
    private String houseOwner;

    /**
     * 房屋面积
     */
    @ApiModelProperty(value = "房屋面积")
    private Double houseArea;

    /**
     * 装修状态
     */
    @ApiModelProperty(value = "装修状态")
    private String decorateStatus;

    /**
     * 房屋地址
     */
    @ApiModelProperty(value = "房屋地址")
    private String houseAddress;

    /**
     * 客户id
     */
    @ApiModelProperty(value = "客户id")
    private Customer customer;

    /**
     * 房屋户型
     */
    @ApiModelProperty(value = "房屋户型")
    private String houseType;

    /**
     * 房屋状态（新房，毛坯房，二手房）
     */
    @ApiModelProperty(value = "房屋状态（新房，毛坯房，二手房）")
    private String houseState;
}
