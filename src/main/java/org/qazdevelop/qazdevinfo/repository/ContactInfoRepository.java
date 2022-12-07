package org.qazdevelop.qazdevinfo.repository;

import org.qazdevelop.qazdevinfo.entity.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo, Long> {
}
