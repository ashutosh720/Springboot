package com.example.UniversityEventManagementSystem.Service;

import com.example.UniversityEventManagementSystem.Model.Student;

import java.util.List;

public interface stuService {

    /*Add student
update student department
delete student
Get all students
Get student by I'd
Add event
Update event
Delete event
Get All event by date*/

    public List<Student> getStudents();

    public Student getbyId(String studentId);

    public Student addStudent(Student stud);

    public Student updateStudent(Student stud);

    void deleteStudent(String studentId);


}
