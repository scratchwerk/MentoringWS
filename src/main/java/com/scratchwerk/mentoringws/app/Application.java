package com.scratchwerk.mentoringws.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.scratchwerk.mentoringws.controllers")
public class Application{

	//This is where it starts
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
