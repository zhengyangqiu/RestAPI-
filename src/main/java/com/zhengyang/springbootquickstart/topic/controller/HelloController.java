package com.zhengyang.springbootquickstart.topic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//@Controller is used to mark classes as Spring MVC Controller. @RestController
// annotation is a special controller used in RESTful Web services, and it's the combination of
// @Controller and @ResponseBody annotation. It is a specialized version of @Component annotation.

public class HelloController {
    //when reach this url, the method be executed,it is only to GET method by default
    @RequestMapping("/hello")

    public String sayHi(){
        return "Hi";
    }




}
