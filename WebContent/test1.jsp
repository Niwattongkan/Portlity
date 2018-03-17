<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<c:forEach items="${listuser}" var="listuser">
			<tr>
				${listuser.age}
				<td><a href="editDataSutent.do">edit</a></td>
				<!-- <td><a href="editEmp.do?id=${emp.employeeId}">Edit</a></td>
				<td><a href="deleteEmp.do?id=${emp.employeeId}">Remove</a></td>
				<td><a href="listPhone.do?id=${emp.employeeId }">List Phone</a></td> -->
			</tr>
		</c:forEach>
	</table>
		<c:forEach items="${listuser}" var="listuser">
			${listuser.classroom}
		</c:forEach>
</body>
</html>