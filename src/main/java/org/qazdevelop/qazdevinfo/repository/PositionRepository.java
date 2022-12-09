package org.qazdevelop.qazdevinfo.repository;

import org.qazdevelop.qazdevinfo.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
}
