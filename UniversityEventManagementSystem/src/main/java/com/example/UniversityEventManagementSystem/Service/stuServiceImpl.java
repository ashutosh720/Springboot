package com.example.UniversityEventManagementSystem.Service;

import com.example.UniversityEventManagementSystem.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class stuServiceImpl implements stuService{


    List<Student> studentList;

    public stuServiceImpl(){
        studentList=new ArrayList<>();
        studentList.add(new Student("18001011","Abhishek","Kumar",21,"Mechanical Engineering"));
        studentList.add(new Student("18001012","Ajay","Bisht",22, "Mechanical Engineering" ));
        studentList.add(new Student("18001013","Anant","Bajpai",22,"Civil Engineering"));
        studentList.add(new Student("18001014","Ankit","Chauhan",21,"Computer Science"));
        studentList.add(new Student("18001015","Ashish","Sharma",22,"Electrical Engineering"));
    }


    @Override
    public List<Student> getStudents() {
        return studentList;
    }

    @Override
    public Student getbyId(String studentId) {
        Student st=null;
        for(Student sd:studentList){

            if(sd.getStudentId().equals(studentId)){
                st=sd;
                break;
            }

        }
        return st;
    }

    @Override
    public Student addStudent(Student stud) {
        studentList.add(stud);
        return stud;

    }

    @Override
    public Student updateStudent(Student stud) {
        return stud;
    }

    @Override
    public void deleteStudent(String studentId) {

            Student st=null;
            for(Student sd:studentList){

                if(sd.getStudentId().equals(studentId)){
                    st=sd;
                }

            }
            studentList.remove(st);

            for(Student s:studentList){
                System.out.println(s);
            }

        }


}
