package com.finearter.dbs.controller;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Project;
import com.finearter.dbs.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Project)表控制层
 *
 * @author makejava
 * @since 2020-04-12 17:12:08
 */
@RestController
@RequestMapping("project")
public class ProjectController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectService projectService;


    /**
     * 查询所有工程
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @GetMapping("all")
    public ResultDto selectAll(Integer pageIndex,Integer pageSize){
        return projectService.selectAll(pageIndex,pageSize);

    }

    /**
     * 新建工程
     * @param project
     * @return
     */
    @PutMapping("/addProject")
    public ResultDto addProject(Project project){
        return projectService.addProject(project);
    }


}
