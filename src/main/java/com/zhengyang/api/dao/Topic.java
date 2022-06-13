package com.zhengyang.api.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//we need to save the topic class into database
//by adding entity,jpa know to create a table call topic with three columns
public class Topic {
    @Id
    //add Id to make it become primary key
    private String id;
    private String name;
    private String description;

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

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Topic() {

    }


}
