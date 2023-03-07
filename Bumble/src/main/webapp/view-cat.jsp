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
<jsp:include page="categ-nav.jsp" />
<p>${message}</p>
 <table>
  <tr>
    <th>Category ID</th>
    <th> Name</th>
    
    <th colspan="2">Action</th>
  </tr>

  <tag:forEach var="cat" items="${catlist}">
  
  <tr>
    <td>${cat.getCategoryid()}</td>
    <td>${cat.getCategoryname()}</td>

   
    <td>
    <form action="searchCat" method="Post">
     <input type="hidden" name="cid" value="${cat.getCategoryid()}">
    <input type="hidden" name="action" value="categorysearch">
    <button type="submit" class="btn btn-success createAccount">View</button></form>
    </td>
    
    <td><form action="" method="Post">
   
    <input type="hidden" name="cid" value="${cat.getCategoryid()}">
    <input type="hidden" name="action" value="searchbrand">
    <button type="submit" class="btn btn-success createAccount">Delete</button>
    </form></td>
  
 </tag:forEach>

</table>

</body>
</html>