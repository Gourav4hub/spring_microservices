package com.cb.office.model;

import javax.persistence.Column;

import lombok.Data;

@Data
public class AddressModel 
{
	private String street;
	private String city;
	private String pincode;
}
