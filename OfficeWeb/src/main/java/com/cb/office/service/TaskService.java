package com.cb.office.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.office.entity.Employee;
import com.cb.office.entity.Task;
import com.cb.office.repository.TaskRepository;
import com.cb.office.response.ApiResponse;
@Service
public class TaskService implements BaseService<Task>
{
	@Autowired
	private TaskRepository taskRepo;
	
	@Override
	public ApiResponse save(Task ob) {
		Task Task = taskRepo.save(ob);
		return new ApiResponse(true, null, Task);
	}

	@Override
	public ApiResponse update(Task ob) {
		taskRepo.save(ob);
		return null;
	}

	@Override
	public ApiResponse delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse list() {		
		return new ApiResponse(true, null, taskRepo.findAll());
	}

	@Override
	public ApiResponse get(int id) {
		try {
			Optional<Task> optional =  taskRepo.findById(id);
			if(optional.isPresent())
				return new ApiResponse(true,"Task Found !",optional.get());
			else
				return new ApiResponse(false,"Task Not Found !",null);
		}catch(Exception ex) {
			System.err.println("Task Get Error : " + ex.getMessage());
			return new ApiResponse(false,"Something Wrong !",null);
		}
	}

}
