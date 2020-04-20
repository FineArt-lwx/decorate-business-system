package com.finearter.dbs.service.impl;

import com.finearter.dbs.mapper.*;
import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.*;
import com.finearter.dbs.model.vo.ProjectVo;
import com.finearter.dbs.service.ProjectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;


    @Resource
    private HouseMapper houseMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private CustomerMapper customerMapper;


    @Resource
    private DecoratePlanMapper decoratePlanMapper;


    @Resource
    private ProjectGoodMappingMapper projectGoodMappingMapper;


    @Resource
    private GoodMapper goodMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return projectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Project record) {
        return projectMapper.insert(record);
    }

    @Override
    public int insertSelective(Project record) {
        return projectMapper.insertSelective(record);
    }

    @Override
    public Project selectByPrimaryKey(Integer id) {
        return projectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Project record) {
        return projectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Project record) {
        return projectMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll(Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex, pageSize);

        ArrayList<Project> projects = projectMapper.selectByAnyCondition(new Project());

        ArrayList<ProjectVo> projectVos = new ArrayList<>();
        for (Project project : projects) {
            ProjectVo projectVo = projectConvertProjectVo(project);
            projectVos.add(projectVo);
        }

        PageInfo pageInfo = new PageInfo(projectVos);
        ResultDto resultDto = new ResultDto();
        resultDto.setData(pageInfo);


        return resultDto;
    }

    @Override
    public ResultDto addProject(Project project) {
        int insert = projectMapper.insert(project);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(insert);
        return resultDto;
    }

    private ProjectVo projectConvertProjectVo(Project project) {

        ProjectVo projectVo = new ProjectVo();

        House house = houseMapper.selectByPrimaryKey(project.getId());

        Customer customer = customerMapper.selectByPrimaryKey(project.getCustomerId());

        User user = userMapper.selectByPrimaryKey(project.getPrincipalId());

        DecoratePlan decoratePlan = decoratePlanMapper.selectByPrimaryKey(project.getDecorateId());


        ProjectGoodMapping condition=new ProjectGoodMapping();
        condition.setProjectId(project.getId());
        ArrayList<ProjectGoodMapping> projectGoodMappings=projectGoodMappingMapper.selectByAnyCondition(condition);

        ArrayList<Good> goods=new ArrayList<>();
        for(ProjectGoodMapping projectGoodMapping:projectGoodMappings){
            Good good = goodMapper.selectByPrimaryKey(projectGoodMapping.getGoodId());
            goods.add(good);
        }




        projectVo.setId(project.getId());
        projectVo.setExpectEndDate(project.getExpectEndDate());
        projectVo.setFloatDateDeclare(project.getFloatDateDeclare());
        projectVo.setProjectCycle(project.getProjectCycle());
        projectVo.setHouse(house);
        projectVo.setCustomer(customer);
        projectVo.setPrincipal(user);
        projectVo.setDecoratePlan(decoratePlan);
        projectVo.setGoods(goods);

        return projectVo;
    }

}
