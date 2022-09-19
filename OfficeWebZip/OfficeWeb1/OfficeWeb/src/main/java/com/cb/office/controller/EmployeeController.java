package com.cb.office.controller;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.office.entity.Employee;
import com.cb.office.response.ApiResponse;
import com.cb.office.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public ResponseEntity<ApiResponse> saveEmployee(@RequestBody Employee emp)
	{
		//System.out.println(emp);
		ApiResponse response = empService.save(emp);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ApiResponse> updateEmployee(@RequestBody Employee emp)
	{
		ApiResponse response = empService.update(emp);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<ApiResponse> listEmployee(){
		return new ResponseEntity<ApiResponse>(empService.list(),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ApiResponse> getEmployee(@PathVariable Integer id)
	{
		ApiResponse response = empService.get(id);
		if(response.isStatus())
			return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
		else
			return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ApiResponse> deleteEmployee(@PathVariable Integer id)
	{
		ApiResponse response = empService.delete(id);
		if(response.isStatus())
			return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
		else
			return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
	}
}
