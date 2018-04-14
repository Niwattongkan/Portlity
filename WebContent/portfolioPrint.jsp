<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PrintPortfolio</title>
</head>
<body>
<div id="HTMLtoPDF">
	<img alt="" src="images/pictures/InformationTechnology/cover.jpg">

	
	<c:forEach items="${listActivity}" var="listActivity">
		${listActivity.page}
	</c:forEach>
	<a  onclick="HTMLtoPDF()"><input  type="button"class="btn btn-info" id="button1" value="Download PDF"> </a>
</div>
	
 
	<script src="js/pdfFromHTML.js"></script>
	<script src="js/jspdf.js"></script>
</body>
</html>