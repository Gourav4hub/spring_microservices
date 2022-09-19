package com.cb.office.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cb.office.model.AddressModel;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "emp_address")
public class Address 
{
	public Address(AddressModel addressModel) {
		this.street = addressModel.getStreet();
		this.city = addressModel.getCity();
		this.pincode = addressModel.getPincode();
	}

	@Id
	@Column(name = "address_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	@Column(name = "street" , length = 100 , nullable = false)
	private String street;
	
	@Column(name = "city" , length = 100 , nullable = false)
	private String city;
	
	@Column(name = "pincode" , length = 100 , nullable = false)
	private String pincode;
}
