package com.cb.first.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cb.first.model.Student;

@RestController
@RequestMapping("/first")
public class FirstController 
{
	@GetMapping("/home")
	public String home() 
	{
		return "Welcome To Pataa Navigation First";
	}
	
	@GetMapping("/help")
	public String help() 
	{
		return "Help Page First";
	}
	
	@GetMapping("/list")
	public List<Student> list(){
		ArrayList<Student> slist = new ArrayList<>();
		slist.add(new Student(101,"Vikas", 234.34f));
		slist.add(new Student(102,"Mahesh", 224.34f));
		slist.add(new Student(103,"Suraj", 267.34f));
		return slist;
	}
	
	
	@PostMapping("/save1")
	public Student save1(@RequestParam(name = "rollnumber") int roll,
						@RequestParam(name = "sname") String name,
						@RequestParam(name = "marks") float marks) 
	{
		Student s = new Student(roll, name, marks);
		return s;
	}
	
	@PostMapping("/save2")
	public Student save2(Student stud) 
	{
		return stud;
	}

	@PostMapping("/save3")
	public Student save3(@RequestBody Student stud) 
	{
		return stud;
	}
	
	@PostMapping("/save4")
	public HashMap<String, String> save4(@RequestBody HashMap<String, String> map) 
	{
		return map;
	}
	

	
	
}
