package org.qazdevelop.qazdevinfo.service;

import org.qazdevelop.qazdevinfo.entity.User;
import org.qazdevelop.qazdevinfo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAllUsers(){
        return repo.findAll();
    }

    public void saveNewUser(User user){
        repo.save(user);
    }
}
