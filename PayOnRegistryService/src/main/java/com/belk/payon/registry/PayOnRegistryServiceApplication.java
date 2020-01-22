package com.belk.payon.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PayOnRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayOnRegistryServiceApplication.class, args);
	}

}
