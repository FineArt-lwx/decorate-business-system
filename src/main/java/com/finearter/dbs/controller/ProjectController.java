package com.finearter.dbs.controller;

import com.finearter.dbs.service.ProjectService;
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


}