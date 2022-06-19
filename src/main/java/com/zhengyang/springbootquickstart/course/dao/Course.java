package com.zhengyang.springbootquickstart.course.dao;

import com.zhengyang.springbootquickstart.topic.dao.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//we need to save the topic class into database
//by adding entity,jpa know to create a table call topic with three columns
public class Course {
    @Id
    //add Id to make it become primary key
    private String id;
    private String name;
    private String description;
    //many to one relationship,many courses to one topic
    @ManyToOne
    private Topic topic;
    //tie course to particular topic

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
    }

    public Course() {

    }


    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
