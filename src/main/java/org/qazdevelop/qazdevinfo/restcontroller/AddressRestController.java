package org.qazdevelop.qazdevinfo.restcontroller;

import org.qazdevelop.qazdevinfo.entity.Address;
import org.qazdevelop.qazdevinfo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressRestController {

    private final AddressService service;

    @Autowired
    public AddressRestController(AddressService service) {
        this.service = service;
    }

    @GetMapping("/showAllAddresses")
    public List<Address> showAllAddresses(){
        return service.findAllAddresses();
    }

    @PostMapping("/saveNewAddress")
    public void saveNewAddress(@RequestBody Address address){
        service.saveNewAddress(address);
    }
}
