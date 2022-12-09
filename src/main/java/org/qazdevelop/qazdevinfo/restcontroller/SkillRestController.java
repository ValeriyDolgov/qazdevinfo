package org.qazdevelop.qazdevinfo.restcontroller;

import org.qazdevelop.qazdevinfo.entity.Skill;
import org.qazdevelop.qazdevinfo.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillRestController {

    private final SkillService service;

    @Autowired
    public SkillRestController(SkillService service) {
        this.service = service;
    }

    @GetMapping("/showAllSkills")
    public List<Skill> showAllSkills(){
        return service.findAllSkills();
    }

    @PostMapping("/saveNewSkill")
    public void saveNewSkill(@RequestBody Skill skill){
        service.saveNewSkill(skill);
    }
}
