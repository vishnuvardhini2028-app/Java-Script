package com.example.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DependencyApplication.class, args);
		car c=new car();
		
		objectcreation.inject(c);
        c.drive();
	}

}
