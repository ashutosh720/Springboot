package com.example.UserManagementValidation.Model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    /*UserId
username
DateOfBirth
email
Phone Number
Date
Time*/


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotEmpty
    @Size(min =4 , message = "Username must contain a minimum of four characters")
    private String userName;

    @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}")
    private String dob;

    @Email(message = "Email is invalid")
    private String email;

    @NotEmpty( message = "Phone number should be 12 digits")
    private String phoneNumber;

    private String Date;

    private String Time;





}
