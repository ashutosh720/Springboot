package com.example.Mapping.Controller;

import com.example.Mapping.Entity.Course;
import com.example.Mapping.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/add")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @GetMapping("/all")
    public List<Course> getAllCourses() {

        return courseService.getAllCourses();
    }

    @GetMapping("/byId/{id}")
    public Course getCourseById(@PathVariable String id) {

        return courseService.getCourseById(id);
    }

    @PutMapping("/update/{id}")
    public void updateCourse(@PathVariable String id, @RequestBody Course course) {

        courseService.updateCourse(id,course);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
