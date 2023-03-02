<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix = "tag" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>

.createAccount{

	background-color:#e06666;
	outline: none;
    border: none;
    width:100%;
    height:25px;
    font-size:100%;
    padding:5px;
    font-weight:bold;
}
table, td, th {
  border: 1px solid;
  border-collapse: collapse;
}

table {
  width: 100%;
  border-collapse: collapse;
}
th{
background-color:orange;

}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${message}</p>
 <table>
  <tr>
    <th>Product ID</th>
    <th>Product Name</th>
    <th>Product Description</th>
    <th>Product Price</th>
    <th>Product Quantity</th>
    <th colspan="2">Action</th>
  </tr>

  <tag:forEach var="product" items="${productlist}">
  
  <tr>
    <td>${product.getProductid()}</td>
    <td>${product.getProductname()}</td>
    <td>${product.getProdcutdescription()}</td>
    <td>${product.getPrice()}</td>
    <td>${product.getQuantity()}</td>
   
    <td>
    <form action="searchProduct" method="Post">
     <input type="hidden" name="pid" value="${product.getProductid()}">
    <input type="hidden" name="action" value="searchproducts">
    <button type="submit" class="btn btn-success createAccount">View</button></form>
    </td>
    
    <td><form action="deleteProduct" method="Post">
   
    <input type="hidden" name="pid" value="${product.getProductid()}">
    <input type="hidden" name="action" value="deleteproducts">
    <button type="submit" class="btn btn-success createAccount">Delete</button>
    </form></td>
  
 </tag:forEach>

</table>

</body>
</html>