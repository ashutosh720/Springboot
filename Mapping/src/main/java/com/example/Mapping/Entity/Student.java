package com.example.Mapping.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    private String ID;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    @ManyToMany(mappedBy = "studentList")
    private List<Course> courses = new ArrayList<>();

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;


}