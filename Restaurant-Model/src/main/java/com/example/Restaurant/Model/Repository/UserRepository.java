package com.example.Restaurant.Model.Repository;


import com.example.Restaurant.Model.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "Select * from users where username = :username and password = :password", nativeQuery = true)
    public User findByUsernameAndPassword(String username,String password);

    @Query(value="Select * from users where user_id = :user_id", nativeQuery = true)
    public User getadmin(int user_id);



}