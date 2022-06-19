package com.zhengyang.springbootquickstart.topic.service;

import com.zhengyang.springbootquickstart.topic.dao.Topic;
import com.zhengyang.springbootquickstart.topic.dao.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    //business service are typically singletons,when application start up,spring crate an instance of this service
    //and keep that in the memory and register that instance

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring","spring framework","Spring framework description"),
//                new Topic("java","core java","core java description"),
//                new Topic("javascript","Javascript","Javascript description")
//        ));

    public List<Topic>getAllTopics(){
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        //for each of element in the iterable,calling the add method on the topic and pass the element
        return topics;
    }

    public Topic getTopic(String id){
        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).orElse(null);


    }

    public void addTopic(Topic topic){
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
//        for (int i =0;i <topics.size();i++){
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)){
//                topics.set(i,topic);
//                return;
//
//            }
//        }

        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {

        //topics.removeIf(t->t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
