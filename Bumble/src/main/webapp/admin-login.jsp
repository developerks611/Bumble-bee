<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix = "tag" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Muli'><link rel="stylesheet" href="./style.css">
<style type="text/css">
    
    body{
  background: #008CA0 !important;
  font-family: 'Muli', sans-serif;
  
}
h1{
  color: #fff;
  padding-bottom: 2rem;
  font-weight: bold;
}
a{
  color: #333;
}

.form-control:focus {

    color: #000;
    background-color: #fff;
    border:2px solid #E8D426;
    outline: 0;
    box-shadow: none;

}

.btn{
  background: #e06666;
  border: #E8D426;
}
.btn:hover {
  background: black;
  border: #E8D426;
}

.container{
    margin-top: 10%;
}

.errormsg{
	color:red;
	font-weight:bold;
}
</style>
</head>
<body>

<div class="pt-5">

  
<div class="container">
                <div class="row">
                    <div class="col-md-5 mx-auto">
                        <div class="card card-body">
                                                    
                            <form action="adLogin" method="post">
                            <p class="errormsg">${message}</p>
                                <div class="form-group required">
                                    <lSabel for="username">Email</lSabel>
                                    <input type="email" class="form-control text-lowercase" required name="email" value="">
                                </div>                    
                                <div class="form-group required">
                                    <lSabel for="username">Password</lSabel>
                                    <input type="password" class="form-control text-lowercase"  required name="password" value="">
                                </div> 
                               
                                <div class="form-group pt-1">
                                	<input type="hidden" name="action" value="adminlogin">
                                    <button class="btn btn-primary btn-block" type="submit">Log In</button>
                                </div>
                            </form>
                           
                        </div>
                    </div>
                </div>
            </div>
</div>
<!-- partial -->
  
</body>
</html>