<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Course</h1>
<form:form action="/courses/${course.id}" method="post" modelAttribute="course">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="instructor">Instructor:</form:label>
        <form:errors path="instructor"/>
        <form:input path="instructor"/>
    </p>
    <p>
        <form:label path="numberOfStudents">Limit:</form:label>
        <form:errors path="numberOfStudents"/>
        <form:input path="numberOfStudents"/>
    </p>  
    <input type="submit" value="Update!"/>
</form:form>
</body>
</html>