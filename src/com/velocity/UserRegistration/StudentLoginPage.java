package com.velocity.UserRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentLoginPage {

	
	public void getLoginInfo(String username,String password) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			ConnectionExample conex = new ConnectionExample();
			con = conex.getConnection();
			ps = con.prepareStatement("insert into studentlogin(username,password)"
					+ "values(?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			int a = ps.executeUpdate();
			System.out.println("record is inserted >> "+a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
