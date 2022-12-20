package org.qazdevelop.qazdevinfo.restcontroller;

import org.qazdevelop.qazdevinfo.entity.User;
import org.qazdevelop.qazdevinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService service;

    @Autowired
    public UserRestController(UserService service) {
        this.service = service;
    }

    @GetMapping("/showAllUsers")
    public List<User> showAllUsers() {
        return service.findAllUsers();
    }

    @PostMapping("/saveNewUser")
    public void saveNewUser(@RequestBody User user){
        service.saveNewUser(user);
    }
}
