<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<!-- Getting query parameters -->
	<%  Cat cat = (Cat) request.getAttribute("cat"); %>
	

<!-- Creating a check board accordingly -->
	<p>
        <c:out value="${cat.showAffection()}"/>
    </p>
</body>
</html>