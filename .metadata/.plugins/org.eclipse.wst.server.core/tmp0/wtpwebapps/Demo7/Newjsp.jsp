<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="age" value="25"/>
	<c:if test="${age>=18}">
		<p>YOU ARE ELIGIBLE TO VOTE</p>
	</c:if>
	<c:if test="${age<18}">
		<p>YOU ARE NOT ELIGIBLE TO VOTE</p>
		</c:if>
		
<c:set var="fruits" value="${{'Apple','Banana','Cherry','Date'} }"/>
<ul>
<c:forEach var='fruit' >
</c:forEach>
</ul>
</body>
</html>