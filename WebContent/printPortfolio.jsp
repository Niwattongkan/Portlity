<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
</head>
<body>
<c:forEach items="${listActivity}" var="listActivity">
	${listActivity.page}
</c:forEach>
</body>
</html>