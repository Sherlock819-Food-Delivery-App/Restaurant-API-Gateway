package com.example.Restaurant_API_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApiGatewayApplication.class, args);
	}

}
