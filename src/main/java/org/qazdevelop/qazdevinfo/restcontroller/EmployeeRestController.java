package org.qazdevelop.qazdevinfo.controller;

import org.qazdevelop.qazdevinfo.entity.Employee;
import org.qazdevelop.qazdevinfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    private final EmployeeService service;

    @Autowired
    public EmployeeRestController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/showAllEmployees")
    public List<Employee> showAllEmployees(){
        return service.findAllEmployees();
    }

    @PostMapping("/saveNewEmployee")
    public void saveNewEmployee(@RequestBody Employee employee){
        service.saveNewEmployee(employee);
    }
}
