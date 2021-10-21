<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/">Dashboard</a> | <a href="/edit/${lan.id}">Edit</a> | <a href="/delete/${lan.id}">Delete</a>

<p><c:out value= "${thisLang.name}"/></p>
<p><c:out value="${thisLang.creator}"/></p>
<p><c:out value="${thisLang.currentVersion}"/></p>

</body>
</html>