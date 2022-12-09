package org.qazdevelop.qazdevinfo.repository;

import org.qazdevelop.qazdevinfo.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
