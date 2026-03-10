package com.bridgelabz.hellorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //UC1

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from dhana";
    }

    // UC2

    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from DHANA";
    }

    //UC3

    @GetMapping("/hello/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from DHANA";
    }

}