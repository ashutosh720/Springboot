package com.example.DoctorApp.controller;



import com.example.DoctorApp.Model.Appointment;
import com.example.DoctorApp.Model.Doctor;
import com.example.DoctorApp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService docService;

    @PostMapping()
    void addDoctors(@RequestBody Doctor doc)
    {
        docService.addDoc(doc);
    }

    @GetMapping("{docId}/appointments")
    ResponseEntity<List<Appointment>> getDocMyAppointments(@PathVariable Long docId)
    {

        List<Appointment> myAppointments = null;
        HttpStatus status;
        try
        {
            myAppointments = docService.getMyAppointments(docId);
            //System.out.println(myAppointments);
            if(myAppointments.isEmpty())
            {
                status = HttpStatus.NO_CONTENT;
            }
            else
            {
                status = HttpStatus.OK;
            }
        }
        catch(Exception e)
        {
            System.out.println("The doc Id is not valid");
            status = HttpStatus.BAD_REQUEST;

        }

        return new ResponseEntity<List<Appointment>>(myAppointments,status);

    }


}
