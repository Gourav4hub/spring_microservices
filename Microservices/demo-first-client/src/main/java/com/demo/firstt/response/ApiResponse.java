package com.demo.firstt.response;

public class ApiResponse 
{
	private boolean status;
	private String message;
	private Object data;
	
	public ApiResponse() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ApiResponse(boolean status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}



	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
