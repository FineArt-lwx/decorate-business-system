package com.finearter.dbs.controller;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.service.GoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Good)表控制层
 *
 * @author makejava
 * @since 2020-04-12 17:10:58
 */
@RestController
@RequestMapping("good")
public class GoodController {
    /**
     * 服务对象
     */
    @Resource
    private GoodService goodService;



    @GetMapping("/all")
    public ResultDto selectAll(){
        return goodService.selectAll();
    }


}