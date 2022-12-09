package org.qazdevelop.qazdevinfo.controller;

import org.qazdevelop.qazdevinfo.entity.Organization;
import org.qazdevelop.qazdevinfo.entity.Project;
import org.qazdevelop.qazdevinfo.service.OrganizationService;
import org.qazdevelop.qazdevinfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//TODO Разделить это контроллер на 2
@RestController
@RequestMapping("/api/organizations")
public class OrganizationRestController {

    private final OrganizationService organizationService;

    @Autowired
    public OrganizationRestController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping("/saveNewOrganization")
    public void saveNewOrganization(@RequestBody Organization organization){
        this.organizationService.saveOrganization(organization);
    }

    @GetMapping("/showAllOrganizations")
    public Iterable<Organization> showAllOrganizations(){
        return organizationService.findAllOrganizations();
    }
}
