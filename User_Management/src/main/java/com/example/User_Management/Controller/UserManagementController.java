package com.example.User_Management.Controller;

import com.example.User_Management.Model.UserManagement;
import com.example.User_Management.Service.UserManagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
@RestController
@RequestMapping("/api/user_management")
public class UserManagementController {


    private final UserManagementService userService;

    public UserManagementController(UserManagementService userService) {
        this.userService=userService;
    }


    //http://localhost:8080/api/user_management/add_user
    @PostMapping("/add_user")
    public void addUser(@RequestBody UserManagement user) {
        userService.addUser(user);
    }

    //http://localhost:8080/api/user_management/find_user/UserId/2
    @GetMapping("/find_user/UserId/{UserId}")
    //@RequestMapping(value="/find_user/UserId/{UserId}")
    public UserManagement findUserById(@PathVariable int UserId) {
        return userService.findById(UserId);
    }

    //http://localhost:8080/api/user_management/find_all
    @GetMapping("find_all")
    public List<UserManagement> findAllUsers() { // controller is talking to the service layer
        return userService.findAll();
    }

    //http://localhost:8080/api/user_management/update_user/UserId/4
    //@RequestMapping(value="url",method=HttpRequest.PUT)
    @PutMapping("update_user/UserId/{UserId}")
    public void updateUser(@PathVariable int UserId,@RequestBody UserManagement user) {
        userService.updateUser(UserId,user);
    }

    //http://localhost:8080/api/user_management/delete_user/UserId/3
    @DeleteMapping("delete_user/UserId/{UserId}")
    public void deleteUser(@PathVariable int UserId) {
        userService.deleteUser(UserId);
    }
}



