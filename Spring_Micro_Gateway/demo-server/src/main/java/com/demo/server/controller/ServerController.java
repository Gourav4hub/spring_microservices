package com.demo.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.server.response.ApiResponse;

@RestController
public class ServerController 
{
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/api")
	public ResponseEntity<ApiResponse> apiCall()
	{
		ResponseEntity<ApiResponse> response =  restTemplate.getForEntity("http://eureka-client-service/emp/list", ApiResponse.class);
		return response;
	}
}
