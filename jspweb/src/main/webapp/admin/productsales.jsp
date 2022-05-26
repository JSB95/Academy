<%@page import="dto.Porderdetail"%>
<%@page import="dao.ProductDao"%>
<%@page import="dto.Porder"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
		#chartdiv1, #chartdiv2, #chartdiv3{
		  width: 100%;
		  height: 500px;
		}
	</style>

</head>
<body>
	<% ArrayList<Porderdetail> list = ProductDao.getProductDao().getorderdetail(); %>
	
	<h3> 매출 관리 </h3>

	<div class="containter">
		<div> <!-- 일 매출 차트  -->
			<div id="chartdiv1"></div>
		</div>
		<div class="row">
			<div class="col-sm-6"> <!-- 일 매출 테이블  -->
				주문확정 리스트
				<div id="chartdiv2"></div>
			</div>
			<div class="col-sm-6"> <!-- 카테고리별 차트  -->
				일별 매출
				<div id="chartdiv3"></div>
			</div>
			<div> <!-- 제품별 판매추이 선차트  -->
				
			</div>
		</div>
		
		<table class="table">
		
			<tr>
				<th> 주문 상세 번호</th>
				<th> 주문 수량</th>
				<th> 주문 가격</th>
				<th> 주문 번호</th>
				<th> 재고 번호</th>
			</tr>
			
			<% for (Porderdetail porderdetail : list) { %>
			
			<tr onclick="getchart(<%=porderdetail.getSno()%>)">
			
				<td> <%=porderdetail.getOrderdetailno() %> </td>
				<td> <%=porderdetail.getSamout() %> </td>
				<td> <%=porderdetail.getTotalprice() %> </td>
				<td> <%=porderdetail.getOrderno() %> </td>
				<td> <%=porderdetail.getSno() %> </td>
			
			</tr>
		
			<% } %>
		</table>
	</div>
	<script type="text/javascript" src="/jspweb/js/productsales.js"></script>

</body>
</html> 