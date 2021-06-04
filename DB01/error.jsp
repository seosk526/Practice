<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*, javax.sql.*, java.io.*, java.net.URL"%>
<html>
<head>
</head>
<body> 
<h1>테이블 만들기 OK</h1>
<%	
	Class.forName("com.mysql.cj.jdbc.Driver");				
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.15:3306/kopoctc", "root", "kopoctc");
	Statement stmt = conn.createStatement();
	stmt.execute("create table examtable(" 					
						+ "name varchar(20),"						
						+ "studentid int not null primary key,"		
						+ "kor		int,"						
						+ "eng		int,"							
						+ "mat		int)"							
						+ "DEFAULT CHARSET=utf8;");					
	stmt.close();										
	conn.close();		
%>
</body>
</html>