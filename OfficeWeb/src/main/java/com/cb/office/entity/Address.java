package com.cb.office.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cb.office.model.AddressModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "emp_address")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "addressId")
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
	
	@ManyToOne
	@JoinColumn(name = "employee")
	private Employee employee;
}
