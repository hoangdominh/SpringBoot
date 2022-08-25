package com.example.lombok.controller;

//import com.example.lombok.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/home")
    public String index() {
        return "index";
    }

//    public String display() {
//        Student student = new Student("ST01","Minh Hoang");
//        student.getStudentID();
//    }

}
