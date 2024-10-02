package com.velocity.UserRegistration;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionExample {

	//design a method which return a connection object to that method
	public Connection getConnection() {
			
		Connection con = null;
			
		    try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root", "root");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
	}
}