package com.example.thuchanh2;

import com.example.thuchanh2.other_package.Bikini;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@ComponentScan("com.example.thuchanh2")
@SpringBootApplication
public class Thuchanh2Application {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Thuchanh2Application.class, args);

//        Bikini bikini = context.getBean(Bikini.class);
//        System.out.println("Instance: "+bikini);
//        bikini.wear();
//
//        Dress dress = context.getBean(Dress.class);
//        System.out.println("Instance: "+dress);
//        dress.wear();

        GirlFriend girlFriend = context.getBean(GirlFriend.class);

//        System.out.println("Instance girlfriend: "+girlFriend);
        System.out.println("Outfit of girlfriend: "+ girlFriend.outfit);

    }

}
