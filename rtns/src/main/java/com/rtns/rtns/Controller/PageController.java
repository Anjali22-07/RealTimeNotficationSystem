package com.rtns.rtns.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rtns.rtns.Services.UserImplementation;
import com.rtns.rtns.entity.User;

@RestController 
public class PageController {

    @Autowired
    UserImplementation userImplementation;

    @PostMapping("/user")
    public User userApi(@RequestBody User user){
      return userImplementation.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getUser(){
         return userImplementation.getUsers();
    }

     @GetMapping("/users/{Id}")
    public Optional<User> getUser(@PathVariable Long Id){
         return userImplementation.getUserById(Id);
    }
}
