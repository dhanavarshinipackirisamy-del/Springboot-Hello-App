package com.bridgelabz.hellorest.controller;

import com.bridgelabz.hellorest.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

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

    //UC4

    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

}