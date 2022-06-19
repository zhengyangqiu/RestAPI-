package com.zhengyang.springbootquickstart.topic.dao;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String>{

    //CrudRepository is the interface from spring jpa has all the necessary method






}
