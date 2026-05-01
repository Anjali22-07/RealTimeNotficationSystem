package com.rtns.rtns.Services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtns.rtns.Repository.UserRepository;
import com.rtns.rtns.entity.User;

@Service
public class UserImplementation implements UserService{
    
  @Autowired
  UserRepository userRepository;

  public User saveUser(User user){
    
    return userRepository.save(user);
  }

  public List<User> getUsers(){
    return userRepository.findAll();
  }
     
  public Optional<User> getUserById(Long Id){
    return userRepository.findById(Id);
  }
}
