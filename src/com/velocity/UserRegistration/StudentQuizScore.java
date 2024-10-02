package com.velocity.UserRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentQuizScore {

	public void getQuizData(int numberofquestion,int correct,int wrong,
			int score) throws SQLException {
		
		PreparedStatement ps = null;
		try {
			ConnectionExample conex = new ConnectionExample();
			Connection con = conex.getConnection();
			ps = con.prepareStatement("insert into quizresult(numberofquestion,correct,wrong,"
					+ "score)"
					+ "values(?,?,?,?)");
			ps.setInt(1, numberofquestion);
			ps.setInt(2, correct);
			ps.setInt(3, wrong);
			ps.setInt(4, score);
			
			ps.executeUpdate();
			System.out.println("Score is inserted >> ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ps.close();
		}
	}
}
