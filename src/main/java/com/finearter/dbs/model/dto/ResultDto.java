package com.finearter.dbs.model.dto;


import lombok.Data;

@Data
public class ResultDto {

    private String code="0";
    private String message="操作成功";
    private Object data;

}
