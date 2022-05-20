<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	

	<%@include file="../header.jsp" %>
	
	<div class="container">
	
		<div class="processbox">
		
			<span> 01 옵션선택 </span> <span> > </span>
			<span> 02 장바구니 </span> <span> > </span>
			<span id="process_active"> 03 주문결제 </span> <span> > </span>
			<span> 04 주문완료 </span>
		
		</div>
		
		<table class="table my-5" id="carttable">

		</table>
		
		<div class="col-sm-2">
			
			<button class="form-control" onclick="cancel(-1)"> 상품 전체 삭제</button>
			
		</div>
		
		<div class="paybox">
		
			<span>총 상품금액</span> <span id="sumprice"> 20,000원 </span> <span> + </span>
			<span> 배송비 </span> <span id="deleverypay"> 123 </span> <span> = </span>
			<span> 총 주문금액 : </span> <span id="totalpay"> 22,500원 </span> 
			
			<div class="pointbox">
			
				<span> 주문 시 적립 예정 포인트 : </span> <span id="point"> 225 </span>
			
			</div>

		
		</div>
		
		<div class="row my-5">
		
			<div class="col-sm-3 offset-3">
			
				<button class="form-control py-4"> 계속 쇼핑하기 </button>
			
			</div>
			
			<div class="col-sm-3">
			
				<button onclick="payment()" style="background-color: blue; color: white;" class="form-control py-4"> 결제하기 </button>
				
			</div>
		
		</div>
		
	</div>
	
	<%@include file="../footer.jsp" %>
	
	<!-- iamport.payment.js -->
  	<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	
	<script type="text/javascript" src="/jspweb/js/orderpay.js"></script>

</body>
</html>