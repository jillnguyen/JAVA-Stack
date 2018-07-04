<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>Home</title>
</head>
<body>

	<h1>Create a dog</h1>
	<form action="/cat" method="POST">
    	<p>Name: <input type="text" name="name"></p>
    	<p>Breed: <input type="text" name="breed"></p>
    	<p>Weight: <input type="text" name="weight"></p>
    	<button>Create a dog!</button>
	</form>
	<br>
	<h1>Create a cat</h1>
	<form action="/cat" method="POST">
    	<p>Name: <input type="text" name="name"></p>
    	<p>Breed: <input type="text" name="breed"></p>
    	<p>Weight: <input type="text" name="weight"></p>
    	<button>Create a cat!</button>
	</form>
</body>
</html>