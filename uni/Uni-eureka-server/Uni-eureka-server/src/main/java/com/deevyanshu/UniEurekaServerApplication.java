package com.deevyanshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UniEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniEurekaServerApplication.class, args);
	}

}
