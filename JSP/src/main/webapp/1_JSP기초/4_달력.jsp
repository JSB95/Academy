<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%
		Calendar calendar = Calendar.getInstance();
	
		int year = 2022; int month = 4;
		
		boolean chk = false;
	
		if (request.getParameter("year") != null && request.getParameter("month") != null){
			year = Integer.parseInt(request.getParameter("year"));
			month = Integer.parseInt(request.getParameter("month"));
			
			if (month < 1){
				month = 12;
				year--;
			}
			
			
			
			if (year < 1900 || month < 0 || month > 12){
				chk = true;
			}
		} else {
			
		}
		
		calendar.set(year, month - 1, 1); // month - 1 : 0 -> 1월, 11 -> 12월
		
		int sweek = calendar.get(Calendar.DAY_OF_WEEK);
		int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		

			
	%>
	
	<!-- html -->
	
	<% if(chk == true) { %>
	<div>표현할 수 없는 달력입니다.</div>
	<% } %>
	
	<form action="4_달력.jsp" method="get">
		<input type="text" name="year" placeholder="연도">
		<input type="text" name="month" placeholder="월">
		<input type="submit" value="검색">
	</form>
	
	<p> 입력한 연도 : <%=year %></p>
	<p> 입력한 월 : <%=month %></p>
	
	
	<form action="4_달력.jsp" method="get">
		<input type="text" name="year" value="<%=year%>">
		<input type="text" name="month" value="<%=month - 1%>" >
		<input type="submit" value="이전" name="past">
	</form>
	
	<form action="4_달력.jsp" method="get">
		<input type="text" name="year" value="<%=year%>">
		<input type="text" name="month" value="<%=month + 1%>">
		<input type="submit" value="다음" name="next">
	</form>
	
	
	
	<table>
		<tr>
			<th> 일요일 </th>
			<th> 월요일 </th>
			<th> 화요일 </th>
			<th> 수요일 </th>
			<th> 목요일 </th>
			<th> 금요일 </th>
			<th> 토요일 </th>
		</tr>
		
		<tr>
			<!-- 시작 요일까지 공백으로 채움 -->
			<% for(int i = 1; i < sweek; i++) { %>
				<td> </td>
			<% } %>
			
			<!-- 1일부터 마지막일까지 1씩증가 하면서 출력 -->
			<% for(int i = 1; i <= eday; i++) { %>
				<td> <%=i %> </td>
				
			<!-- 7배수 마다 줄바꿈 [토요일마다] -->
				<% if(sweek % 7 == 0) { %>
					</tr> <tr>
				<% } %>
				
				<% sweek++; %>
			<% } %>
		</tr>
	</table>

</body>
</html>