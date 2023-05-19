package com.example.DoctorApp.repository;


import com.example.DoctorApp.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor, Long> {


    Doctor findByDoctorId(Long docId);
}
