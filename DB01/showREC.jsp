<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*,javax.sql.*,java.net.*,java.io.*"%>

<html>

<head>
  <script>
	console.log("showREC.jsp");
    function onlyKorean(inputId) {
      var str = document.getElementById(inputId).value;
      if (str.length > 10) {
        alert("10글자 미만으로 입력해주세요");
        document.getElementById(inputId).value = '';
      }
      for (i = 0; i < str.length; i++) {
        if (!((str.charCodeAt(i) > 0x3130 && str.charCodeAt(i) < 0x318F) || (str.charCodeAt(i) >= 0xAC00 && str.charCodeAt(i) <= 0xD7A3))) {
          alert("다시 입력해 주세요");
          document.getElementById(inputId).value = '';
        }
      }
    }
  </script>
  <script>
    function submitForm(mode) {
      let nameVal = document.getElementById('inputkorean').value;
      if (nameVal === "") {
        alert('빈칸입니다. 값을 입력해주세요');
        return;
      }

      if (mode == "update") {
        myform.action = "updateDB.jsp";
        myform.submit();
      } else if (mode == "delete") {
        myform.action = "deleteDB.jsp";
        myform.submit();
      }
    }
  </script>
</head>
<body>
<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.15:3306/kopoctc", "root", "kopoctc");		
	Statement stmt = conn.createStatement();

	String name = "", studentid = "", kor = "", eng = "", mat = "";	
	String ctmp = request.getParameter("searchid");
	if (ctmp.length() == 0) ctmp = "0";
	try {
		ResultSet rset = stmt.executeQuery("select * from examtable where studentid = " + ctmp + ";");
		name = "해당학번없음";
		while (rset.next()) {
			name = rset.getString(1);
			studentid = Integer.toString(rset.getInt(2));
			kor = Integer.toString(rset.getInt(3));
			eng = Integer.toString(rset.getInt(4));
			mat = Integer.toString(rset.getInt(5));
		}
%>
<h1>성적 조회 후 정정 / 삭제</h1>
<form method='post' name='myform'>
  <table cellspacing=1 width=400 border=0>
    <tr>
      <td width=100>
        <p align=center>조회할 학번</p>
      </td>
      <td width=200>
        <p align=center><input type='text' name='searchid' value=''></p>
      </td>
      <td width=100><input type="submit" value="조회"></td>
    </tr>
  </table>
  <table cellspacing=1 width=400 border=1>
    <tr>
      <th width=100>
        <p align=center>이름</p>
      </th>
      <td width=300>
        <p align=center>
          <input type="text" name="name" value="<%=name%>" required id="inputkorean"
            onkeyup="javascript:return onlyKorean('inputkorean');">
        </p>
      </td>
    </tr>
    <tr>
      <th width=100>
        <p align=center>학번</p>
      </th>
      <td width=300>
        <p align=center><input type='text' name='studentid' value='<%=studentid%>' readonly></p>
      </td>
    </tr>
    <tr>
      <th width=100>
        <p align=center>국어</p>
      </th>
      <td width=300>
        <p align=center><input type='number' min="0" max="100" name='korean' value='<%=kor%>' </p>
      </td>
    </tr>
    <tr>
      <th width=100>
        <p align=center>영어</p>
      </th>
      <td width=300>
        <p align=center><input type='number' min="0" max="100" name='english' value='<%=eng%>'></p>
      </td>
    </tr>
    <tr>
      <th width=100>
        <p align=center>수학</p>
      </th>
      <td width=300>
        <p align=center><input type='number' min="0" max="100" name='mathmatic' value='<%=mat%>'></p>
      </td>
    </tr>
  </table>
<%
		if (studentid.length() != 0) {
			out.println("<table cellspacing=1 width=400 border=0>");
			out.println("<tr>");
			out.println("<td width=200></td>");
			out.println("<td width=100>" + 
							"<p align=center><input type=button value=\"수정\" OnClick=\"submitForm('update')\"></p></td>");
			out.println("<td width=100><p align=center><input type=button value=\"삭제\" OnClick=\"submitForm('delete')\"></p></td>");
			out.println("</tr>");
			out.println("</table>");
		}
%>
<%
		rset.close();
		stmt.close();
		conn.close();
	} catch (Exception e) {
		out.println("무슨 에러가 뜨나");
	}	
%>
</form>
</body>
</html>