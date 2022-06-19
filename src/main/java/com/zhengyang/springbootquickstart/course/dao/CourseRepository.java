package com.zhengyang.springbootquickstart.course.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String>{

    //CrudRepository is the interface from spring jpa has all the necessary method

    //spring data jpa will implement the method for you
    public List<Course> findByName(String Name);

    public List<Course> findByDescription(String description);
    public List<Course> findByTopicId(String topicId);










}
