<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login/Registration</title>
</head>
<body>
	<h1>Registration</h1>    
   	<p><form:errors path="student.*"/></p>
   
   	<form:form method="POST" action="/registration" modelAttribute="student">
       <p>
           <form:label path="name">Name:</form:label>
           <form:input type="name" path="name"/>
       </p>
       <p>
           <form:label path="email">Email:</form:label>
           <form:input type="email" path="email"/>
       </p>
       <p>
           <form:label path="password">Password:</form:label>
           <form:password path="password"/>
       </p>
       <p>
           <form:label path="passwordConfirmation">Password Confirmation:</form:label>
           <form:password path="passwordConfirmation"/>
       </p>
       <input type="submit" value="Register!"/>
   	</form:form>

	<h1>Login</h1>
    <p><c:out value="${error}" /></p>
    <form method="post" action="/login">
        <p>
            <label type="email" for="email">Email</label>
            <input type="text" id="email" name="email"/>
        </p>
        <p>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>
        </p>
        <input type="submit" value="Login!"/>
    </form>   
   	
</body>
</html>