package com.example.Mapping.Service;

import com.example.Mapping.Entity.Course;
import com.example.Mapping.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(String id) {
        return courseRepository.findById(id).get();
    }

    public Course updateCourse(String id, Course newCourse) {
        Course course = courseRepository.findById(id).get();
        course.setTitle(newCourse.getTitle());
        course.setDescription(newCourse.getDescription());
        course.setDuration(newCourse.getDuration());
        course.setStudentList(newCourse.getStudentList());
        return courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
