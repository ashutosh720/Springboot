package com.example.DoctorApp.repository;


import com.example.DoctorApp.Model.Appointment;
import com.example.DoctorApp.Model.AppointmentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment, AppointmentKey> {

    public String findByIdAppId(Long id);
}
