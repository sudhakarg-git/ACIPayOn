package com.belk.payon.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PayOnConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayOnConfigServiceApplication.class, args);
		
	}

}
