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
<label>PRODUCT LIST</label>
<table>
	<thead>
		<tr>
			<th>PRODUCT ID</th>
			<th>PRODUCT NAME</th>
			<th>PRICE</th>
			<th>QUANTITY</th>
			<th>ACTIONS</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.quantity}</td>
				<td>
				<!-- Edit Product Button -->
                           <form action="editProduct" method="get">
                               <input type="hidden" name="productId" value="${product.id}">
                               <input type="submit" value="Edit" class="action-btn edit">
                           </form> <!-- Delete Product Button -->
                           <form action="deleteProduct" method="post">
                               <input type="hidden" name="productId" value="${product.id}">
                               <input type="submit" value="Delete" class="action-btn delete"
                                   onclick="return confirm('Are you sure you want to delete this product?');">
                           </form>
				</td>
			</tr>
		</c:forEach>
	</tbody> 
</table>
</body>
</html>