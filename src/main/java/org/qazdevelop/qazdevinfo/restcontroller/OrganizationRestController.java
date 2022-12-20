package org.qazdevelop.qazdevinfo.restcontroller;

import org.qazdevelop.qazdevinfo.entity.Organization;
import org.qazdevelop.qazdevinfo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Organization> showAllOrganizations(){
        return organizationService.findAllOrganizations();
    }
}
