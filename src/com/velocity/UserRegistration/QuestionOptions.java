package com.velocity.UserRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuestionOptions {

	public void getQuestionOptionInfo() {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			ConnectionExample conex = new ConnectionExample();
			con = conex.getConnection();
			ps = con.prepareStatement("insert into questionoption(question,option1,option2,option3,option4)"
					+ "values(?,?,?,?,?)");
			ps.setString(1, "In which of the following is toString() method defined?");
			ps.setString(2, "a. Java.lang.string");
			ps.setString(3, "b. Java.lang.object");
			ps.setString(4, "c. Java.lang.util");
			ps.setString(5, "d. None");
			int a = ps.executeUpdate();
			System.out.println("record is inserted >> "+a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
