package com.cb.office.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.office.entity.Employee;
import com.cb.office.entity.Task;
import com.cb.office.model.TaskModel;
import com.cb.office.response.ApiResponse;
import com.cb.office.service.EmployeeService;
import com.cb.office.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController 
{
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public ResponseEntity<ApiResponse> saveTask(@RequestBody TaskModel taskModel)
	{		
		Task task = new Task(taskModel);		
		ApiResponse response = taskService.save(task);
		return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
	}
	
	@PostMapping("/addEmp/{taskid}/{empid}")
	public ResponseEntity<ApiResponse> addEmp(@PathVariable Integer taskid,
									@PathVariable Integer empid)
	{
		ApiResponse empResponse =  empService.get(empid);
		if(empResponse.isStatus()) 
		{
			Employee emp = (Employee)empResponse.getData();
			ApiResponse taskResponse = taskService.get(taskid);
			if(taskResponse.isStatus()) 
			{
				Task task = (Task)taskResponse.getData();
				emp.getTasks().add(task);				
				empService.update(emp);
				return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Task Updated !", task),HttpStatus.OK);
			}else
				return new ResponseEntity<ApiResponse>(taskResponse,HttpStatus.NOT_FOUND);
		}else
		{
			return new ResponseEntity<ApiResponse>(empResponse,HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/list")
	public ResponseEntity<ApiResponse> listTask()
	{
		return new ResponseEntity<ApiResponse>(taskService.list(),HttpStatus.OK);
	}
}
