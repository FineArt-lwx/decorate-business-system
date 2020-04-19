package com.finearter.dbs.controller;

import com.finearter.dbs.service.DecoratePlanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (DecoratePlan)表控制层
 *
 * @author makejava
 * @since 2020-04-12 17:10:39
 */
@RestController
@RequestMapping("decoratePlan")
public class DecoratePlanController {
    /**
     * 服务对象
     */
    @Resource
    private DecoratePlanService decoratePlanService;


}