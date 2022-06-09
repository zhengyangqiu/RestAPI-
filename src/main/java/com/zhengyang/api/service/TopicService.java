package com.zhengyang.api.service;

import com.zhengyang.api.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    //business service are typically singletons,when application start up,spring crate an instance of this service
    //and keep that in the memory and register that instance

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","spring framework","Spring framework description"),
                new Topic("java","core java","core java description"),
                new Topic("javascript","Javascript","Javascript description")
        ));

    public List<Topic>getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);


    }
}
