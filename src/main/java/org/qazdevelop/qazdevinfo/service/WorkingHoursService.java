package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.WorkingHours;
import org.qazdevelop.qazdevinfo.repository.WorkingHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkingHoursServiceImpl implements WorkingHoursService{

    private final WorkingHoursRepository repo;

    @Autowired
    public WorkingHoursServiceImpl(WorkingHoursRepository repo) {
        this.repo = repo;
    }

    @Override
    public void saveWorkingHours(WorkingHours workingHours) {
        this.repo.save(workingHours);
    }

    @Override
    public Iterable<WorkingHours> findAllWorkingHours() {
        return this.repo.findAll();
    }
}
