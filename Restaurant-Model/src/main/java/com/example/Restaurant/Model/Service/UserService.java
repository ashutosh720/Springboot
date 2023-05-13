package com.example.Restaurant.Model.Service;


import com.example.Restaurant.Model.Model.User;
import com.example.Restaurant.Model.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User registerUser(User user){

        return userRepository.save(user);

    }

    public User authenticateUser(User user) {
        User authenticatedUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (authenticatedUser != null) {
            return authenticatedUser;
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }

    public boolean isAdmin(User user) {
        return user.getRole().equals("ADMIN");
    }


}
