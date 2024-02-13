package com.solix.com.Service_1.service;

import com.solix.com.Service_1.domain.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public List<User> getAllUsers();

    public User getUserById(long id);


}
