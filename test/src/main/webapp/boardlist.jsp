<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.BoardDto"%>
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

	<%@include file="header.jsp" %>
	
	<% ArrayList<BoardDto> boardlist = BoardDao.getBoardDao().getboardlist(); %>
	
	<br><br><br><br>
	
	<div class="container">
	
		<h3> 게시판 </h3>
		
		
			
			<table class="table">
			
				<thead>
				    <tr>
				      <th scope="col">작성자</th>
				      <th scope="col">제목</th>
				      <th scope="col">내용</th>
				      <th scope="col">작성일</th>
				    </tr>
				</thead>
				
				<% 
					Date date = new Date();
				
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					
					String date1 = dateFormat.format(date);
					
					for (BoardDto boardDto : boardlist){
						String date2 = dateFormat.format(dateFormat.parse(boardDto.getBdate()));
						String date3 = "";
						if (date1.equals(date2)){
							date3 = boardDto.getBdate().split(" ")[1];
						} else {
							date3 = boardDto.getBdate().split(" ")[0];
						}
					
				
				
				%>
				
				<tr>
					<th scope="col"><%=boardDto.getBwrite() %></th>
				    <th scope="col"> <a href="boardview.jsp?bno=<%=boardDto.getBno()%>"><%=boardDto.getBtitle()%></a></th>
					<th scope="col"><%=boardDto.getBcontent() %></th>
				    <th scope="col"><% out.print(date3); %></th>
				
				</tr>
				
				<% } %>
			
			</table>
			
			<button type="button" class="btn btn-dark" onclick="boardwrite()">글쓰기</button>
		
		
	</div>
	
	<%@include file="footer.jsp" %>

</body>
</html>