package com.spring.basics.intro.to.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IntroToSpringApplication {

	public static void main(String[] args) {
		//managed by spring application context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(IntroToSpringApplication.class, args);

	}

}
