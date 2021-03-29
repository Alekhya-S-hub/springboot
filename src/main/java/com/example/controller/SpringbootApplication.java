package com.example.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages= {"com.example"})
@ComponentScan(basePackageClasses={com.example.controller.UsersController.class,com.example.model.Users.class,com.example.controller.UsersRepo.class})
public class SpringbootApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app)
	{
		return app.sources(SpringbootApplication.class);
	}
	
}
