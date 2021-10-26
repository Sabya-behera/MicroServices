package com.example.Microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroservicesUser_ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesUser_ServiceApplication.class, args);
	}



	@Bean
	@LoadBalanced   // load balancer client
	public RestTemplate restTemplate()
	 {
		 return new RestTemplate();
	 }
}
