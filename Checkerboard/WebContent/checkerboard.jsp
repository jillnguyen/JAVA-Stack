<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/Checkerboard/style.css" type="text/css">
	<title>Checker Board</title>
</head>
<body>
<!-- Getting query parameters -->
	<%  String height = request.getParameter("height"); %>
	<% 	String width = request.getParameter("width"); %>
	

<!-- Creating a check board accordingly -->
	<h2>Checker Board: <%= height %>h by <%= width %>w</h2>
	<h3></h3>
	<% for (int line = 0; line < Integer.parseInt(height); line++) {%>
		<% for (int index = 0; index < Integer.parseInt(width); index++){ %>
			<% if (line % 2 != 0){ %>
				<% if (index % 2 != 0){ %>
					<div class="box red"></div>
				<% } %>
				<% if (index % 2 == 0){ %>
					<div class="box blue"></div>
				<% } %>
			<% } %>
			<% if (line % 2 == 0){ %>
				<% if (index % 2 != 0){ %>
					<div class="box blue"></div>
				<% } %>
				<% if (index % 2 == 0){ %>
					<div class="box red"></div>
				<% } %>
			<% } %>
		<% } %>
		<br>
  	<% } %>
</body>
</html>