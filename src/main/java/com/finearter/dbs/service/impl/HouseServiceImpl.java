package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.CustomerMapper;
import com.finearter.dbs.mapper.HouseMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Customer;
import com.finearter.dbs.model.entity.House;
import com.finearter.dbs.model.vo.HouseVo;
import com.finearter.dbs.service.HouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class HouseServiceImpl implements HouseService{

    @Resource
    private HouseMapper houseMapper;

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return houseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(House record) {
        return houseMapper.insert(record);
    }

    @Override
    public int insertSelective(House record) {
        return houseMapper.insertSelective(record);
    }

    @Override
    public House selectByPrimaryKey(Integer id) {
        return houseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(House record) {
        return houseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(House record) {
        return houseMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll(Integer pageIndex,Integer pageSize) {

        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<House> houses=houseMapper.selectByAnyCondition(new House());

        ArrayList<HouseVo> houseVos=new ArrayList<>();
        for(House house:houses){
            HouseVo houseVo=houseConvertHouseVo(house);
            houseVos.add(houseVo);
        }
        PageInfo pageInfo=new PageInfo();
        pageInfo.setList(houseVos);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(pageInfo);
        return resultDto;
    }

    @Override
    public ResultDto addHouse(House house) {
        int insert = houseMapper.insert(house);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(insert);
        return resultDto;
    }

    private HouseVo houseConvertHouseVo(House house) {

        HouseVo houseVo = new HouseVo();

        Customer customer = customerMapper.selectByPrimaryKey(house.getCustomerId());

        houseVo.setDecorateStatus(house.getDecorateStatus());
        houseVo.setHouseAddress(house.getHouseAddress());
        houseVo.setHouseArea(house.getHouseArea());
        houseVo.setHouseOwner(house.getHouseOwner());
        houseVo.setHouseState(house.getHouseState());
        houseVo.setHouseType(house.getHouseType());
        houseVo.setId(house.getId());
        houseVo.setCustomer(customer);

        return houseVo;

    }


}
