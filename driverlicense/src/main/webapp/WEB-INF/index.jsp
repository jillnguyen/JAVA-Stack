<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>List of people</h1>
	<table>
		<tr>
			<th>First name</th>
			<th>Last name</th>
			<th>License Number</th>
			<th>State</th>
			<th>Expiration Date</th>
		</tr>
		<c:forEach items="${persons}" var="person">
		<tr>
			<td><c:out value="${person.firstName }"/></td>
			<td><c:out value="${person.lastName }"/></td>
			<td><c:out value="${person.license.number }"/></td>
			<td><c:out value="${person.license.state }"/></td>
			<td><c:out value="${person.license.expiration_date }"/></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>