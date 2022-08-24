package com.example.thuchanh2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class GreetingController{
    @GetMapping("/greeting")
    public ModelAndView showGreeting(){
        return new ModelAndView("/greeting");
    }
}
