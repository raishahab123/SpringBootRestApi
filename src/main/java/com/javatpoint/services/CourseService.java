package com.javatpoint.services;


import com.javatpoint.entities.Course;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface CourseService {


    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public  Course addCourse(Course course);

    public Course updateCourse(Course course);

    public  void deleteCourse(long parseLong);



}
