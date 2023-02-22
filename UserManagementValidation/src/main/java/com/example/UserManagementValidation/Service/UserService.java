package com.example.UserManagementValidation.Service;


import com.example.UserManagementValidation.Model.User;
import com.example.UserManagementValidation.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(int userId) {
        return userRepository.findById(userId).get();

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUserInfo(int userId, User user) {
        User uuser = userRepository.findById(userId).get();


        return userRepository.save(uuser);
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
