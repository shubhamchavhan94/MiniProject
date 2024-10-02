use miniproject;

create table studentlogin(student_id int(10),
login_id int(10) auto_increment not null primary key,
username varchar(255),
password varchar(255),
foreign key(student_id) references studentregistration(student_id));

create table QuestionOption(student_id int(10),
question varchar(1000),
option1 varchar(1000),
option2 varchar(1000),
option3 varchar(1000),
option4 varchar(1000),
foreign key(student_id) references studentregistration(student_id));

create table quizresult(student_id int(10),
quizid int(10) not null auto_increment primary key,
numberofquestion int(10),
correct int(10),
wrong int(10),
score int(10),
foreign key(student_id) references studentregistration(student_id));

create table questions(id int(10) auto_increment not null primary key,
question varchar(255),
optionA varchar(255),
optionB varchar(255),
optionC varchar(255),
optionD varchar(255),
correctAns int(10));