package com.cb.office.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.office.entity.Address;
import com.cb.office.entity.Employee;
import com.cb.office.model.AddressModel;
import com.cb.office.response.ApiResponse;
import com.cb.office.service.AddressService;
import com.cb.office.service.EmployeeService;

@RestController
@RequestMapping("/address")
public class AddressController 
{
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private AddressService addressService;
	
	
	@PostMapping("/save/{empid}")
	public ResponseEntity<ApiResponse> saveAddress(@PathVariable Integer empid,
			@RequestBody AddressModel addressModel)
	{
		ApiResponse empRespone = empService.get(empid);
		if(empRespone.getData()!=null)
		{
			Address address = new Address(addressModel);
			address = (Address)addressService.save(address).getData();
			
			Employee emp = (Employee)empRespone.getData();
			emp.setAddress(address);
			empService.update(emp);
			return new ResponseEntity(new ApiResponse(true, "Employee Address Updated !", emp),HttpStatus.OK);
		}else {
			return new ResponseEntity(new ApiResponse(false, "Employee Not Found !", null),HttpStatus.NOT_FOUND);
		}		
	}
}
