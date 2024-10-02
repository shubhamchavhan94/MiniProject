package com.velocity.UserRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRegistration {

	public void getStudentRegistrationInfo(String firstname,String lastname,String username,String password,
			String city,String mail_id,long mobilenumber) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			ConnectionExample conex = new ConnectionExample();
			con = conex.getConnection();
			ps = con.prepareStatement("insert into studentregistration(firstname,lastname,username,"
					+ "password,city,mail_id,mobilenumber)"
					+ "values(?,?,?,?,?,?,?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, username);
			ps.setString(4, password);
			ps.setString(5, city);
			ps.setString(6, mail_id);
			ps.setLong(7, mobilenumber);
			
			int a = ps.executeUpdate();
			System.out.println("record is inserted >> "+a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
