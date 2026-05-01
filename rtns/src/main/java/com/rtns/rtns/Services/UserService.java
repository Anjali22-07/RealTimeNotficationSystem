package com.rtns.rtns.Services;

import java.util.List;
import java.util.Optional;

import com.rtns.rtns.entity.User;

public interface UserService {

    public User saveUser(User user);
    public List<User> getUsers();
    public Optional<User> getUserById(Long Id);
}
