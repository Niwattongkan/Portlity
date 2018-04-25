<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Object strUserID = session.getAttribute("sUserID");
		if (strUserID == null) // Check Login
		{
			response.sendRedirect("index.jsp");
		}

		Connection connect = null;
		Statement s = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectportlity" + "?user=root&password=11089848a");

			s = connect.createStatement();

			String sql = "SELECT * FROM  member WHERE UserID = '" + strUserID.toString() + "' ";

			ResultSet rec = s.executeQuery(sql);
			if (rec.next()) {
	%>

	Profile
	<br>
	<table border="1" style="width: 300px">
		<tbody>
			<tr>
				<td>&nbsp;UserID</td>
				<td><%=rec.getString("UserID")%></td>
			</tr>
			<tr>
				<td>&nbsp;Username</td>
				<td><%=rec.getString("Username")%></td>
			</tr>
			<tr>
				<td>&nbsp;Password</td>
				<td><%=rec.getString("Password")%></td>
			</tr>
			<tr>
				<td>&nbsp;Email</td>
				<td><%=rec.getString("Email")%></td>
			</tr>
			<tr>
				<td>&nbsp;Name</td>
				<td><%=rec.getString("Name")%></td>
			</tr>
		</tbody>
	</table>
	<br>
	<%
		}
	%>
	<%
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			if (s != null) {
				s.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
			e.printStackTrace();
		}
	%>

</body>
</html>