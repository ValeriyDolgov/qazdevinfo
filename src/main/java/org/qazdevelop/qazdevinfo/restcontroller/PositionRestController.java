package org.qazdevelop.qazdevinfo.restcontroller;

import org.qazdevelop.qazdevinfo.entity.Position;
import org.qazdevelop.qazdevinfo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionRestController {

    private final PositionService service;

    @Autowired
    public PositionRestController(PositionService service) {
        this.service = service;
    }

    @GetMapping("/showAllPositions")
    public List<Position> showAllPositions(){
        return service.findAllPositions();
    }

    @PostMapping("/saveNewPosition")
    public void saveNewPosition(@RequestBody Position position){
        service.saveNewPosition(position);
    }
}
