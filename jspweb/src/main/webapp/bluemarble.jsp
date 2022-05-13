<%@page import="dao.CityDao"%>
<%@page import="dto.City"%>
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

	<%@include file = "header.jsp" %>
	
	<div class="row">
	
		<div class="container">
	
		<%
			ArrayList<City> list = CityDao.getCityDao().getcitylist();
		%>
		
			<table class="table">
			
			
				<tr>
				
				<% for (int i = 0; i < list.size(); i ++) { %>
				
					
				<% 	
					if (i % 5 == 0) {
				%>
					<tr><td> <%=list.get(i).toString() %> </td>
					
				<% 
						} else {
				%>
						<td> <%=list.get(i).toString() %> </td>
				<%
						}
					}
				
				%>
				
				<td>공백</td><td>공백</td><td>공백</td>
				
				</tr>
				
				
					
				
				
				
				
				<tr>
				
				
				
		
			
			</table>
		</div>
	</div>

</body>
</html>