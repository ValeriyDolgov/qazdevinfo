package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Employee;
import org.qazdevelop.qazdevinfo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    @Autowired
    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public void saveNewEmployee(Employee employee){
        repo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return repo.findAll();
    }
}
