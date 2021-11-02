package com.example.MicroservicesUser_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicesUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesUserServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced   // load balancer client to interact the microservices
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
