package org.qazdevelop.qazdevinfo.repository;

import org.qazdevelop.qazdevinfo.entity.WorkingHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingHoursRepository extends JpaRepository<WorkingHours, Long> {
}
