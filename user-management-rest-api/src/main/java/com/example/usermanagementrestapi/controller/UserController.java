package com.example.usermanagementrestapi.controller;

import com.example.usermanagementrestapi.entity.User;
import com.example.usermanagementrestapi.model.dto.UserDto;
import com.example.usermanagementrestapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// Có thể khai báo phần URL riêng
// @RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/search")
    public ResponseEntity<?> searchUser(@RequestParam(name = "keyword",required = false,defaultValue = "") String name){
        List<UserDto> users = userService.searchUser(name);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/users")
    public ResponseEntity<?> getListUser(){
        List<UserDto> users = userService.getListUser();
        return ResponseEntity.ok(users);

    }

//    Viet API truy xuat thong tin cu the theo id
    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserByID(@PathVariable int id) {
        UserDto result = userService.getUserByID(id);
        return ResponseEntity.ok(result);
    }


    @PostMapping("/users")
    public ResponseEntity<?> createListUser(){
        return null;
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(){
        return null;
    }

}
