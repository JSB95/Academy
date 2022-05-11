<%@page import="dto.Reply"%>
<%@page import="java.sql.Timestamp"%>
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
	
		<h4 class="boardlist_title"> 자유게시판 </h4>
		
		<%
		
			request.setCharacterEncoding("UTF-8");
			
			String key = request.getParameter("key");
			
			String keyword = request.getParameter("keyword");
			
			if(key != null && keyword != null){
				
				session.setAttribute("key", key);
				
				session.setAttribute("keyword", keyword);
				
			} else {
				
				key = (String)session.getAttribute("key");
				
				keyword = (String)session.getAttribute("keyword");
				
			}
			
		
			int currentpage = 1;
			
			String pagenum = request.getParameter("pagenum");
			
			if (pagenum == null) {
				
				currentpage = 1;
				
			} else {
				
				currentpage = Integer.parseInt(pagenum);
				
			}
			
			int listsize = 5;
			
			int startrow = (currentpage-1) * 5;
			
			int totalrow = BoardDao.getboardDao().gettotalrow(key, keyword);
			
			int lastpage;
			
			if (totalrow % listsize == 0){
				
				lastpage = totalrow / listsize;
				
			} else {
				
				lastpage = totalrow / listsize + 1;
				
			}
			
			int btnsize = 5;
			
			int startbtn = ((currentpage - 1) / btnsize) * btnsize + 1;
			
			int endbtn = startbtn + btnsize - 1;
			
			if (endbtn > lastpage){
				endbtn = lastpage;
			}
			

			
			ArrayList<Board> boardlist = BoardDao.getboardDao().getboardlist(startrow, listsize, key, keyword);
			
		%>
		

		
		<div class="row boardlist_topbtn">
		
			<div class="col-md-1 offset-10">
			
				<a href="/jspweb/board/boardlist.jsp?key=&keyword="><button class="form-control">전체글</button></a>
			
			</div>
			
			<div class="col-md-1">
			
				<button class="form-control">인기글</button>
			
			</div>
		
		</div>
		
		<table class="table table-hover text-center">
			<tr>
				<th width="10%">번호</th> 
				<th width="50%">제목</th> 
				<th width="15%">작성자</th>
				<th width="15%">조회수</th> 
				<th width="10%">작성일</th>
			</tr>
			
			<!-- for문 -->
			
			<%
				

				Date date = new Date();
				
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				
				String date1 = simpleDateFormat.format(date);
				
				for (Board board : boardlist) {
					String date2 = simpleDateFormat.format(simpleDateFormat.parse(board.getBdate()));
					String date3 = "";
					int count = BoardDao.getboardDao().getreplylist(board.getBno());
					if (date1.equals(date2)){
						date3 = board.getBdate().split(" ")[1];
					} else {
						date3 = board.getBdate().split(" ")[0];
					}
			%>
				<!-- 행 전체 링크 -->
				<tr>
					<td> <%=board.getBno() %> </td>
					<td style="text-align: left;"> <a href="boardview.jsp?bno=<%=board.getBno()%>"><%=board.getBtitle()%>(<%=count%>)</a> </td>
					<td> <%=board.getMid() %> </td>
					<td> <%=board.getBview() %> </td>
					<td> <%out.print(date3); %> </td>
			<%
				}
			%>		
			
				</tr>
		</table>
		
		<div class="col-md-2 offset-10">
		
		<% 
			String mid = (String)session.getAttribute("login");
			if (mid != null) {
		%>
			<a href="boardwrite.jsp"><button class="form-control">글쓰기</button></a>
		<% } else { %>
		
			<span>로그인 후 글쓰기가 가능합니다.</span>
			
		<% } %>	
			
		</div>
		
		<!-- pageination -->
		
		<!-- calculate -->
		
		
		
		<div class="col-md-4 offset-4 d-flex justify-content-center">
		
			<ul class="pagination">
				
				<% if (currentpage == 1) { %>
				
					<li class="page-item"> <a class="page-link pagenum" href="boardlist.jsp">이전</a> </li>
				
				<% } else { %>
				
					<li class="page-item"> <a class="page-link pagenum" href="boardlist.jsp?pagenum=<%=currentpage-1%>">이전</a> </li>
					
				<% } %>
				
				<% for (int i = startbtn; i <= endbtn; i++) { %>
				
					<li class="page-item"> <a class="page-link pagenum" href="boardlist.jsp?pagenum=<%=i%>"> <%=i%> </a> </li>
				
				<% } %>
				
				<% if (currentpage == lastpage) { %>
				
					<!-- <li class="page-item"> <a class="page-link pagenum" href="boardlist.jsp?pagenum=<%=currentpage%>">다음</a> </li> -->
				
				<% } else { %>
				
					<li class="page-item"> <a class="page-link pagenum" href="boardlist.jsp?pagenum=<%=currentpage+1%>">다음</a> </li>
				
				<% } %>
			
			</ul>
		
		</div>
		
		<br><br><br>
		
		

		
		<form action="boardlist.jsp?pagenum=<%=currentpage %>" class="col-md-4 offset-4 d-flex justify-content-center">
		
			<div class="col-md-3">
			
				<select class="form-select" name="key">
				
					<option value="btitle"> 제목 </option>
					<option value="bcontent"> 내용 </option>
					<option value="bwriter"> 작성자 </option>
				
				</select>
			
			</div>
			
			<div class="col-md-7" style="margin-left: 20px;">
			
				<input type="text" class="form-control" name="keyword">
			
			</div>
			
			<div class="col-md-2" style="margin-left: 20px;">
			
				<input type="submit" class="form-control" value="검색">
			
			</div>
		
		</form>
		
		
	</div>
	
	<%@include file="../footer.jsp" %>

</body>
</html>