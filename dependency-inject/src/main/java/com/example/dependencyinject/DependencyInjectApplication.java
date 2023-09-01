package com.example.dependencyinject;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext  = SpringApplication.run(DependencyInjectApplication.class, args);
		Movies movies=applicationContext.getBean("movies",Movies.class);
		System.out.println(movies.getName());
		System.out.println(movies.getGenre());
	}

}
