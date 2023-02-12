package com.example.UniversityEventManagementSystem.Controller;

import com.example.UniversityEventManagementSystem.Model.Student;
import com.example.UniversityEventManagementSystem.Service.stuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class stuController {

    @Autowired
    private stuService stuservice;

    public stuController(stuService stuservice) {
        this.stuservice = stuservice;
    }

    @GetMapping("/home")
    public String home(){
        return "Welcome to Student Model";
    }

    @GetMapping("/all-students")
    public List<Student> getStudents(){

        return this.stuservice.getStudents();

    }

    @GetMapping("/get-student/studentId/{studentId}")
    public Student getbyId(@PathVariable String studentId){

        return this.stuservice.getbyId(studentId);
    }

    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student stud){

        return this.stuservice.addStudent(stud);
    }

    @PutMapping("/update-student")
    public Student updateStudent(@RequestBody Student stud){

        return this.stuservice.updateStudent(stud);
    }

    @DeleteMapping("/delete-student/studentId/{studentId}")
    public  void deleteStudent(@PathVariable String studentId){
        this.stuservice.deleteStudent(studentId);
    }

}
