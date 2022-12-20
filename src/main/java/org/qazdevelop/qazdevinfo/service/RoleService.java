package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Role;
import org.qazdevelop.qazdevinfo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    private final RoleRepository repo;

    @Autowired
    public RoleService(RoleRepository repo) {
        this.repo = repo;
    }

    public List<Role> findAllRoles(){
        return repo.findAll();
    }

    public void saveNewRole(Role role){
        repo.save(role);
    }
}
