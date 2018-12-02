package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ServiceProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
	}
}
