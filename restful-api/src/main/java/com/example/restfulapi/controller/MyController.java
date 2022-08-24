package com.example.restfulapi.controller;

import io.micrometer.core.ipc.http.HttpSender;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping(value = {"/hello-world","hello"}, method = RequestMethod.GET)
//    public User helloWorld(){
//        User user = new User(1, "Đỗ Minh Hoàng");
//        return user;
//    }

    public ResponseEntity<?> helloWorld(){
        User user = new User(1, "Đỗ Minh Hoàng");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(user);
    }
}
