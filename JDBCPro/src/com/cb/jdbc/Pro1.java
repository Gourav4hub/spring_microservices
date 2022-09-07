package com.cb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class Pro1 {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","gourav","Gourav@123");
			
			Statement stm = cnn.createStatement();
			
			ResultSet rs = stm.executeQuery("select * from employee");
			
			while(rs.next()) 
			{
				int empid = rs.getInt("emp_id");
				String name = rs.getString("emp_name");
				String phone = rs.getString("emp_phone");
				String email = rs.getString("emp_email");
				String city = rs.getString("emp_city");
				float salary = rs.getFloat("emp_salary");
				System.out.println(empid + " : " + name + " : " + phone + " : " + email + " : " + city + " : " + salary);
			}
			
			cnn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found !");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
