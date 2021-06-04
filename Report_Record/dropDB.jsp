<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*, javax.sql.*, java.io.*, java.net.URL"%>

<html>
<head>
</head>
<body> 
<h1>테이블 지우기 OK</h1>
<%	
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}				// 프로그램 만들기
Connection conn = null;
try {
	conn = DriverManager.getConnection("jdbc:mysql://192.168.23.15:3306/kopoctc", "root", "kopoctc");
} catch (SQLException e) {
	e.printStackTrace();
}
Statement stmt = null;
try {
	stmt = conn.createStatement();
} catch (SQLException e) {
	e.printStackTrace();
}
try {
	stmt.execute("drop table if exists examtable;");	
} catch (SQLException e) {
	e.printStackTrace();
}	
try {
	stmt.close();
} catch (SQLException e) {
	e.printStackTrace();
}											
try {
	conn.close();
} catch (SQLException e) {
	e.printStackTrace();
}			
%>
</body>
</html>