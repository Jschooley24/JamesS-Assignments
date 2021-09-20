<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src ="js/main/js"><</script>
<title>Time Template</title>
</head>
<body>
<script>timeAlert()</script>
<p><fmt:formatDate pattern= "h:mm a" value ="${datetime}"/></p>
<a href ="/date"> Date Template</a>
</body>
</html>l>