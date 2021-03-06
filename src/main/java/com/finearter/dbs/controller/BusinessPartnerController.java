package com.finearter.dbs.controller;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.service.BusinessPartnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BusinessPartner)表控制层
 *
 * @author makejava
 * @since 2020-04-12 17:06:08
 */
@RestController
@RequestMapping("businessPartner")
public class BusinessPartnerController {
    /**
     * 服务对象
     */
    @Resource
    private BusinessPartnerService businessPartnerService;


    /**
     * 合作商管理列表
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @GetMapping("/all")
    public ResultDto all(Integer pageIndex,Integer pageSize){
        return businessPartnerService.selectAll(pageIndex,pageSize);
    }


}
