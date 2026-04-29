package com.marcelocalegare.first_spring_app.controllers;
import com.marcelocalegare.first_spring_app.domain.User;
import com.marcelocalegare.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello-world")
public class HelloWordlController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Marcelo");
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body){
        return "Hello World " + body.getName();
    }


}
