package org.qazdevelop.qazdevinfo.restcontroller;

import org.qazdevelop.qazdevinfo.entity.Role;
import org.qazdevelop.qazdevinfo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleRestController {

    private final RoleService service;

    @Autowired
    public RoleRestController(RoleService service) {
        this.service = service;
    }

    @GetMapping("/showAllRoles")
    public List<Role> showAllRoles(){
        return service.findAllRoles();
    }

    @PostMapping("/saveNewRole")
    public void saveNewRole(@RequestBody Role role){
        service.saveNewRole(role);
    }
}
