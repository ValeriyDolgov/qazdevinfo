package org.qazdevelop.qazdevinfo.repository;

import org.qazdevelop.qazdevinfo.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
