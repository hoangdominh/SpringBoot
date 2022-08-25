package com.example.demo2222222222;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@ResponseBody
@Controller
public class ModelAttriBute {
    @RequestMapping("/index111")
    public String hoang() {
        return "index";
    }

    @RequestMapping("/index222")
    public void hoang2(){

    }

    @RequestMapping("/index333")
    public Account hoang3(){
        return new Account();
    }
}
