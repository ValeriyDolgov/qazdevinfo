package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.WorkingHours;
import org.qazdevelop.qazdevinfo.repository.WorkingHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkingHoursService {

    private final WorkingHoursRepository repo;

    @Autowired
    public WorkingHoursService(WorkingHoursRepository repo) {
        this.repo = repo;
    }

    public void saveWorkingHours(WorkingHours workingHours) {
        repo.save(workingHours);
    }

    public List<WorkingHours> findAllWorkingHours() {
        return repo.findAll();
    }
}
