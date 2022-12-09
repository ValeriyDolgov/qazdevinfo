package org.qazdevelop.qazdevinfo.repository;

import org.qazdevelop.qazdevinfo.entity.Relative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelativeRepository extends JpaRepository<Relative, Long> {
}
