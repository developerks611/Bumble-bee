<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix = "tag" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
* {
  padding: 0;
  margin: 0;
}

body {
  font-family: Arial, Tahoma, Serif;
  color: #263238;
}

nav {
  display: flex;
  justify-content:space-between; 
  align-items: center;
  padding: 1rem 2rem;
  background: #e06666;
  
}

nav ul {
  display: flex;
  list-style: none; 
}

nav li {
  padding-left: 1rem; 
}

nav a {
  text-decoration: none;
  color: black;
  font-weight:bold;
  
}


</style>
<title>Insert title here</title>
</head>
<body>

<nav>
  <h2>Bumble Bee</h2>
  <ul>
    <li><a href="">Home</a></li>
    <li><a href="/Bumble/searchProduct?action=allbrand">Add Product</a></li>
    <li><a href="/Bumble/searchProduct?action=getAllProduct">View Product</a></li>
    
    <li><a href="">Logout</a></li>
  </ul>
</nav><br>

</body>
</html>