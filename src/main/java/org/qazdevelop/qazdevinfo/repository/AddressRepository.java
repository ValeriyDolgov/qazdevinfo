package org.qazdevelop.qazdevinfo.repository;

import org.qazdevelop.qazdevinfo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
