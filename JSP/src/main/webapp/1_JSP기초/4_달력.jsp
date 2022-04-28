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
		
		calendar.set(year, month - 1, 1); // month - 1 : 0 -> 1��, 11 -> 12��
		
		int sweek = calendar.get(Calendar.DAY_OF_WEEK);
		int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		

			
	%>
	
	<!-- html -->
	
	<% if(chk == true) { %>
	<div>ǥ���� �� ���� �޷��Դϴ�.</div>
	<% } %>
	
	<form action="4_�޷�.jsp" method="get">
		<input type="text" name="year" placeholder="����">
		<input type="text" name="month" placeholder="��">
		<input type="submit" value="�˻�">
	</form>
	
	<p> �Է��� ���� : <%=year %></p>
	<p> �Է��� �� : <%=month %></p>
	
	
	<form action="4_�޷�.jsp" method="get">
		<input type="text" name="year" value="<%=year%>">
		<input type="text" name="month" value="<%=month - 1%>" >
		<input type="submit" value="����" name="past">
	</form>
	
	<form action="4_�޷�.jsp" method="get">
		<input type="text" name="year" value="<%=year%>">
		<input type="text" name="month" value="<%=month + 1%>">
		<input type="submit" value="����" name="next">
	</form>
	
	
	
	<table>
		<tr>
			<th> �Ͽ��� </th>
			<th> ������ </th>
			<th> ȭ���� </th>
			<th> ������ </th>
			<th> ����� </th>
			<th> �ݿ��� </th>
			<th> ����� </th>
		</tr>
		
		<tr>
			<!-- ���� ���ϱ��� �������� ä�� -->
			<% for(int i = 1; i < sweek; i++) { %>
				<td> </td>
			<% } %>
			
			<!-- 1�Ϻ��� �������ϱ��� 1������ �ϸ鼭 ��� -->
			<% for(int i = 1; i <= eday; i++) { %>
				<td> <%=i %> </td>
				
			<!-- 7��� ���� �ٹٲ� [����ϸ���] -->
				<% if(sweek % 7 == 0) { %>
					</tr> <tr>
				<% } %>
				
				<% sweek++; %>
			<% } %>
		</tr>
	</table>

</body>
</html>