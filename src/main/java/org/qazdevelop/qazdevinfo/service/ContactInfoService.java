package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.ContactInfo;
import org.qazdevelop.qazdevinfo.repository.ContactInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactInfoService {

    private final ContactInfoRepository repo;

    @Autowired
    public ContactInfoService(ContactInfoRepository repo) {
        this.repo = repo;
    }

    public void saveNewContactInfo(ContactInfo info){
        repo.save(info);
    }

    public List<ContactInfo> findAllContactInfo(){
        return repo.findAll();
    }
}
