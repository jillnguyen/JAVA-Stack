<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="com.jillnguyen.models.Person"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>Show Person</title>
</head>
<body>
<!--  -->	<% Person person = (Person) request.getAttribute("person"); %>
	
	<h1>
		<c:out value="${person.greeting() }" />
	</h1>
	
	
</body>
</html>