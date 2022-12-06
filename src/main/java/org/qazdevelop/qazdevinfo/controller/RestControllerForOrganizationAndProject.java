package org.qazdevelop.qazdevinfo.controller;

import org.qazdevelop.qazdevinfo.entity.Organization;
import org.qazdevelop.qazdevinfo.entity.Project;
import org.qazdevelop.qazdevinfo.service.OrganizationService;
import org.qazdevelop.qazdevinfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestControllerForOrganizationAndProject {

    private final OrganizationService organizationService;

    private final ProjectService projectService;

    @Autowired
    public RestControllerForOrganizationAndProject(OrganizationService organizationService, ProjectService projectService) {
        this.organizationService = organizationService;
        this.projectService = projectService;
    }

    @PostMapping("/saveNewOrganization")
    public void saveNewOrganization(@RequestBody Organization organization){
        this.organizationService.saveOrganization(organization);
    }

    @GetMapping("/showAllOrganizations")
    public Iterable<Organization> showAllOrganizations(){
        return organizationService.findAllOrganizations();
    }

    @PostMapping("/saveNewProject")
    public void saveNewProject(@RequestBody Project project){
        this.projectService.saveProject(project);
    }

    @GetMapping("/showAllProjects")
    public Iterable<Project> showAllProjects(){
        return this.projectService.findAllProjects();
    }

}
