<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp" %>
	
	<br><br><br><br>
	
	<div class="container">
	
		<h5>테스트</h5>
	
		<div class="col-md-5 offset-3 text-center" style="float: none; margin:0 auto;">
		
			<img alt="" src="img/쇼핑몰1.jpg" style="text-align: center;">
		
		</div>
		
		<div class="row">
		
			<div class="col-md-5 offset-1">
				내용영역
			</div>
			
			<div class="col-md 4 offset-1">
				지도영역
			</div>
		
		</div>
		
		<div class="col-md-1 text-center" style="float: none; margin:0 auto;">
			<a href="boardlist.jsp"><input type="button" class="form-contorl" value="뒤로가기" style="text-align: center;"></a>
		</div>
		
		
	
	</div>
	
	<%@include file="footer.jsp" %>

</body>
</html>