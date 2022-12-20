package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.Address;
import org.qazdevelop.qazdevinfo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository repo;

    @Autowired
    public AddressService(AddressRepository repo) {
        this.repo = repo;
    }

    public List<Address> findAllAddresses(){
        return repo.findAll();
    }

    public void saveNewAddress(Address address){
        repo.save(address);
    }
}
