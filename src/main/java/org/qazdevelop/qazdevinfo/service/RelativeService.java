package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Relative;
import org.qazdevelop.qazdevinfo.repository.RelativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelativeService {

    private final RelativeRepository repo;

    @Autowired
    public RelativeService(RelativeRepository repo) {
        this.repo = repo;
    }

    public List<Relative> findAllReatives(){
        return repo.findAll();
    }

    public void saveNewRelative(Relative relative){
        repo.save(relative);
    }

}
