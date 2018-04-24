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
		if (request.getParameter("Action") != null) {

			Connection connect = null;
			Statement s = null;

			try {
				Class.forName("com.mysql.jdbc.Driver");

				connect = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/projectportlity" + "?user=root&password=11089848a");

				String username = request.getParameter("txtUsername");
				String password = request.getParameter("txtPassword");

				s = connect.createStatement();

				String sql = "SELECT * FROM  member WHERE " + " Username = '" + username + "' AND "
						+ " Password = '" + password + "' ";

				ResultSet rec = s.executeQuery(sql);

				if (!rec.next()) {
					out.print("<font color=red>Username and Password Incorrect!</font>");
				} else {
					rec.first();
					session.setAttribute("sUserID", rec.getString("UserID"));
					response.sendRedirect("profile.jsp");
				}

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

		}
	%>

	<form name="frmLogin" method="post" action="index.jsp?Action=Login">
		Login<br>
		<table border="1" style="width: 300px">
			<tbody>
				<tr>
					<td>&nbsp;Username</td>
					<td><input name="txtUsername" type="text" id="txtUsername">
					</td>
				</tr>
				<tr>
					<td>&nbsp;Password</td>
					<td><input name="txtPassword" type="password" id="txtPassword">
					</td>
				</tr>
			</tbody>
		</table>
		<br> <input type="submit" name="Submit" value="Login">
	</form>

</body>
</html>