package com.maria.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.maria")

public class CustomerServiceShareDetailsWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceShareDetailsWebAppApplication.class, args);
	}
	
	
@Bean
public RestTemplate getTemplate() {
	return new RestTemplate();

}
}
