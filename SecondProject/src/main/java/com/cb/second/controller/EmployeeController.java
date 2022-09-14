package com.cb.second.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.second.entity.Employee;
import com.cb.second.repository.EmployeeRepository;
import com.cb.second.response.ApiResponse;

@RestController
@RequestMapping("/emp")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping("/save")
	public ApiResponse saveEmployee(@RequestBody Employee emp)
	{
		try {
			empRepo.save(emp);
			return new ApiResponse(true, "Employee Saved Success !", emp);
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
			return new ApiResponse(false, "Employee Saved Failed !", null);
		}
	}
	
	@GetMapping("/list")
	public ApiResponse list()
	{
		return new ApiResponse(true, null, empRepo.findAll());
	}
	
	@GetMapping("/get/{id}")
	public ApiResponse get(@PathVariable Integer id) 
	{
		Optional<Employee> optional =  empRepo.findById(id);
		if(optional.isPresent())
			return new ApiResponse(true, null, optional.get());
		else
			return new ApiResponse(false, "Employee Not Found !", null);
	}
}
