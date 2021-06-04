<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*, javax.sql.*, java.io.*, java.net.URL"%>

<html>
<head>
</head>
<body> 
<h1>실습데이터 입력</h1>
<%
try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
			e.printStackTrace();
	}	
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://192.168.23.15:3306/kopoctc", "root", "kopoctc");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
			+ "values ('효민', 209901, 95, 100, 95),"
			+ " ('보람', 209902, 95, 95, 95),"
			+ " ('은정', 209903, 100, 100, 100),"
			+ " ('지연', 209904, 100, 95, 90),"
			+ " ('소연', 209905, 80, 100, 70),"
			+ " ('큐리', 209906, 100, 100, 70),"
			+ " ('화영', 209907, 70, 70, 70);");
		} catch (SQLSyntaxErrorException e) {
			out.println("테이블을 생성해주세요.");
		} catch (SQLIntegrityConstraintViolationException e) {
			out.println("값이 중복되었습니다.");
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