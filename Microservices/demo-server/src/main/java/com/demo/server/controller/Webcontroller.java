package com.demo.server.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.server.response.ApiResponse;

@RestController
@EnableDiscoveryClient
public class Webcontroller 
{
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/api")
	public ApiResponse loadPatients() 
	{	
		String url = "http://firstweb/emp/first";
		ApiResponse response = template.getForEntity(url, ApiResponse.class).getBody();

		return response;
	}
	
	
	@GetMapping("/instances")
	public List<String> getApplications() {
		System.out.println(discoveryClient);
	    List<String> services = this.discoveryClient.getServices();
	    System.out.println("Services : " + services.size());
//	    List<ServiceInstance> instances = new ArrayList<ServiceInstance>();
//	    services.forEach(serviceName -> {
//	        this.discoveryClient.getInstances(serviceName).forEach(instance ->{
//	            instances.add(instance);
//	        });
//	    });
	    return services;
	}
	
	@GetMapping("/instancesByName/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
}
