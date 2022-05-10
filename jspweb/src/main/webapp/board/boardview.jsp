<%@page import="dto.Reply"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.MemberDao"%>
<%@page import="dao.BoardDao"%>
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
	

		
		<%
			int bno = Integer.parseInt(request.getParameter("bno"));
			String mid = (String)session.getAttribute("login");
			
			
			if (session.getAttribute(mid+bno) == null){
				BoardDao.getboardDao().increview(bno);	
				session.setAttribute(mid+bno, true);
				session.setMaxInactiveInterval(60*60*24);
			}
			
			Board board = BoardDao.getboardDao().getboard(bno);
		%>	
			
			
	
		
		<h2 class="boardview_title"> <%=board.getBtitle() %> </h2>
			
		<table class="table">
			<tr>
				<td width="25%"> 번호 : </td> <td> <%=board.getBno() %> </td> 
				<td width="25%"> 작성자 : </td> <td> <%=board.getMid() %> </td> 
				<td width="25%"> 작성일 : </td> <td> <%=board.getBdate() %> </td> 
				<td width="25%"> 조회수 : </td> <td> <%=board.getBview() %> </td>
			</tr>
			
			
			<tr>
				<td colspan="4">
					<div class="boardview_content">
						<%=board.getBcontent() %>
					</div> 
				</td>
			</tr>
			
			<%
				if (board.getBfile()==null) {
			%>
				<tr> <td colspan="4"> 첨부파일 :  - </td> </tr>
			<%
				} else {
			%>
				<tr>
					<td colspan="4"> 첨부파일 : <a href="filedown?bfile=<%=board.getBfile()%>"><%=board.getBfile()%></a> </td>
				</tr>
			<%
				}
			%>
		</table>
		
		
		<div class="row">
		
		<%
			if (board.getMno() == MemberDao.getmemberDao().getmno(mid)){
		%>
			<div class="col-md-2">
				<a href="delete?bno=<%=board.getBno()%>"><button>삭제</button></a>
			</div>
			
			<div class="col-md=2">
				<a href="boardupdate.jsp?bno=<%=board.getBno()%>"><button>수정</button></a>
			</div>
		<%
			}
		 %>
		 	<div class="col-md-2">
				<a href="boardlist.jsp"><button>목록</button></a>
			</div>
		</div>
			
			
			
			
			
		<h4 class="boardview_title">댓글</h4>
		
		<%
			if (mid != null){
		%>
		
		<div class="row">
		
			<div class="col-md-10">
				<textarea id="rcontent" class="form-control" rows=3></textarea>
			</div>
			
			<div class="col-md-2">
				<button class="form-control py-4 my-1" onclick="replywrite(<%=bno%>)">등록</button>
			</div>
			
		</div>
		
		<% } else { %>
		
			<h5 class="text-center"> 로그인 후 댓글쓰기가 가능합니다. </h5>
		
		<% } %>
		
		
		
		
		
		<table id="replytable" class="table">
			<%
				ArrayList<Reply> replylist = BoardDao.getboardDao().replylist(bno);
				for (Reply reply : replylist) {
			%>
			<tr>
				<td class="replywriter" width="10%"><%=reply.getMid() %> <br>  </td>
				<td class="replywriter" width="70%" colspan="2"> <%=reply.getRcontent() %> <button class="btn replybtn" onclick="rereplyview(<%=reply.getRno()%>, <%=reply.getBno()%>)">댓글</button></td>
				<td class="replywriter"  width="10%"> <%=reply.getRdate() %> 
				<% if (mid != null && mid.equals(reply.getMid())) { %>
				
					 <button>수정</button> 
					 <button>삭제</button> 
				
				<% } %>
				 
				</td>
			</tr>
			
			
			
			
			
			<tr>	<!-- 대댓글 -->
				<td></td>
				<td colspan="2" id=<%=reply.getRno() %>></td>
			</tr>
			
			<% ArrayList<Reply> rereplylist = BoardDao.getboardDao().rereplylist(bno, reply.getRno());
				for (Reply rereply : rereplylist){
			%>
				<tr>
					<td></td>
					<td width="10%"> <%=rereply.getMid() %>  </td>
					<td width="70%"> <%=rereply.getRcontent() %>
					
						<span style="float: right;">  <%=rereply.getRdate() %> 
						
							<% if (mid != null && mid.equals(rereply.getMid())) { %>
								<button>수정</button>
								<button>삭제</button>
							<% } %>
							
						</span> 
					</td>
				</tr>
			<%
					}
				}
			%>
		</table>
	</div>
	



	<%@include file="../footer.jsp" %>
	<script src="/jspweb/js/board.js" type="text/javascript"></script>

</body>
</html>