package com.velocity.UserRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentScoreCard {

	public void getScore(String username,String password) {
		PreparedStatement ps = null;
		try {

			ConnectionExample conex = new ConnectionExample();
			Connection con = conex.getConnection();
			ps = con.prepareStatement("select * from studentregistration left join quizresult on studentregistration.student_id=quizresult.student_id where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
	
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Your score is : "+rs.getInt("score"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
