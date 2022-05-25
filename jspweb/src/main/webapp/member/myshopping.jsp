<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href="/jspweb/css/myshopping.css" rel="stylesheet">
	
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
				
				<div id="orderbox">
				
				</div>
			
			</div>
		
		</div>
	
	</div>
	
	<div class="modal fade" id="cancelmodal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">주문 취소</h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	        <h5>주문 취소 요청 사유</h5>
	        <textarea id="cancelconfirm" rows="" cols="" class="form-control"></textarea>
	      </div>
	      <div class="modal-footer">
	        <button id="modalclose" type="button" class="btn btn-secondary" data-bs-dismiss="modal">취소</button>
	        <button onclick="cancel()" type="button" class="btn btn-primary">주문 취소 요청</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/lodash@4.17.21/lodash.min.js"></script>
	<script src='https://cdn.jsdelivr.net/npm/underscore@1.12.0/underscore-min.js'></script>
	<script src="/jspweb/js/myshopping.js" type="text/javascript"></script>
	<%@include file = "../footer.jsp" %>
</body>
</html>