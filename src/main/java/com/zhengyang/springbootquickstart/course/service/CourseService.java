package com.zhengyang.springbootquickstart.course.service;

import com.zhengyang.springbootquickstart.course.dao.Course;
import com.zhengyang.springbootquickstart.course.dao.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    //business service are typically singletons,when application start up,spring crate an instance of this service
    //and keep that in the memory and register that instance

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring","spring framework","Spring framework description"),
//                new Topic("java","core java","core java description"),
//                new Topic("javascript","Javascript","Javascript description")
//        ));

    public List<Course>getAllCourses(String topicId){
        List<Course> courses= new ArrayList<>();

        courseRepository.findByTopicId(topicId).forEach(courses::add);//lambda expression
        //for each of element in the iterable,calling the add method on the topic and pass the element
        return courses;
    }

    public Course getCourse(String id){
        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).orElse(null);

    }

    public void addCourse(Course course){
        //topics.add(topic);
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
//        for (int i =0;i <topics.size();i++){
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)){
//                topics.set(i,topic);
//                return;
//
//            }
//        }

        courseRepository.save(course);
    }

    public void deleteCourse(String id) {

        //topics.removeIf(t->t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
