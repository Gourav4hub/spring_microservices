package com.cb.office.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.office.entity.Address;
import com.cb.office.repository.AddressRepository;
import com.cb.office.response.ApiResponse;
@Service
public class AddressService implements BaseService<Address>
{
	@Autowired
	private AddressRepository addressRepo;
	
	@Override
	public ApiResponse save(Address ob) {
		Address address = addressRepo.save(ob);
		return new ApiResponse(true, null, address);
	}

	@Override
	public ApiResponse update(Address ob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse list() {		
		return new ApiResponse(true, null, addressRepo.findAll());
	}

	@Override
	public ApiResponse get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
