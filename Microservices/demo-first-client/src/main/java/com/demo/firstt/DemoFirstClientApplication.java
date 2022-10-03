package com.demo.firstt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoFirstClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFirstClientApplication.class, args);
	}

}
