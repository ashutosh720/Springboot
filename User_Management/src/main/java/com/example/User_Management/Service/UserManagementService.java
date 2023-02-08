package com.example.User_Management.Service;

import com.example.User_Management.Model.UserManagement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserManagementService {

    private static List<UserManagement> users=new ArrayList<>();

    static {
        users.add(new UserManagement(1,"Avinash Tripathi","avtri1","23-A,Pragti Vihar,Dehradun",865500001));
        users.add(new UserManagement(2,"Axar Patel","axpat1","43-B,Vallabh Vihar,Ahemdabad",865500002));
        users.add(new UserManagement(3,"Bhaskar Dubey","bhdub1","23-B,Tapovan Vihar,Rishikesh",865500003));
        users.add(new UserManagement(4,"Bhuvan Roshan","bhros1","27-B,Mayur Vihar,Delhi",865500004));
        users.add(new UserManagement(5,"Chandresh Pandey","chpan1","23-A,Ram Vihar,Haldwani",865500005));
    }

    public List<UserManagement> findAll() { // Business Logic
        return users;
    }

    public UserManagement findById(int UserId) { // business LOgic
        Predicate<? super UserManagement> predicate = user -> user.getUserId() == UserId;
        UserManagement user = users.stream().filter(predicate).findFirst().get();
        return user;
    }

    public static void addUser(UserManagement user) {
        users.add(user);
    }

    public void deleteUser( int UserId) {
        Predicate<? super UserManagement> predicate = user -> user.getUserId() == UserId;
        users.removeIf(predicate);
    }

    public void updateUser(int UserId,UserManagement newUser) {
        //step 1: find user to update
        //Step 2: update

        UserManagement user=findById(UserId);// step 1

        user.setUserId(newUser.getUserId());
        user.setName(newUser.getName());
        user.setUserName(newUser.getUserName());
        user.setAddress(newUser.getAddress());
        user.setPhoneNumber(newUser.getPhoneNumber());
    }
}