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
<jsp:include page="customer-nav.jsp" />
<p>${message}</p>
 <table>
  <tr>
  	<th>Loan ID</th>
    <th>Customer Name</th>
    <th>Customer Email</th>
    <th>Customer Birthday</th>
    <th>Loan Amount</th>
    <th>Used Amount</th>
    <th>Installment Plan</th>
    <th>Loan Status</th>
   
  </tr>

  <tag:forEach var="loan" items="${loanlist}">
  
  <tr>
  	<td>${loan.getLoanid()} </td>
    <td>${loan.getCustomer().getFname()} ${loan.getCustomer().getLname()}</td>
    <td>${loan.getCustomer().getEmail()}</td>
    <td>${loan.getCustomer().getDob()}</td>
    <td>${loan.getLoanamount()}</td>
    <td>${loan.getInstallment()}</td>
    <td>${loan.getUsedamount()}</td>
    <td>${loan.getLoanstatus()}</td>
   
  
 </tag:forEach>

</table>

</body>
</html>