package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Project;
import org.qazdevelop.qazdevinfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository repo;

    @Autowired
    public ProjectService(ProjectRepository repo) {
        this.repo = repo;
    }

    public void saveProject(Project project) {
        repo.save(project);
    }

    public List<Project> findAllProjects() {
        return repo.findAll();
    }
}
