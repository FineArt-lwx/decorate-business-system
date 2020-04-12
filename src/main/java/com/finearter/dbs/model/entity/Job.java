package com.finearter.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value = "com-finearter-dbs-model-entity-Job")
@Data
public class Job implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 职位名称
     */
    @ApiModelProperty(value = "职位名称")
    private String jobName;

    private static final long serialVersionUID = 1L;
}