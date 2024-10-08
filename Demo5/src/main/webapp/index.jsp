<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int value=3;
out.print("before increment::"+value+"<br>");
value++;
out.print("after increment::"+value);
%>
</body>
</html>