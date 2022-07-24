package com.knoldus.SpringBootintegrationwithSwagger2.controller;

import com.knoldus.SpringBootintegrationwithSwagger2.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/users")
    public class UserController {
        @Autowired
        private UserService userService;

        @PostMapping()
        public void addUser(@RequestBody User user) {
            userService.addUser(user);
        }

        @GetMapping("/{id}")
        public Optional<com.knoldus.SpringBootintegrationwithSwagger2.model.User> getUser(@PathVariable Long id) {
            return userService.getUser(id);
        }

        @GetMapping()
        public List<User> getAllUser() {
            return  userService.getAllUser();
        }

        @PutMapping("/{id}")
        public void updateUser(@RequestBody User user) {
            userService.updateUser(user);
        }

        @DeleteMapping("/{id}")
        public void deleteUser(@PathVariable Long id) {
            userService.deleteUser(id);
        }
    }

