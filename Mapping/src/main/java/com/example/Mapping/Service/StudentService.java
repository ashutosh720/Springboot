package com.example.Mapping.Service;

import com.example.Mapping.Entity.Student;
import com.example.Mapping.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(String id, Student newStudent) {
        Student student = studentRepository.findById(id).get();

        student.setName(newStudent.getName());
        student.setAge(newStudent.getAge());
        student.setPhoneNumber(newStudent.getPhoneNumber());
        student.setBranch(newStudent.getBranch());
        student.setDepartment(newStudent.getDepartment());
        student.setAddress(newStudent.getAddress());
        return studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}

