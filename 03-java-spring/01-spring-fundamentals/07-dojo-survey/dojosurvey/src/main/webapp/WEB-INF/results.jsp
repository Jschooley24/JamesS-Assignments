<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<!-- result comes from Surverycontroll.java under new attribute getting "result" see below
viewModel.addAttribute("result",new Survey(name, location, language, comment)); -->
<p>Name: <c:out value="${result.name}"/></p>
<p>Location: <c:out value="${result.location}"/></p>
<p>Language: <c:out value="${result.language}"/></p>
<p>Comment: <c:out value="${result.comment}"/></p>
</body>
</html>