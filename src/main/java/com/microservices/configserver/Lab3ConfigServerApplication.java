package com.microservices.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Lab3ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3ConfigServerApplication.class, args);
	}

}
