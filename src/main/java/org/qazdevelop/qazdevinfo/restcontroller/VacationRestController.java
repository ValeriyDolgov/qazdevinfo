package org.qazdevelop.qazdevinfo.restcontroller;

import org.qazdevelop.qazdevinfo.entity.Vacation;
import org.qazdevelop.qazdevinfo.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vacations")
public class VacationRestController {

    private final VacationService service;

    @Autowired
    public VacationRestController(VacationService service) {
        this.service = service;
    }

    @GetMapping("/showAllVacations")
    public List<Vacation> showAllVacations(){
        return service.findAllVacations();
    }

    @PostMapping("/saveNewVacation")
    public void saveNewVacation(@RequestBody Vacation vacation){
        service.saveNewVacation(vacation);
    }
}
