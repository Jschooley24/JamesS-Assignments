<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Product</title>
</head>
<body>
<h1><c:out value="${product.name}"/></h1>
<c: out value="${product.description}"/>
<c:out value="${product.price}"/>

<hr>
<h2>CAtegories</h2>
<ul>
<c:formEach items="${product.categories}" car="cat">
<li>${cat.name}</li>li>
</c:formEach>
</ul>

<form method="POST" action="/addCatToProd/${product.id}">
<select name="cats">
<c:formEach items="${notInProd} }" car="cat">
<option value="${cat.id }">${cat.name}</option>
</c:formEach>
</select>
<button>Add Category</button>
</form> 
</body>
</html>