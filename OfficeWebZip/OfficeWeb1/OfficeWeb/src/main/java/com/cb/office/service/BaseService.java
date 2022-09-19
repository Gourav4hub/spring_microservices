package com.cb.office.service;

import com.cb.office.response.ApiResponse;

public interface BaseService<T> 
{
	ApiResponse save(T ob);
	ApiResponse update(T ob);
	ApiResponse delete(int id);
	ApiResponse list();
	ApiResponse get(int id);
}
