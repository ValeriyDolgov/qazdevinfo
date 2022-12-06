package org.qazdevelop.qazdevinfo.controller;

import org.qazdevelop.qazdevinfo.entity.WorkingHours;
import org.qazdevelop.qazdevinfo.service.WorkingHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkingHoursRestController {
    private final WorkingHoursService service;

    @Autowired
    public WorkingHoursRestController(WorkingHoursService service) {
        this.service = service;
    }

    @GetMapping("/showAllWorkingHours")
    public List<WorkingHours> showAllWorkingHours(){
        return this.service.findAllWorkingHours();
    }
}
