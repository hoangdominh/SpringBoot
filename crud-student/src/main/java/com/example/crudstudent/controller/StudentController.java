package com.example.crudstudent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("students")
public class StudentController {
    @GetMapping("index")
    public String index() {
        return "/index";
    }

    @GetMapping("new")
    public String newForm() {
        return "/new";
    }

    @GetMapping("edit/{studentId}")
    public String edit(@PathVariable("studentId") String studentId){
        System.out.println("Student Id :  "+studentId );
        return "/edit";
    }

    @PostMapping("saveOrUpdate")
    public String saveOrUpdate(@RequestParam("studentId") String studentId,
                               @RequestParam("name") String name,
                               Model model) {
        System.out.println("studentID : " +studentId);
        System.out.println("name: " + name);
        model.addAttribute("studentId",studentId);
        model.addAttribute("name",name);
        return "/viewDetail";
    }




    @RequestMapping("list")
    public String list() {
        return "/list";
    }

    @RequestMapping("search")
    public String search() {
        return "/search";
    }

}
