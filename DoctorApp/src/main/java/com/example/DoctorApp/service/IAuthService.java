package com.example.DoctorApp.service;


import com.example.DoctorApp.Model.AuthenticationToken;
import com.example.DoctorApp.Model.Patient;

public interface IAuthService {

     void saveToken(AuthenticationToken token);
     AuthenticationToken getToken(Patient patient);
     boolean authenticate(String userEmail, String token);


}
