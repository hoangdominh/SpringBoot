package com.example.lombok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpServletResponse response;

    @GetMapping("create")
    public String create(){
        return "createStudent";
    }

    @PostMapping("create")
    public String createPost() {
        String studentId =  request.getParameter("studentId");
        String name = request.getParameter("name");

        Student student = new Student(studentId,name);
        request.setAttribute("student",student);
        return "detailStudent";
    }

}
