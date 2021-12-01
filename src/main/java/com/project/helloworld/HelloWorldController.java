package com.project.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping
    public JSONTest mainPage() {
        return new JSONTest("Hello World!");
    }
}
