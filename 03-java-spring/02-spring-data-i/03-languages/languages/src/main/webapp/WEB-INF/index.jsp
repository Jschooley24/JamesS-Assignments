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
<h1>Welcome to Languages</h1>
<hr>
<table>
<thead>
<tr>
<td>Name</td>
<td>Creator</td>
<td>Version</td>
<td>Action</td>
</tr>
</thead>
<tbody>
<p>Languages</p>
<c:forEach items ="${allLanguages}" var="lan">
<tr>
<td><a href="/show/${lan.id}"> ${lan.name}</a></td>
<td>${lan.creator}</td>
<td>${lan.currentVersion}</td>
<td><a href="/edit/${lan.id}">Edit</a> | <a href="/delete/${lan.id}">Delete</a></td>
</tr>
</c:forEach>
</tbody>

</table>
<h3>Create New Language</h3>
<form:form action="/" method="POST" modelAttribute="language">
<p>
<form:label path="name">Name:</form:label>
<form:errors path="name"/>
<form:input path="name"/>

<form:label path="creator">Creator:</form:label>
<form:errors path="creator"/>
<form:input path="creator"/>

<form:label path="currentVersion">Version:</form:label>
<form:errors path="currentVersion"/>
<form:input path="currentVersion"/>
</p>
<button>Add New Language</button>
</form:form>
</body>
</tbody>
</html>