<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Employee Details</h3>
<%
String url="jdbc:mysql://localhost:3306/mystore";
String username="root";
String password="root";
try{
	//Class.forName("com.mysql.cj.jdbc.Driver");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,username,password);
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from employee");
	out.println("Employee ID NAME CITY<br>");
	while(rs.next()){
		out.println(rs.getInt(1)+" ");
		out.println(rs.getString(2)+" ");
		out.println(rs.getString(3)+"<br>");
	}
	rs.close();
	stmt.close();
	con.close();
}
catch(Exception e){
	e.printStackTrace();
}
%>
</body>
</html>