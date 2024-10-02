package com.velocity.UserRegistration;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainTest {

    @SuppressWarnings("resource")
	private void getStudentInfo() throws SQLException {
    	System.out.println("Welcome to Quiz based application\r\n" + 
    			" User Operation\r\n" + 
    			"1. Student Registration\r\n" + 
    			"2. Student Login\r\n" + 
    			"3. Display the list of questions\r\n" + 
    			"4. Store Quiz result into database\r\n" + 
    			"5. Display Quiz result \r\n" + 
    			" Admin Operation\r\n" + 
    			"6. Display all students score as per ascending order\r\n" + 
    			"7. Fetch student score by using id\r\n" + 
    			"8. Add question with 4 options into database");
    	System.out.println();
    	System.out.println("Enter your choice - ");
    	Scanner scn = new Scanner(System.in);
    	int choice = scn.nextInt();
    	
    	switch(choice) {
    	case 1 :
    		System.out.println("Enter the firstname >> ");
    		String stuFirstName = scn.next();
    		System.out.println("Enter the lastname >> ");
    		String stuLastName = scn.next();
    		System.out.println("Enter the username >> ");
    		String stuUserName = scn.next();
    		System.out.println("Enter the password >> ");
    		String stuPassword = scn.next();
    		System.out.println("Enter the city >> ");
    		String stuCity = scn.next();
    		System.out.println("Enter the email_id >> ");
    		String stuEmailId = scn.next();
    		System.out.println("Enter the mobilenumber >> ");
    		long stuMobileNumber = scn.nextLong();
    		StudentRegistration stuReg = new StudentRegistration();
    		stuReg.getStudentRegistrationInfo(stuFirstName, stuLastName, stuUserName, stuPassword, stuCity, stuEmailId, stuMobileNumber);
    		break;
    	case 2 :
    		System.out.println("Enter the username >> ");
    		String sUserName = scn.next();
    		System.out.println("Enter the password >> ");
    		String sPassWord = scn.next();
    		StudentLoginPage login = new StudentLoginPage();
    		login.getLoginInfo(sUserName, sPassWord);
    		break;
    	case 3 :
    		System.out.println("Display the list of question with 4 options");
    		System.out.println();
    		Map<String, String> map = new LinkedHashMap<String, String>();
        	
        	map.put("In which of the following is toString() method defined?",
        			"a. Java.lang.string\r\n" + 
        			"b. Java.lang.object\r\n" + 
        			"c. Java.lang.util\r\n" + 
        			"d. None");
        	Set<String> s = map.keySet();
        	
        	for(String str : s) {
        		System.out.println(str);
        		System.out.println(map.get(str));
        	}
        	break;
    	case 4 :
    		System.out.println("Store the Quiz result into database with score");
    		System.out.println("Enter number of question >> ");
    		int sNumberOfQuestion = scn.nextInt();
    		System.out.println("Correct answer >> ");
    		int sCorrectAnswer = scn.nextInt();
    		System.out.println("Wrong answer >> ");
    		int sWrongAnswer = scn.nextInt();
    		System.out.println("Score >>");
    		int sScore = scn.nextInt();
    		StudentQuizScore qz = new StudentQuizScore();
    		qz.getQuizData(sNumberOfQuestion, sCorrectAnswer, sWrongAnswer, sScore);
    		break;
    	case 5 :
    		System.out.println("Enter the username");
    		String sUsername = scn.next();
    		System.out.println("Enter the password ");
    		String sPassword = scn.next();
    		StudentScoreCard score = new StudentScoreCard();
    		score.getScore(sUsername, sPassword);
    		break;
    	case 6 :
        		StudentData sd = new StudentData();
        		sd.getStudentData();
        		break;
    	case 7 :
    			System.out.println("Enter Student id >> ");
    			int studentID = scn.nextInt();
    			StudentData sd1 = new StudentData();
    			sd1.getStudentScore(studentID);
    			break;
    	case 8 ://We have to write a question here
    		 System.out.println("Enter the Question");
    		 Scanner scn1 = new Scanner(System.in);
	    	 String ques  = scn1.nextLine();
	    	 System.out.println("Enter the option 1");
	    	 String A  = scn1.next();
	    	 System.out.println("Enter the option 2");
	    	 String B  = scn1.next();
	    	 System.out.println("Enter the option 3");
	    	 String C  = scn1.next();
	    	 System.out.println("Enter the option 4");
	    	 String D  = scn1.next();
	    	 System.out.println("Enter the correct answer : ");
	    	 int a = scn1.nextInt();
	    	 QuestionOption ans = new QuestionOption();
	    	 ans.getQuestion(ques, A, B, C, D, a);
	    	 ans.quiz();
    		
    			}		
    	}
    
    public static void main(String[] args) throws SQLException {
		
    	MainTest mt = new MainTest();
    	mt.getStudentInfo();
	}
}





