<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core&quot; prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add/Update Product</title>
<style>
/* General body styling */
body {
font-family: Arial, sans-serif;
background-color: #f9f9f9;
display: flex;
justify-content: center;
align-items: center;
height: 100vh;
margin: 0;
}

/* Container for the form */
.form-container {
background-color: #fff;
padding: 70px;
border-radius: 8px;
box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
width: 400px;
margin: auto;
text-align: center;
}

/* Styling for the heading */
h2 {
color: #333;
font-size: 24px;
margin-bottom: 20px;
}

/* Input field styling */
label {
display: block;
font-size: 14px;
color: #333;
margin-bottom: 8px;
text-align: left;
}

input[type="text"], input[type="number"] {
width: 100%;
padding: 10px;
margin-bottom: 15px;
border: 1px solid #ccc;
border-radius: 4px;
box-sizing: border-box;
font-size: 14px;
}

/* Submit button styling */
.submit-btn {
width: 100%;
padding: 10px;
background-color: #4CAF50;
color: white;
border: none;
border-radius: 4px;
font-size: 16px;
cursor: pointer;
transition: background-color 0.3s ease;
}

.submit-btn:hover {
background-color: #45a049;
}

/* Container center styling */
.form-container {
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
}

/* Align labels and inputs properly */
label, input {
width: 100%;
}
</style>
</head>
<body>

<div class="form-container">
<h2>${product.id == null ? 'Add Product' : 'Edit Product'}</h2> <!-- Add/Edit heading -->

<form action="saveProduct" method="post">
<!-- Hidden input for productId -->
<input type="hidden" id="productId" name="productId" value="${product.id}">

<label for="productName">Product Name:</label>
<input type="text" id="productName" name="productName" required value="${product.name != null ? product.name : ''}">

<label for="productPrice">Product Price:</label>
<input type="number" id="productPrice" name="productPrice" step="0.01" required value="${product.price != null ? product.price : ''}">

<label for="productQuantity">Product Quantity:</label>
<input type="number" id="productQuantity" name="productQuantity" required value="${product.quantity != null ? product.quantity : ''}">

<input type="submit" value="Save" class="submit-btn">
</form>
</div>

</body>
</html>