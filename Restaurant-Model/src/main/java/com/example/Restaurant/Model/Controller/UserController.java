package com.example.Restaurant.Model.Controller;

import com.example.Restaurant.Model.Model.User;
import com.example.Restaurant.Model.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@Valid @RequestBody User user) {
        User savedUser = userService.registerUser(user);
        return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
    }


    @PostMapping("/authenticate")
    public ResponseEntity<User> authenticateUser(@RequestBody User user) {
        User authenticatedUser = userService.authenticateUser(user);
        return new ResponseEntity<User>(authenticatedUser, HttpStatus.OK);
    }


}