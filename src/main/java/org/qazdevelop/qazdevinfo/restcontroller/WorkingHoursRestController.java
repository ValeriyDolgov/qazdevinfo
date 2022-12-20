package org.qazdevelop.qazdevinfo.restcontroller;

import org.qazdevelop.qazdevinfo.entity.WorkingHours;
import org.qazdevelop.qazdevinfo.service.WorkingHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workingHours")
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

    @PostMapping("/saveNewWorkingHours")
    public void saveNewWorkingHours(@RequestBody WorkingHours workingHours){
        service.saveWorkingHours(workingHours);
    }
}
