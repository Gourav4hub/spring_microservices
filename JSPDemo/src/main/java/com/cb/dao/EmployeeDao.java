package com.cb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cb.model.EmpData;
import com.cb.model.Employee;

public class EmployeeDao 
{
	public List<EmpData> list()
	{
		ArrayList<EmpData> empList = new ArrayList();
		try {
			Connection cnn = DBConnection.getConnection();
			Statement stm = cnn.createStatement();
			
			ResultSet rs = stm.executeQuery("select * from employee");
			while(rs.next()) {
				int id = rs.getInt("emp_id");
				String name = rs.getString("emp_name");
				String phone = rs.getString("emp_phone");
				String email = rs.getString("emp_email");
				String city = rs.getString("emp_city");
				float salary = rs.getFloat("emp_salary");
				
				empList.add(new EmpData(id, name, phone, email, city, salary));
			}
			cnn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return empList;
		}
	}
}
