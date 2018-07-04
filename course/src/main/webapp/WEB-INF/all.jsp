<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Courses</title>
</head>
<body>
<h1>Welcome, <c:out value="${student.name }"/></h1>
<table>
	<tr>
		<th>Course</th>
		<th>Instructor</th>
		<th>Sign-ups</th>
		<th>Action</th>
	</tr>
<c:forEach var="row" items="${courses}"> 
     <tr>
        <td>${row[1]}</td>
        <td>${row[2]}</td>
        <td>${row[4]}/${row[3]}</td>
        <td>
	        <form:form action="/createApplication" method="post" modelAttribute="application">
			    <p>
			        <form:hidden path="student" value="${student.id}"/>
			        <form:hidden path="course" value="${row[0]}"/>
			    </p>
				 <input type="submit" value="Add"/>
			</form:form>   
        </td>
     </tr>
</c:forEach>
</table>
     <a href="/courses/new">Add a course</a>

</body>
</html>