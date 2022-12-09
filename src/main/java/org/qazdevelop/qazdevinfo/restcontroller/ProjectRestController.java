package org.qazdevelop.qazdevinfo.controller;

import org.qazdevelop.qazdevinfo.entity.Project;
import org.qazdevelop.qazdevinfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectRestController {

    private final ProjectService service;

    @Autowired
    public ProjectRestController(ProjectService service) {
        this.service = service;
    }

    @GetMapping("/showAllProjects")
    public List<Project> showAllProjects(){
        return service.findAllProjects();
    }

    @PostMapping("/saveNewProject")
    public void saveNewProject(@RequestBody Project project){
        service.saveProject(project);
    }
}
