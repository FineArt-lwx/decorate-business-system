package com.finearter.dbs.model.vo;

import com.finearter.dbs.model.entity.Good;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class BusinessPartnerVo {

    /**
     * 主键
     */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 合作商名称
     */
    @ApiModelProperty(value="合作商名称")
    private String name;

    /**
     * 联系方式
     */
    @ApiModelProperty(value="联系方式")
    private String phoneNum;

    /**
     * 负责人
     */
    @ApiModelProperty(value="负责人")
    private String principal;

    /**
     * 合作商类型
     */
    @ApiModelProperty(value="合作商类型")
    private Integer partnerType;

    private ArrayList<Good> goods;
}
