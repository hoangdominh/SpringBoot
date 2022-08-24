package com.example.thuchanh2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("bikini2")
@Configuration
public class Bikini2 implements Outfit{
   @Bean("Bikini2")
    @Override
    public void wear() {
        System.out.println("Đang mặc bikini");
    }
}
