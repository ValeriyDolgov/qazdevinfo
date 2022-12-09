package org.qazdevelop.qazdevinfo.controller;

import org.qazdevelop.qazdevinfo.entity.Relative;
import org.qazdevelop.qazdevinfo.service.RelativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/relatives")
public class RelativeRestController {

    private final RelativeService service;

    @Autowired
    public RelativeRestController(RelativeService service) {
        this.service = service;
    }

    @GetMapping("/showAllRelatives")
    public List<Relative> showAllRelatives(){
        return service.findAllReatives();
    }

    @PostMapping("/saveNewRelative")
    public void saveNewRelative(@RequestBody Relative relative) {
        service.saveNewRelative(relative);
    }

}
