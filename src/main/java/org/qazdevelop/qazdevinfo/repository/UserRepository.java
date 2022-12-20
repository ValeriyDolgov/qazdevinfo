package org.qazdevelop.qazdevinfo.repository;

import org.qazdevelop.qazdevinfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
