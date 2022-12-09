package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Skill;
import org.qazdevelop.qazdevinfo.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepository repo;

    @Autowired
    public SkillService(SkillRepository repo) {
        this.repo = repo;
    }

    public void saveNewSkill(Skill skill){
        repo.save(skill);
    }

    public List<Skill> findAllSkills(){
        return repo.findAll();
    }

}
