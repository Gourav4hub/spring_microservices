package com.demo.client1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.client1.model.Student;
import com.demo.client1.response.ApiResponse;
import com.demo.master.model.Demo;

@RestController
@RequestMapping("/emp")
public class EmpController 
{
	@Autowired
	private DiscoveryClient discoveryClient;
	
	
	@GetMapping("/list")
	public ApiResponse listStudent() {
		Demo demo = new Demo();
		System.out.println(demo.hello());
		Student s1 = new Student("Vikas", 23);
		Student s2 = new Student("Gopal", 21);
		Student s3 = new Student("Deepa", 24);
		List<Student> list = new ArrayList<>();
		list.add(s1);list.add(s2);list.add(s3);
		return new ApiResponse(true, "List Student !", list);
	}
	
	@PostMapping("/save")
	public ApiResponse saveStudent(@RequestBody Student stud) 
	{
		System.out.println(stud);
		return new ApiResponse(true, "Save Student !", stud);
	}
	
//	@GetMapping("/instances")
//	public List<ServiceInstance> listInstances()
//	{
//		List<String> services =  discoveryClient.getServices();
//	    List<ServiceInstance> instances = new ArrayList<ServiceInstance>();
//	    services.forEach(serviceName -> {
//	        this.discoveryClient.getInstances(serviceName).forEach(instance ->{
//	            instances.add(instance);
//	        });
//	    });
//	    return instances;
//	}
}
