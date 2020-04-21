package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.BusinessPartnerMapper;
import com.finearter.dbs.mapper.GoodBusinessPartnerMappingMapper;
import com.finearter.dbs.mapper.GoodMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.BusinessPartner;
import com.finearter.dbs.model.entity.Good;
import com.finearter.dbs.model.entity.GoodBusinessPartnerMapping;
import com.finearter.dbs.model.vo.GoodVo;
import com.finearter.dbs.service.GoodService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class GoodServiceImpl implements GoodService {

    @Resource
    private GoodMapper goodMapper;


    @Resource
    private GoodBusinessPartnerMappingMapper goodBusinessPartnerMappingMapper;


    @Resource
    private BusinessPartnerMapper businessPartnerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return goodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Good record) {
        return goodMapper.insert(record);
    }

    @Override
    public int insertSelective(Good record) {
        return goodMapper.insertSelective(record);
    }

    @Override
    public Good selectByPrimaryKey(Integer id) {
        return goodMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Good record) {
        return goodMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Good record) {
        return goodMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll(Integer pageIndex,Integer pageSize) {

        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<Good> goods= goodMapper.selectByAnyCondition(new Good());
        for(Good good:goods){
            GoodVo goodVo=goodConvertGoodVo(good);
        }
        return null;
    }

    private GoodVo goodConvertGoodVo(Good good) {

        GoodVo goodVo = new GoodVo();

        GoodBusinessPartnerMapping condition =new GoodBusinessPartnerMapping();

        condition.setGoodId(good.getId());

        ArrayList<GoodBusinessPartnerMapping> goodBusinessPartnerMappings = goodBusinessPartnerMappingMapper.selectByAnyCondition(condition);

        ArrayList<BusinessPartner> businessPartners=new ArrayList<>();

        for(GoodBusinessPartnerMapping goodBusinessPartnerMapping:goodBusinessPartnerMappings){
            Integer businessPartnerId = goodBusinessPartnerMapping.getBusinessPartnerId();
            BusinessPartner businessPartner = businessPartnerMapper.selectByPrimaryKey(businessPartnerId);
            businessPartners.add(businessPartner);
        }


        goodVo.setBrand(good.getBrand());
        goodVo.setId(good.getId());
        goodVo.setModel(good.getModel());
        goodVo.setType(good.getType());
        goodVo.setName(good.getName());
        goodVo.setPrice(good.getPrice());
        goodVo.setSize(good.getSize());
        goodVo.setUsage(good.getUsage());
        goodVo.setBusinessPartners(businessPartners);

        return goodVo;
    }

}

