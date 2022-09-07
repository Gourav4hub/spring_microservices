package com.cb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class Pro2 {

	public static void main(String[] args) 
	{
		Connection cnn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","gourav","Gourav@123");
			
			PreparedStatement stm = cnn.prepareStatement("insert into employee value(?,?,?,?,?,?)");
			
			stm.setInt(1, 343);
			stm.setString(2, "Raj");
			stm.setString(3, "9382475345");
			stm.setString(4, "raj@wse.com");
			stm.setFloat(5, 34500);
			stm.setString(6, "Indore");
			
			int i = stm.executeUpdate();
			if(i>0)
					System.out.println("Record Saved !");
			else
				System.out.println("Record Not Saved !");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found !");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(cnn!=null)
					cnn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
