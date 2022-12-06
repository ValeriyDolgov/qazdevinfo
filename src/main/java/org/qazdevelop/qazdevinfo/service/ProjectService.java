package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Project;
import org.qazdevelop.qazdevinfo.repository.OrganizationRepository;
import org.qazdevelop.qazdevinfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository repo;

    @Autowired
    public ProjectServiceImpl(ProjectRepository repo) {
        this.repo = repo;
    }

    @Override
    public void saveProject(Project project) {
        this.repo.save(project);
    }

    @Override
    public Iterable<Project> findAllProjects() {
        return this.repo.findAll();
    }
}
