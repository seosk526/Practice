<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*,javax.sql.*,java.net.*,java.io.*"%>
<html>
<head>
</head>
<body>
<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.15:3306/kopoctc", "root", "kopoctc");
	Statement stmt = conn.createStatement();
	
	int NewStdId=0;

	<table cellspacing=1 width=600 border=1>
	<tr>
		<th width=50><p align=center>이름</p></th>
		<th width=50><p align=center>학번</p></th>
		<th width=50><p align=center>국어</p></th>
		<th width=50><p align=center>영어</p></th>
		<th width=50><p align=center>수학</p></th>
	</tr>
	ResultSet rset = stmt.executeQuery("select max(studentid) from examtable");
	while (rset.next()) {
		NewStdId = rset.getInt(1) + 1;
		out.println("<tr>");
		out.println("<td width=50><p align=center>" + rset.getInt(1) + "</p></td>");
		out.println("<td width=50><p align=center>" + rset.getInt(2) + "</p></td>");
		out.println("<td width=50><p align=center>" + rset.getInt(3) + "</p></td>");
		out.println("<td width=50><p align=center>" + rset.getInt(4) + "</p></td>");
		out.println("<td width=50><p align=center>" + rset.getInt(5) + "</p></td>");
		out.println("</tr>");		
	}
	
