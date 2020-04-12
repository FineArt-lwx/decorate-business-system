package com.finearter.dbs.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finearter.dbs.mapper.GoodBusinessPartnerMappingMapper;
import com.finearter.dbs.model.entity.GoodBusinessPartnerMapping;
import com.finearter.dbs.service.GoodBusinessPartnerMappingService;
@Service
public class GoodBusinessPartnerMappingServiceImpl implements GoodBusinessPartnerMappingService{

    @Resource
    private GoodBusinessPartnerMappingMapper goodBusinessPartnerMappingMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return goodBusinessPartnerMappingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GoodBusinessPartnerMapping record) {
        return goodBusinessPartnerMappingMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodBusinessPartnerMapping record) {
        return goodBusinessPartnerMappingMapper.insertSelective(record);
    }

    @Override
    public GoodBusinessPartnerMapping selectByPrimaryKey(Integer id) {
        return goodBusinessPartnerMappingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodBusinessPartnerMapping record) {
        return goodBusinessPartnerMappingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodBusinessPartnerMapping record) {
        return goodBusinessPartnerMappingMapper.updateByPrimaryKey(record);
    }

}
