package com.dailycodehandson.departments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentsServiceApplication.class, args);
	}

}
