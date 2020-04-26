package com.finearter.dbs.controller;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.House;
import com.finearter.dbs.service.HouseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (House)表控制层
 *
 * @author makejava
 * @since 2020-04-12 17:11:20
 */
@RestController
@RequestMapping("house")
public class HouseController {
    /**
     * 服务对象
     */
    @Resource
    private HouseService houseService;


    @GetMapping("/all")
    public ResultDto selectAll(Integer pageIndex,Integer pageSize){
        return houseService.selectAll(pageIndex,pageSize);
    }


    @PutMapping("addHouse")
    public ResultDto addHouse(House house){
        return houseService.addHouse(house);
    }


    @GetMapping("selectById")
    public ResultDto selectById(Integer id){
        return houseService.selectById(id);
    }


    @GetMapping("selectByCondition")
    public ResultDto selectByAnyCondition(House house,Integer pageIndex,Integer pageSize){
        return houseService.selectByAnyCondition(house,pageIndex,pageSize);
    }



    @PutMapping("updateById")
    public ResultDto updateById(House house){
        return houseService.updateById(house);
    }

}
