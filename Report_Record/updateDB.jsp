<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*,javax.sql.*,java.net.*,java.io.*"%>
<% request.setCharacterEncoding("UTF-8");%>

<html>
<head>
</head>
<body>
<h1>레코드 수정</h1>
<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		out.println(e);
	}
	Connection conn = null;
	try {
		conn = DriverManager.getConnection("jdbc:mysql://192.168.23.15:3306/kopoctc", "root", "kopoctc");		
	} catch (SQLException e) {
		out.println(e);
	}
	Statement stmt = null;
	try {
		stmt = conn.createStatement();
	} catch (SQLException e) {
		out.println(e);
	}	
	String cTmp = request.getParameter("name");
	String sql = " update examtable set "+ 
			"name ='"+cTmp+"', "+ 
			"kor = "+ request.getParameter("korean")+ ", "+ 
			"eng = "+ request.getParameter("english")+ ", "+ 
			"mat = "+ request.getParameter("mathmatic")+ 
			" where studentid =" + request.getParameter( "studentid" );
	try {
		stmt.executeUpdate(sql);
	} catch (SQLException e) {
		out.println(e);
	}
	ResultSet rset = null;
	try {
		rset = stmt.executeQuery("select * from examtable;");
	} catch (SQLException e) {
		out.println(e);
	}	
%>
<table cellspacing=1 width=600 border=1>
  <tr>
    <th width=50>
      <p align=center>이름</p>
    </th>
    <th width=50>
      <p align=center>학번</p>
    </th>
    <th width=50>
      <p align=center>국어</p>
    </th>
    <th width=50>
      <p align=center>영어</p>
    </th>
    <th width=50>
      <p align=center>수학</p>
    </th>
  </tr>

<%
	try {
		while (rset.next()) {
			if (request.getParameter("studentid").equals(Integer.toString(rset.getInt(2)))) {
				out.println("<tr bgcolor = '#ffff00'>");
				out.println("<td width=50><p align=center><a href='oneviewDB.jsp?key="
					+ rset.getString(1) + "'> " + rset.getString(1) + "</a></p></td>");
				out.println("<td width=50><p align=center>" + Integer.toString(rset.getInt(2)) + "</p></td>");
				out.println("<td width=50><p align=center>" + Integer.toString(rset.getInt(3)) + "</p></td>");
				out.println("<td width=50><p align=center>" + Integer.toString(rset.getInt(4)) + "</p></td>");			
				out.println("<td width=50><p align=center>" + Integer.toString(rset.getInt(5)) + "</p></td>");
				out.println("</tr>");
			} else {
				out.println("<tr>");
				out.println("<td width=50><p align=center><a href='oneviewDB.jsp?key="
					+ rset.getString(1) + "'> " + rset.getString(1) + "</a></p></td>");
				out.println("<td width=50><p align=center>" + Integer.toString(rset.getInt(2)) + "</p></td>");
				out.println("<td width=50><p align=center>" + Integer.toString(rset.getInt(3)) + "</p></td>");
				out.println("<td width=50><p align=center>" + Integer.toString(rset.getInt(4)) + "</p></td>");			
				out.println("<td width=50><p align=center>" + Integer.toString(rset.getInt(5)) + "</p></td>");
				out.println("</tr>");
			}
		}
	} catch (SQLException e) {
		out.println(e);
	} catch (NullPointerException e1) {
		out.println(e1);
	}
	try {
		rset.close();
	} catch (SQLException e) {
		out.println(e);
	} catch (NullPointerException e1) {
		out.println(e1);
	} 
	try {
		stmt.close();
	} catch (SQLException e) {
		out.println(e);
	} 
	try {
		conn.close();
	} catch (SQLException e) {
		out.println(e);
	} 
%>
</table>
</body>
</html>