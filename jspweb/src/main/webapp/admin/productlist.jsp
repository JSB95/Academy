<%@page import="dao.CategoryDao"%>
<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		ArrayList<Product> productList = ProductDao.getProductDao().getproductlist();
	%>

	<h3> 제품 목록 페이지 </h3>
	
	<table class="table table-hover">
	
		<tr>
		
			<th> 제품번호 </th>
			<th> 대표이미지 </th>
			<th> 제품명 </th>
			<th> 가격 </th>
			<th> 할인율 </th>
			<th> 판매금액 </th>
			<th> 제품상태 </th>
			<th> 카테고리 </th>
			<th> 색상 </th>
			<th> 사이즈 </th>
			<th> 재고수량 </th>
			<th> 수정일 </th>
			<th> 버튼 </th>
		
		</tr>
		
		<%
			for (Product product : productList) { 
				float price = product.getPprice() * product.getPdiscount();
				String cname = CategoryDao.getCategoryDao().getcname(product.getCno());
		
		%>
			
		
		<tr>
		
			<th id="pno"> <%=product.getPno() %> </th>
			<th> <%=product.getPimg() %> </th>
			<th> <%=product.getPname() %> </th>
			<th> <%=product.getPprice()%> </th>
			<th> <%=product.getPdiscount() %> </th>
			<th> <%=price %> </th>
			<th> <%=product.getPactive() %> </th>
			<th> <%=cname %> </th>
			<th> 색상 </th>
			<th> 사이즈 </th>
			<th> 재고수량 </th>
			<th> 수정일 </th>
			<th> 비고 버튼 </th>
		
		</tr>
		
		<% } %>
	
	</table>
	
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/jspweb/js/productadd.js" type="text/javascript"></script>

</body>
</html> 