<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show A Language</title>
</head>
<body>
	<a href="/languages">Dash board</a>
	<p><c:out value="${language.name }"/></p>
	<p><c:out value="${language.creator }"/></p>
	<p><c:out value="${language.currentVersion }"/></p>
	<a href="/languages/edit/${language.id }">Edit</a>
	<form:form action="/languages/${language.id }" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="Delete">
	</form:form>
</body>
</html>