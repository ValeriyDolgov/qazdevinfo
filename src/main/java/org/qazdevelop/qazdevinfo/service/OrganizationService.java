package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Organization;
import org.qazdevelop.qazdevinfo.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository repository;

    @Autowired
    public OrganizationServiceImpl(OrganizationRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveOrganization(Organization organization) {
        this.repository.save(organization);
    }

    @Override
    public Iterable<Organization> findAllOrganizations() {
        return repository.findAll();
    }
}
