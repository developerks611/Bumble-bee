<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix = "tag" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Brand</title>
<style>
.container {
 text-align:center;
 margin-top:5%;
}

.createAccount {
	margin-left: 0.5%;
}

.createAccount{

	background-color:#e06666;
	outline: none;
    border: none;
    width:10%;
    height:45px;
    font-size:100%;
    padding:5px;
    font-weight:bold;
}

.txt_input{

	width:30%;
	height:auto;
	margin:10px;
	padding:10px;
	font-size:100%;
	border-color:#e06666;
}
</style>
</head>
<body>
<jsp:include page="categ-nav.jsp" />
<p>${message}<p>
	<div class="container">
	<tag:set var = "cat" scope = "session" value = "${category}"/>
	
		
		<form action="updateBrand" method="post">
		
			<input type="text" class="txt_input" placeholder="Category Name" name="addcatg" value="${cat.getCategoryname()}">
			<input type="hidden" class="txt_input"  name="cid" value="${cat.getCategoryid()}">
			<input type="hidden" name="action" value="updatecategory">
			<button type="submit" class="btn btn-success createAccount" >Update</button>
		</form>

	
	</div>
	
</body>
</html>