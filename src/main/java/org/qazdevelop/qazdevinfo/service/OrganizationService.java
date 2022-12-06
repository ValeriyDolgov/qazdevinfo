package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Organization;
import org.qazdevelop.qazdevinfo.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    private final OrganizationRepository repository;

    @Autowired
    public OrganizationService(OrganizationRepository repository) {
        this.repository = repository;
    }

    public void saveOrganization(Organization organization) {
        repository.save(organization);
    }

    public List<Organization> findAllOrganizations() {
        return repository.findAll();
    }
}
