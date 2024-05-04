package com.javatpoint.controller;


import com.javatpoint.entities.Course;
import com.javatpoint.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
     private CourseService courseService;

    @GetMapping("/home")
    public String home(){

        return "this is spring boot rest api";

    }

       // get All courses
    @GetMapping("/course")
    public List<Course> getAllCourses(){

        return  this.courseService.getCourses();
    }

    //get single course
    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId){

        return  this.courseService.getCourse(Long.parseLong(courseId));
    }

      //add course
    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course){

        return this.courseService.addCourse(course);
    }
    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course){

        return this.courseService.updateCourse(course);
    }


    //delete course basis on the courseId

    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<HttpStatus> daleteCourse(@PathVariable String courseId){

       try {

        this.courseService.deleteCourse(Long.parseLong(courseId));
        return  new ResponseEntity<>(HttpStatus.OK);

    }catch (Exception e){

        return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

    }

    }
}
