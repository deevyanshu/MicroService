package com.deevyanshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UniApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniApiGatewayApplication.class, args);
	}

}
