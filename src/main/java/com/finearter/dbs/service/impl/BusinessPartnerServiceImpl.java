package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.BusinessPartnerMapper;
import com.finearter.dbs.mapper.GoodBusinessPartnerMappingMapper;
import com.finearter.dbs.mapper.GoodMapper;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.BusinessPartner;
import com.finearter.dbs.model.entity.Good;
import com.finearter.dbs.model.entity.GoodBusinessPartnerMapping;
import com.finearter.dbs.model.vo.BusinessPartnerVo;
import com.finearter.dbs.service.BusinessPartnerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class BusinessPartnerServiceImpl implements BusinessPartnerService {

    @Resource
    private BusinessPartnerMapper businessPartnerMapper;

    @Resource
    private GoodBusinessPartnerMappingMapper goodBusinessPartnerMappingMapper;

    @Resource
    private GoodMapper goodMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return businessPartnerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BusinessPartner record) {
        return businessPartnerMapper.insert(record);
    }

    @Override
    public int insertSelective(BusinessPartner record) {
        return businessPartnerMapper.insertSelective(record);
    }

    @Override
    public BusinessPartner selectByPrimaryKey(Integer id) {
        return businessPartnerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessPartner record) {
        return businessPartnerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BusinessPartner record) {
        return businessPartnerMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll(Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex, pageSize);

        ArrayList<BusinessPartner> businessPartnerArrayList = businessPartnerMapper.selectByAnyCondition(new BusinessPartner());

        ArrayList<BusinessPartnerVo> businessPartnerVos=new ArrayList<>();
        for(BusinessPartner businessPartner:businessPartnerArrayList){
            BusinessPartnerVo businessPartnerVo=businessPartnerConvertBusinessPartnerVo(businessPartner);
            businessPartnerVos.add(businessPartnerVo);
        }
        PageInfo pageInfo=new PageInfo(businessPartnerVos);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(pageInfo);
        return resultDto;
    }

    private BusinessPartnerVo businessPartnerConvertBusinessPartnerVo(BusinessPartner businessPartner) {

        BusinessPartnerVo businessPartnerVo = new BusinessPartnerVo();
        Integer businessPartnerId=businessPartner.getId();
        GoodBusinessPartnerMapping conditon = new GoodBusinessPartnerMapping();
        conditon.setBusinessPartnerId(businessPartnerId);

        ArrayList<GoodBusinessPartnerMapping> goodBusinessPartnerMappings=goodBusinessPartnerMappingMapper.selectByAnyCondition(conditon);

        ArrayList<Good> goods=new ArrayList<>();
        for(GoodBusinessPartnerMapping goodBusinessPartnerMapping:goodBusinessPartnerMappings){
            Good good = goodMapper.selectByPrimaryKey(goodBusinessPartnerMapping.getGoodId());
            goods.add(good);
        }
        businessPartnerVo.setId(businessPartner.getId());
        businessPartnerVo.setName(businessPartner.getName());
        businessPartnerVo.setPhoneNum(businessPartner.getPhoneNum());
        businessPartnerVo.setPartnerType(businessPartner.getPartnerType());
        businessPartnerVo.setGoods(goods);
        return  businessPartnerVo;

    }

}

