<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*, javax.sql.*, java.io.*, java.net.URL"%>

<html>
<head>
</head>
<body> 
<h1>테이블 만들기 OK</h1>
<%	
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	out.println("테이블을 삭제해주세요.");
}				// 프로그램 만들기
Connection conn = null;
try {
	conn = DriverManager.getConnection("jdbc:mysql://192.168.23.15:3306/kopoctc", "root", "kopoctc");
} catch (SQLException e) {
	out.println("테이블을 삭제해주세요.");
}
Statement stmt = null;
try {
	stmt = conn.createStatement();
} catch (SQLException e) {
	out.println("테이블을 삭제해주세요.");
}
try {
	stmt.execute("create table examtable(" 					
					+ "name varchar(20),"						
					+ "studentid int not null primary key,"		
					+ "kor		int,"						
					+ "eng		int,"							
					+ "mat		int)"							
					+ "DEFAULT CHARSET=utf8;");	
} catch (SQLException e) {
	out.println("테이블을 삭제해주세요.");
}	
try {
	stmt.close();
} catch (SQLException e) {
	out.println("테이블을 삭제해주세요.");
}											
try {
	conn.close();
} catch (SQLException e) {
	out.println("테이블을 삭제해주세요.");
}			
%>
</body>
</html>