<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="css/login.css" rel="stylesheet">
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>
	<%@include file = "header.jsp" %>
	
	<br><br>
	
	
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->
	
	<div class="wrapper fadeInDown ">
	  <div id="formContent">
	    <!-- Tabs Titles -->
	
	    <!-- Icon -->
	    <div class="fadeIn first">
	     조그만 로고
	    </div>
	
	    <!-- Login Form -->
	    <form>
	      	<input type="text" id="login" class="fadeIn second" name="login" placeholder="id">
	      	<input type="text" id="password" class="fadeIn third" name="login" placeholder="password">
			<input type="submit" class="fadeIn fourth" value="Log In" style="width: 70%">
			<a href="signup.jsp"><input type="button" class="fadeIn fourth" value="SIGN UP" style="width: 70%"></a>	
	    </form>
	
	    <!-- Remind Passowrd -->
	    <div id="formFooter">
	      <a class="underlineHover" href="#">Forgot Password?</a>
	    </div>
	
	  </div>
	</div>


	<%@include file = "footer.jsp" %>

</body>
</html>