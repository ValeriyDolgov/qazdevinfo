package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Vacation;
import org.qazdevelop.qazdevinfo.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacationService {

    private final VacationRepository repo;

    @Autowired
    public VacationService(VacationRepository repo) {
        this.repo = repo;
    }

    public void saveNewVacation(Vacation vacation){
        repo.save(vacation);
    }

    public List<Vacation> findAllVacations(){
        return repo.findAll();
    }
}
