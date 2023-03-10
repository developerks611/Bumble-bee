<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix = "tag" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
	.container {
 text-align:center;
}

.txt_input{

	width:30%;
	height:auto;
	margin:10px;
	padding:10px;
	font-size:100%;
	border-color:#e06666;
}


.createAccount{

	background-color:#e06666;
	outline: none;
    border: none;
    width:32%;
    height:40px;;
    font-size:100%;
    padding:10px;
    font-weight:bold;
}
.select_txt{
	width:32%;
}
	
</style>
<meta charset="ISO-8859-1">
<title>Insert Product</title>
</head>
<body>
<jsp:include page="product-nav.jsp" />
<div class="container">
<p>${message}</p>
<p>
<tag:set var = "product" scope = "session" value = "${product}"/>

<form action="updateProduct" method="Post">

<input type="text" placeholder="Product Name" name="productname" required class="txt_input" value="${product.getProductname()}" required><br>
<input type="text" placeholder="Product Description" name="productdescription" required class="txt_input" value="${product.getProdcutdescription()}" required><br>
<input type="number" placeholder="Product Price" name="price" required min="1" class="txt_input" value="${product.getPrice()}" required><br>
<input type="number" placeholder="Product Quantity" name="quantity" required min="1" class="txt_input" value="${product.getQuantity()}" required><br>
<input type="hidden" name="action" value="updatedproduct">
<input type="hidden" name="pid" value="${product.getProductid()}">
<button type="submit" class="btn btn-success createAccount">Update Product</button>
</form>
</div>
</body>
</html>