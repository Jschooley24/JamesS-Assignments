<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<hr>
<form method="POST" action ="/survey">
<p>
<label> Your Name</label>
<input type ="text" name="name">
</p>
<p>
<label> Location</label>
<select name="location">

<c:forEach items="${locations}" var="location">
<option value="${location}">${location}</option>
</c:forEach>
<!-- how to do it without the array -->
<!-- 
<option value="Boise"> Boise</option>
<option value="Vegas"> Vegas</option>
<option value="Cali"> Cali</option>
<option value="florida"> Florida</option>-- -->
</select>
</p>
<p>
<label>Language</label>
<select name="language">
<c:forEach items="${language}" var="lang">
<option value="${lang}">${lang}</option>
</c:forEach>
<!--  
<option name="java">Java</option>
<option name="python">Python</option>
<option name="mern">MERN</option>
<option name="ruby">Ruby</option>-->
</select>
</p>
<p>
<label>Comments(optional)</label>
<textarea name="comment"></textarea>
</p>
<button>Submit</button>
</form>
<body>

</body>
</html>