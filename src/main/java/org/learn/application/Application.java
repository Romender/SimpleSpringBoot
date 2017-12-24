package org.learn.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.learn")
@SpringBootApplication
public class Application {
    public static void main(String args[] ){
        SpringApplication.run(Application.class,args);
    }
}
