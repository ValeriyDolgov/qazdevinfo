package org.qazdevelop.qazdevinfo.controller;

import org.qazdevelop.qazdevinfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService service;

    @Autowired
    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping("/showAllProjects")
    public String findAllProjects(@ModelAttribute Model model){
        model.addAttribute("listOfAllProjects", service.findAllProjects());
        return "list_of_projects";
    }

    //TODO Сделать save method
//    @PostMapping("/saveNewProject")
//    public String saveNewProject(){}
}
