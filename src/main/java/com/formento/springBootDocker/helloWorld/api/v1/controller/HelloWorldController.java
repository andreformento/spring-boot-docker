package com.formento.springBootDocker.helloWorld.api.v1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

}
