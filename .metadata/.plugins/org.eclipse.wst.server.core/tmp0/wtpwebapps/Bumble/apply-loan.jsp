<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix = "tag" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<p class="msg">${message}<p>
<form action="addLoan" method="post">
<input type="number" min="0" max="15000" name="loanamount">
<input type="number" min="0" max="15000" name="usedammount">
<input type="number" min="0" max="3" name="ins">
<input type="hidden" name="action" value="addloan">
<button type="submit" class="btn btn-success createAccount">Add Loan</button>
</form>
</body>
</html>