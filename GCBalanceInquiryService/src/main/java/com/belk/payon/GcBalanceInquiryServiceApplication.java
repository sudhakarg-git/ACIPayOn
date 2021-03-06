package com.belk.payon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GcBalanceInquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcBalanceInquiryServiceApplication.class, args);
	}

}
