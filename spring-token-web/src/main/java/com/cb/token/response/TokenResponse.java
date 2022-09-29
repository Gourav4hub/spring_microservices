package com.cb.token.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TokenResponse 
{
	private boolean isTokenFound;
	private boolean isTokenExpire;
	private String message;
}