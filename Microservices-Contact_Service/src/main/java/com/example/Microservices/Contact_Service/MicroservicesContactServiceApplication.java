package com.example.Microservices.Contact_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesContactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesContactServiceApplication.class, args);
	}

}
