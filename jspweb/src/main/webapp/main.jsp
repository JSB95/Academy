<%@page import="java.util.TreeSet"%>
<%@page import="java.util.Set"%>
<%@page import="dto.Stock"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<%@include file = "header.jsp" %>
	
	<div class="container">
		
		<div id="mainslide" class="carousel slide" data-bs-ride="carousel" data-bs-interval="2000">	
		
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#mainslide" data-bs-slide-to="0" class="active"></button>
				<button type="button" data-bs-target="#mainslide" data-bs-slide-to="1"></button>
				<button type="button" data-bs-target="#mainslide" data-bs-slide-to="2"></button>
			</div>
		
			<div class="carousel-inner">
			
				<div class="carousel-item active">
				
					<img alt="" src="img/main1.jpg">
					
				</div>
				
				<div class="carousel-item">
				
					<img alt="" src="img/main2.jpg">
					
				</div>
				
				<div class="carousel-item">
				
					<img alt="" src="img/main3.jpg">
					
				</div>
				
				<button class="carousel-control-prev" type="button" data-bs-target="#mainslide" data-bs-slide="prev"> <span class="carousel-control-prev-icon"></span> </button>
				<button class="carousel-control-next" type="button" data-bs-target="#mainslide" data-bs-slide="next"> <span class="carousel-control-next-icon"></span> </button>
				
				
			
			</div>
		
		</div>
		
		
		
		<div class="row adbox">
		
			<div class="col-md-6">
				<img alt="" src="img/mainad1.gif">
			</div>
			
			<div class="col-md-6">
				<img alt="" src="img/mainad2.jpg">
			</div>
		
		</div>
		
		<div class="main_box">
		
			<h6 class="main_title">BEST</h6>
		
			<div class="row">
			
			<%
				ArrayList<Product> list = ProductDao.getProductDao().getproductlist();
			
				for (Product p : list) {
			%>
			
				<div class="col-md-3 best_box">
					
					<a href="product/productview.jsp?pno=<%=p.getPno()%>"> <img alt="" src="admin/productimg/<%=p.getPimg()%>"> </a>
					
					<div class="p_item">
						<div class="p_title"><%=p.getPname() %></div>
						
						<%
							ArrayList<Stock> stocks = ProductDao.getProductDao().getStock(p.getPno());
							Set<String> sizelist = new TreeSet<>();
							for (Stock s : stocks) {sizelist.add(s.getSsize());}
						%>
						
						<div class="p_size">
						
						<%
							for (String temp : sizelist) {
						%>
						
							<%= temp + "  "  %>
						
						<% } %>
						
						</div>
						
						<div class="p_review">리뷰 : 412</div>
						
						<div class="row">
							<%
								DecimalFormat df = new DecimalFormat("#,###원");
								int price = (int)(p.getPprice() * p.getPdiscount());
								if (p.getPdiscount() == 0) {
							%>
									<div class="p_price"><%=df.format(p.getPprice())%></div>
									<div class="p_review">리뷰 : 412</div>
							<%
								} else {
							%>
									<div class="p_discount"><%=df.format(p.getPprice()) %></div>
									<div class="p_price"><%=df.format(price)%></div>
									
							<%
								}
							%>
							
							
							
						</div>
						
						
						
					</div>
				
				</div>
				
			<%
				}
			%>
				

			
			</div>
			
		</div>
		
		<div class="new">
		
			<h6 class="main_title">NEW ARRIVAL</h6>
			
			<div class="row">
			
				<div class="col-md-4 best_box">
				
					<img alt="" src="img/img1.webp">
				
				</div>
				
				<div class="col-md-4 best_box">
				
					<img alt="" src="img/img1.webp">
				
				</div>
				
				<div class="col-md-4 best_box">
				
					<img alt="" src="img/img1.webp">
				
				</div>
			
			</div>
		
		</div>
		
		<div class="review">
		
		
		</div>
		
		
		
	</div>
	
	<%@include file = "footer.jsp" %>


</body>
</html> 