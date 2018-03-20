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
	<c:forEach items="${listuser}" var="listuser">
				<div class="div4" style="font-size: 20px;">Firstname:
					&nbsp;&nbsp;&nbsp;&nbsp;${listuser.name}</div>
				<br>
				<div class="div5" style="font-size: 20px;">Lastname:
					&nbsp;&nbsp;&nbsp;&nbsp;${listuser.surname}</div>
				<br>
				<div class="div5" style="font-size: 20px;">Nickname:
					&nbsp;&nbsp;&nbsp;&nbsp;${listuser.nicname}</div>
				<br>
				<div class="div8" style="font-size: 20px;">Email:
					&nbsp;&nbsp;&nbsp;&nbsp;${listuser.email}</div>
				<br>
				<br>
				<form action="#" method="POST" enctype="multipart/form-data">
					<input type="file" name="file1"> <br>
				</form> 
				</a>
			</c:forEach>
</body>
</html>