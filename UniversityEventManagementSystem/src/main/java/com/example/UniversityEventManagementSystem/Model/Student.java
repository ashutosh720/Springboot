package com.example.UniversityEventManagementSystem.Model;

public class Student {
   // StudentId
   // first name
   // last name
    //age
    //department
    private String studentId;

    private String firstname;

    private String lastname;

    private int age;

    private String department;

    public Student(String studentId, String firstname, String lastname, int age, String department) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.department = department;
    }

    public Student(){}


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
