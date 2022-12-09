package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Position;
import org.qazdevelop.qazdevinfo.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {

    private final PositionRepository repo;

    @Autowired
    public PositionService(PositionRepository repo) {
        this.repo = repo;
    }

    public void saveNewPosition(Position position){
        repo.save(position);
    }

    public List<Position> findAllPositions(){
        return repo.findAll();
    }
}
