package com.velocity.UserRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class QuestionOption {

		 private Connection conex;
		 Scanner sc = new Scanner(System.in);
	     
	     public void getQuestion(String question ,String optionA,String optionB,
	    		 String optionC,String optionD,int correctAns) throws SQLException {
	    	 
			 
	    	 
	    	 PreparedStatement ps = null;
	    	 
	    	 try {
	    		 ConnectionExample conex = new ConnectionExample();
	 			 Connection con = conex.getConnection();
//	 			 String sql = "create table questions(id int(10) auto_increment not null primary key,"
//	 			 		+ "question varchar(255),"
//	 			 		+ "optionA varchar(255),"
//	 			 		+ "optionB varchar(255),"
//	 			 		+ "optionC varchar(255),"
//	 			 		+ "optionD varchar(255),"
//	 			 		+ "correctAns int(10)";
//	 			 
//	 			 Statement st = con.createStatement();
//	 			 st.execute(sql);
	 			 ps = con.prepareStatement("INSERT INTO questions (question, optionA, optionB, optionC, optionD,correctAns) "
	 			 		+ "VALUES (?,?,?,?,?,?)");
	    		 ps.setString(1, question);
	    		 ps.setString(2, optionA);
	    		 ps.setString(3, optionB);
	    		 ps.setString(4, optionC);
	    		 ps.setString(5, optionD);
	    		 ps.setInt(6, correctAns);
	    		 
	    		 ps.executeUpdate();
	    		
	    	 }catch(SQLException e) {
	    		 e.printStackTrace();
	    	 }
	    	 finally {
				ps.close();
			}
	     }

	     @SuppressWarnings("unused")
		public int quiz(){
	    	 
	    	 int score = 0;
	    	 
	    	 try {
	    		 String query = "SELECT * FROM questions";
	    		 ConnectionExample conex = new ConnectionExample();
	 			 Connection con = conex.getConnection();
	    		 Statement statement = con.createStatement();
	    		 ResultSet resultSet = statement.executeQuery(query);
	    		 while (resultSet.next()) {
	    			 
	    			 int id = resultSet.getInt("id"); 
	                 String question_text = resultSet.getString("question");
	                 String option_a = resultSet.getString("optionA");
	                 String option_b = resultSet.getString("optionB");
	                 String option_c = resultSet.getString("optionC");
	                 String option_d = resultSet.getString("optionD");
	                 String correct_ans = resultSet.getString("correctAns");
//	    			System.out.println(id+".Question: " + question_text + "\nOptions:\nA: " + option_a + "\nB: " + option_b + "\nC: " + option_c + "\nD: " + option_d);
//	    		    String ans=sc.next();
//	    		    if(correct_ans.equalsIgnoreCase(ans)) {
//	    		    				score++;
//	    		    }  
	    		 }
	    	} catch (SQLException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	    	return score;   	
	     }
	}