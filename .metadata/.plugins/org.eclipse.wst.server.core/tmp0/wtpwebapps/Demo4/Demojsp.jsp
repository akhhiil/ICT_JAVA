<%@page import ="java.io.PrintWriter"%>
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
	String name=request.getParameter("name");
	String price=request.getParameter("price");
	String quantity=request.getParameter("quantity");
	out.println("NAME:"+name+"<br>");
	out.println("PRICE:"+price+"<br>");
	out.println("QUANTITY:"+quantity+"<br>");
%>
</body>
</html>