package com.javatpoint.services;

import com.javatpoint.dao.CourseDao;
import com.javatpoint.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;


//    List<Course> list;

//    public CourseServiceImpl(){
//          list=new ArrayList<>();
//        list.add(new Course(10,"java","this is programming launguage"));
//        list.add(new Course(11,"Spring Boot","Spring Boot Rest Api"));
//
//    }
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {

//        Course c=null;
//
//        for(Course course:list){
//
//            if(course.getId()==courseId){
//
//                c=course;
//                break;
//            }
//        }

        return courseDao.getReferenceById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {

//        list.forEach(e ->{
//
//            if(e.getId()==course.getId()){
//
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {


//        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
       Course entity= courseDao.getReferenceById(parseLong);
       courseDao.delete(entity);
    }
}
