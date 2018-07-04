<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit A Language</title>
</head>
<body>
	<h1>Edit Language</h1>
	<form action="/language/${language.id}" method="post">
	    <input type="hidden" name="_method" value="delete">
	    <input type="submit" value="Delete">
	</form>
	<a href="/languages">Dash Board</a>
	<form:form action="/languages/${language.id}" method="POST" modelAttribute="language">
	<input type="hidden" name="_method" value="put">
	<p>
		<form:label path="name">Name</form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
	</p>
	<p>
		<form:label path="creator">Creator</form:label>
		<form:errors path="creator"/>
		<form:input path="creator"/>
	</p>
	<p>
		<form:label path="currentVersion">Version</form:label>
		<form:errors path="currentVersion"/>
		<form:input path="currentVersion"/>
	</p>
	<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>