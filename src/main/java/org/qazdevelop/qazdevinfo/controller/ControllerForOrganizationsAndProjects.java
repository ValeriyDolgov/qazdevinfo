package org.qazdevelop.qazdevinfo.controller;

import org.qazdevelop.qazdevinfo.service.OrganizationService;
import org.qazdevelop.qazdevinfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerForOrganizationsAndProjects {

    private final OrganizationService organizationService;

    private final ProjectService projectService;

    @Autowired
    public ControllerForOrganizationsAndProjects(OrganizationService organizationService, ProjectService projectService) {
        this.organizationService = organizationService;
        this.projectService = projectService;
    }

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

    @GetMapping("/showAllOrganizations")
    public String showAllOrganizations(Model model){
        model.addAttribute("listOfOrganizations", organizationService.findAllOrganizations());
        return "list_of_organizations";
    }
}
