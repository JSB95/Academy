<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%@include file = "../header.jsp" %>
	
	<div class="container">
	

		<form action="../login" method="post">
			로그인 : <input type="text" name="mid">
			비밀번호 : <input type="text" name="mpassword">
			<input type="submit" value="로그인">
			<!-- 만약에 로그인실패시 -->
			<%
				String result = request.getParameter("result");
			%>
		</form>
		
	</div>
	
	<%@include file = "../footer.jsp" %>

</body>
</html> 