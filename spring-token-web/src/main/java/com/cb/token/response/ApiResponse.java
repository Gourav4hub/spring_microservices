package com.cb.token.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse 
{
	private boolean status;
	private String message;
	private Object data;
}
