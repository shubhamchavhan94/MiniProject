package com.velocity.UserRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentData {

	public void getStudentData() throws SQLException {
		PreparedStatement ps = null;
		try {

			ConnectionExample conex = new ConnectionExample();
			Connection con = conex.getConnection();
			ps = con.prepareStatement("select studentregistration.firstname,lastname,quizresult.score from studentregistration join quizresult on studentregistration.student_id=quizresult.student_id");
			
//			ps.setString(1, "Ram");
//			ps.setString(2, "Patil");
//			ps.setInt(3, 7);
	
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("First name >> "+rs.getString(1));
				System.out.println("Last name >> "+rs.getString(2));
				System.out.println("Score >> "+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ps.close();
		}
		
	}
	public void getStudentScore(int studentID) throws SQLException {
		PreparedStatement ps = null;
		try {
			ConnectionExample conex = new ConnectionExample();
			Connection con = conex.getConnection();
			ps = con.prepareStatement("select * from quizresult "
					+ "where student_id=?");
		
			ps.setInt(1, studentID);
	
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Score is >> "+rs.getInt("score"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ps.close();
		}
	}
}
