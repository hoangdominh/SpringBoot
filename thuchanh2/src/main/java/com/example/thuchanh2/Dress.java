package com.example.thuchanh2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component("drees")
@Configuration
public class Dress implements Outfit {
    @Bean("Dress")
    @Override
    public void wear() {
        System.out.println("Đang mặc váy");
    }
}
