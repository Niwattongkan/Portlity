<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>                  
            <form:form name="login" method="POST" action="login" modelAttribute="login">
                 <table>
                       <tr>
                           <td>User Name</td>
                           <td><form:input path="userName"/></td>
                       </tr>
                       <tr>
                           <td>Password</td>
                           <td><form:password path="password"/></td>
                       </tr>
                       <tr>
                           <td></td>
                           <td><input type="submit" value="Submit"/></td>
                       </tr>
                </table>
           </form:form>
           <p>${login}</p>

</body>
</html>