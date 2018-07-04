<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New License</title>
</head>
<body>
	<h1>NEW LICENSE</h1>
	<form:form action="/newLicense" method="POST" modelAttribute="license">
	<p>
		<form:label path="person">Person:</form:label>
		<form:errors path="person"/>
		<form:select path="person">
    		<form:options items="${persons}"/>
		</form:select>
	</p>
	<p>
		<form:label path="number">License #:</form:label>
		<form:errors path="number"/>
		<form:input path="number"/>
	</p>
	<p>
		<form:label path="state">State:</form:label>
		<form:errors path="state"/>
		<form:input path="state"/>
	</p>
	<p>
		<form:label path="expiration_date">Expiration Date:</form:label>
		<form:errors path="expiration_date"/>
		<form:input type="date" path="expiration_date" name="expiration"/>
	</p>
	<input type="submit" value="SUBMIT">
	</form:form>
</body>
</html>