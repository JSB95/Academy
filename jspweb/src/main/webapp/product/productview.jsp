<%@page import="dao.MemberDao"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.TreeSet"%>
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
	<!--사용자정의 css 호출-->
	<link rel="stylesheet" href="/jspweb/css/productview.css">
</head>
<body>

	<%@include file = "../header.jsp" %>
	
	<% 
		int pno = Integer.parseInt(request.getParameter("pno"));
		Product p = ProductDao.getProductDao().getproduct(pno);
		DecimalFormat df = new DecimalFormat("#,###원");
		ArrayList<Stock> stocks = ProductDao.getProductDao().getStock(pno);
		Set<String> sizelist = new TreeSet<>();
		for (Stock s : stocks) { sizelist.add(s.getSsize()); }
		Set<String> colorlist  = new TreeSet<>();
		for( Stock s : stocks ){ colorlist.add(s.getScolor() ); }
		Float point = (p.getPprice() - (p.getPprice() * p.getPdiscount()));
		
	%>
	
	<div class="container viewbox">
	
		<div class="row">
		
			<div class="col-md-6">
			
				<img alt="" src="../admin/productimg/<%=p.getPimg()%>">
				
			</div>
			
			<div class="col-md-6"> 
			
				<div class="infobox">
				
					<h5 id="pname" class="view_title"><%=p.getPname()%></h5>
					
					<div class="price_box">
					
						<% if (p.getPdiscount() == 0) { %>
						
							<span class="price_dis"><%=df.format(p.getPprice()) %></span>
							
						<% } else { %>
						
							<span class="price_rat"><%= (int)((1- p.getPdiscount()) * 100) %>%</span>
							<span class="price_dis"><%= df.format((int)(p.getPprice() * p.getPdiscount())) %></span>
							<span class="price"><%=df.format(p.getPprice()) %></span>
							
						<% } %>
						
					</div>
					
					<div class="size_box">
					
						<span> 
							<% for (String t : sizelist) { %>
								<%=t + "  " %>
							<% } %>
						</span>
						
					</div>
					
					<input type="hidden" value="<%=pno%>" id="pno">
					<% if (p.getPdiscount() == 0) { %>
					
						<input type="hidden" value="<%=p.getPprice()%>" id="pprice">
					
					<% } else {%> 
					
						<input type="hidden" value="<%=p.getPprice() * p.getPdiscount()%>" id="pprice">
					
					<% } %>
					
					<input type="hidden" value="<%=pno%>" id="<%=pno%>">
					
					<table class="table info_t my-3">
					
						<tr>
						
							<td width="20%"> DELEVERY </td> 
							<td> 2,500원 (70,000원 이상 구매시 무료 ) </td>
							
						</tr>
						
						<tr>
						
							<td> SAVE </td> 
							<td> <%=df.format(point) %></td>
							
						</tr>
						
						<tr>
						
							<td> COLOR </td>
							<td>  
								<select id="color_select" class="form-select info_t">
								
									<option>-[필수]옵션 선택-</option>
									
										<% for(String c : colorlist) { %>
											<option value="<%=c%>"> <%=c %> </option>
										<% } %>
																	
									</select> 
							</td>
							
						</tr>
						
						<tr>
							<td> SIZE </td> 
							
							<td>  
								<select id="size_select" class="form-select info-t">
									<option value="">-[필수]옵션 선택-</option>
								</select> 
							</td>
							
						</tr>
						
					</table>
					
					<table id="select_table" class="table my-3">
					
						
						
						
					
					</table>
					
					<div class="row my-4">
					
						<div class="col-md-6"> 총 상품금액  </div>
						<div id = "total_price" class="col-md-6 total_price" > </div> 
						
					</div>
					
					<div id="btnbox" class="btnbox">
						<%
							String mid = (String)session.getAttribute("login");
							int mno = MemberDao.getmemberDao().getmno(mid);
						%>
					
						<button id="btn1">바로 구매하기</button>
						<button id="btn2" onclick="savecart(<%=mno%>)">장바구니 담기</button>
						<%
							if (mid != null && ProductDao.getProductDao().getplike(pno, mno)){
						%>
								<button id="btn3" onclick="saveplike(<%=MemberDao.getmemberDao().getmno(mid)%>)">♥</button>
								
						<%	} else {%> 
								
								<button id="btn3" onclick="saveplike(<%=MemberDao.getmemberDao().getmno(mid)%>)">♡</button>
						
						<% } %>
					
						
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script src="/jspweb/js/productview.js" type="text/javascript"></script>
	
	<%@include file = "../footer.jsp" %>

</body>
</html>
