<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create Product</h1>
<form method="POST" action="/newProd">

<label for="name">Name:</label>
<input type="text" name="name">

<label for="description">Description:</label>
<textarea name="desc"></textarea>

<label for="price">Price:</label>
<input type="number" name="price">
<button>Create Product</button>
</form>
</body>
</html>