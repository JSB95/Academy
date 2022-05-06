<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="dao.BoardDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Board"%>
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
		<h3> 자유게시판 </h3>
		<a href="boardwrite.jsp">글쓰기</a>
		<table class="table">
			<tr>
				<th>번호</th> <th>제목</th> <th>작성자</th>
				<th>조회수</th> <th>작성일</th>
			</tr>
			
			<!-- for문 -->
			
			<%
				ArrayList<Board> boardlist = BoardDao.getboardDao().getboardlist();
				Date date = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

				String date1 = simpleDateFormat.format(date);

				
				for (Board board : boardlist) {
					String date2 = simpleDateFormat.format(simpleDateFormat.parse(board.getBdate()));

					String date3 = "";
					if (date1.equals(date2)){
						date3 = board.getBdate().split(" ")[1];
					} else {
						date3 = board.getBdate().split(" ")[0];
					}
			%>
				<tr>
					<td> <%=board.getBno() %> </td>
					<td> <%=board.getBtitle()%> </td>
					<td> <%=board.getMid() %> </td>
					<td> <%=board.getBview() %> </td>
					<td> <%out.print(date3); %> </td>
			<%
				}
			%>		
			
				</tr>
		</table>
	</div>
	<%@include file="../footer.jsp" %>

</body>
</html>