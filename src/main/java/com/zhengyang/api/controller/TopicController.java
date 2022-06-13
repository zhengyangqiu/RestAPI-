package com.zhengyang.api.controller;

import com.zhengyang.api.dao.Topic;
import com.zhengyang.api.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    //mark as dependency injection
    private TopicService topicService;




    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
        //the return type will be convert to Json automated

    }


    @RequestMapping("/topics/{id}")
    //id is a variable
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);

    }


    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);

    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.updateTopic(topic,id);

    }

    @DeleteMapping ("/topics/{id}")
    public void updateTopic(@PathVariable String id){
        topicService.deleteTopic(id);

    }






}

