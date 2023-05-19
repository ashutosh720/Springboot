package com.example.DoctorApp.repository;

import com.example.DoctorApp.Model.AuthenticationToken;
import com.example.DoctorApp.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Patient patient);

    AuthenticationToken findFirstByToken(String token);
}
