package com.zhengyang.springbootquickstart.course.controller;

import com.zhengyang.springbootquickstart.course.dao.Course;
import com.zhengyang.springbootquickstart.topic.dao.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zhengyang.springbootquickstart.course.service.CourseService;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    //mark as dependency injection
    private CourseService courseService;


    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourse(@PathVariable String id){
        return courseService.getAllCourses(id);
        //the return type will be convert to Json automated

    }


    @RequestMapping("/topics/{topicId}/courses/{id}")
    //id is a variable
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);

    }


    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);

    }

    @PutMapping("/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId,@PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);

    }

    @DeleteMapping ("/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);

    }






}

