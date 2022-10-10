package com.demo.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoClient1Application.class, args);
	}

}
