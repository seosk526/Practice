<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*, javax.sql.*, java.io.*, java.net.URL"%>

<html>
<head>
</head>
<body> 
<h1>조회</h1>
<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.15:3306/kopoctc", "root", "kopoctc");
	Statement stmt = conn.createStatement();
%>  
<table cellspacing=1 width=600 border=1>
<tr>
	<th width=50><p align=center>이름</p></th>
	<th width=50><p align=center>학번</p></th>
	<th width=50><p align=center>국어</p></th>
	<th width=50><p align=center>영어</p></th>
	<th width=50><p align=center>수학</p></th>
</tr>
<%
	try {
		ResultSet rset = stmt.executeQuery("select * from examtable;");
		while (rset.next()) {	
		out.println("<tr>");
		out.println("<td width=50><p align=center><a href='oneviewDB.jsp?key="
		+ rset.getString(1) +"'> " + rset.getString(1) + "</a></p></td>");
		out.println("<td width=50><p align=center>" + rset.getInt(2) + "</p></td>");
		out.println("<td width=50><p align=center>" + rset.getInt(3) + "</p></td>");
		out.println("<td width=50><p align=center>" + rset.getInt(4) + "</p></td>");
		out.println("<td width=50><p align=center>" + rset.getInt(5) + "</p></td>");
		out.println("</tr>");
	}
	rset.close();
	stmt.close();
	conn.close();
	} catch (Exception e){
		out.println("테이블이 존재하지 않습니다");
   }
%>
</body>
</html>