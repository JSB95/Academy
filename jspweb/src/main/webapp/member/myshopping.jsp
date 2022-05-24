<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "../header.jsp" %>
	
	<div class="container">
	
		<div class="row">
		
			<div class="col-md-3">
			
				<%@include file = "infosidebar.jsp" %>
			
			</div>
			
			<div class="col-md-9">
			
				<h3>주문현황</h3>
				
				<div id="orderbox"></div>
			
			</div>
		
		</div>
	
	</div>
	<script src="https://cdn.jsdelivr.net/npm/lodash@4.17.21/lodash.min.js"></script>
	<script src='https://cdn.jsdelivr.net/npm/underscore@1.12.0/underscore-min.js'></script>
	<script src="/jspweb/js/myshopping.js" type="text/javascript"></script>
	<%@include file = "../footer.jsp" %>
</body>
</html>