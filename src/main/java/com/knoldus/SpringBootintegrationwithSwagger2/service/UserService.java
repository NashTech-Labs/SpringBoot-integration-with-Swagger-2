package com.knoldus.SpringBootintegrationwithSwagger2.service;

import com.knoldus.SpringBootintegrationwithSwagger2.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

/**
 * Created by shashikant on 24/07/22.
 * @version 11.0.11
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {

    }
    public Optional<com.knoldus.SpringBootintegrationwithSwagger2.model.User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(user -> getAllUser());
        return users;
    }

    public void updateUser(User user) {

    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}


