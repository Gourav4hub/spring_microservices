package com.cb.office.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.office.entity.Address;
import com.cb.office.entity.Employee;
import com.cb.office.model.AddressModel;
import com.cb.office.repository.EmployeeRepository;
import com.cb.office.response.ApiResponse;

@Service
public class EmployeeService implements BaseService<Employee>
{
	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private AddressService addressService;

	@Override
	public ApiResponse save(Employee ob) 
	{
		try {
			Optional<Employee> optional =  empRepo.findById(ob.getEmpId());
			if(optional.isEmpty())
			{
				empRepo.save(ob);			
				return new ApiResponse(true,"Employee Saved !",ob);
			}else {
				return new ApiResponse(false,"Employee Already Exist !",null);
			}
		}catch(Exception ex) {
			System.err.println("Employee Save Error : " + ex.getMessage());
			return new ApiResponse(false,"Employee Not Saved !",null);
		}
	}
	
	public ApiResponse save(Employee ob,AddressModel addressModel) 
	{
		try {
			Optional<Employee> optional =  empRepo.findById(ob.getEmpId());
			if(optional.isEmpty())
			{
				Address address = new Address(addressModel);
				empRepo.save(ob);
				address.setEmployee(ob);
				addressService.save(address);
				return new ApiResponse(true,"Employee Saved !",ob);
			}else {
				return new ApiResponse(false,"Employee Already Exist !",null);
			}
		}catch(Exception ex) {
			System.err.println("Employee Save Error : " + ex.getMessage());
			return new ApiResponse(false,"Employee Not Saved !",null);
		}
	}

	@Override
	public ApiResponse update(Employee ob) {
		try {
			Optional<Employee> optional =  empRepo.findById(ob.getEmpId());
			if(optional.isPresent())
			{
				empRepo.save(ob);			
				return new ApiResponse(true,"Employee Updated !",ob);
			}else {
				return new ApiResponse(false,"Employee Not Exist !",null);
			}
		}catch(Exception ex) {
			System.err.println("Employee Update Error : " + ex.getMessage());
			return new ApiResponse(false,"Employee Not Updated !",null);
		}
	}

	@Override
	public ApiResponse delete(int id) {
		try {
			Optional<Employee> optional =  empRepo.findById(id);
			if(optional.isPresent())
			{
				empRepo.delete(optional.get());			
				return new ApiResponse(true,"Employee Deleted !",null);
			}else {
				return new ApiResponse(false,"Employee Not Exist !",null);
			}
		}catch(Exception ex) {
			System.err.println("Employee Delete Error : " + ex.getMessage());
			return new ApiResponse(false,"Employee Not Deleted !",null);
		}
	}

	@Override
	public ApiResponse list() {
		try {
			return new ApiResponse(true,null,empRepo.findAll());
		}catch(Exception ex) {
			System.err.println("Employee List Error : " + ex.getMessage());
			return new ApiResponse(false,"Something Wrong !",null);
		}
	}

	@Override
	public ApiResponse get(int id) {
		try {
			Optional<Employee> optional =  empRepo.findById(id);
			if(optional.isPresent())
				return new ApiResponse(true,"Employee Found !",optional.get());
			else
				return new ApiResponse(false,"Employee Not Found !",null);
		}catch(Exception ex) {
			System.err.println("Employee Get Error : " + ex.getMessage());
			return new ApiResponse(false,"Something Wrong !",null);
		}
	}
}
