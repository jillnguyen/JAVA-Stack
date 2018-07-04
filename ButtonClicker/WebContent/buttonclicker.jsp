<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>Count Click</title>
</head>
<body>
	<% 
	HttpSession session = request.getSession(); 
	int counter = (int) session.getAttribute("clickCount");
	%>
	<button id="btn">Click Me</button>
	<p>The button has been clicked <%= counter %></p>
</body>
</html>