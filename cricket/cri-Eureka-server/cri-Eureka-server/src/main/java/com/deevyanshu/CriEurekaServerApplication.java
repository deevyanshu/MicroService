package com.deevyanshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CriEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriEurekaServerApplication.class, args);
	}

}
