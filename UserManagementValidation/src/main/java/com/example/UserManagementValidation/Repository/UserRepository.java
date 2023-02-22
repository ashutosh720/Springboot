package com.example.UserManagementValidation.Repository;

import com.example.UserManagementValidation.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
