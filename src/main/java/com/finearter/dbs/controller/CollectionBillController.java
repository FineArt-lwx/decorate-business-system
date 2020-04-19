package com.finearter.dbs.controller;


import com.finearter.dbs.service.CollectionBillService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Collectionbill)表控制层
 *
 * @author makejava
 * @since 2020-04-12 17:08:26
 */
@RestController
@RequestMapping("collectionbill")
public class CollectionBillController {
    /**
     * 服务对象
     */
    @Resource
    private CollectionBillService collectionbillService;


}