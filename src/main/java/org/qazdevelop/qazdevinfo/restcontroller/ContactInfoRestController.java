package org.qazdevelop.qazdevinfo.restcontroller;

import org.qazdevelop.qazdevinfo.entity.ContactInfo;
import org.qazdevelop.qazdevinfo.service.ContactInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contactInfos")
public class ContactInfoRestController {

    private final ContactInfoService service;

    @Autowired
    public ContactInfoRestController(ContactInfoService service) {
        this.service = service;
    }

    @GetMapping("/showAllContactInfos")
    public List<ContactInfo> showAllContactInformation(){
        return service.findAllContactInfo();
    }

    @PostMapping("/saveNewContactInfo")
    public void saveNewContactInformation(@RequestBody ContactInfo contactInfo){
        service.saveNewContactInfo(contactInfo);
    }
}
