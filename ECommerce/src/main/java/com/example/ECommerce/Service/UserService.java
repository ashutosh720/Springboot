package com.example.ECommerce.Service;

import com.example.ECommerce.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(Integer userId);
    User createUser(User user);
    void deleteUser(Integer userId);

}
