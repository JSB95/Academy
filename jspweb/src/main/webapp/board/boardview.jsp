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
	
	<h3> 게시판 상세 </h3>
	
	<%
		int bno = Integer.parseInt(request.getParameter("bno"));
		String mid = (String)session.getAttribute("login");
		
		
		if (session.getAttribute(mid+bno) == null){
			BoardDao.getboardDao().increview(bno);	
			session.setAttribute(mid+bno, true);
			session.setMaxInactiveInterval(60*60*24);
		}
		
		Board board = BoardDao.getboardDao().getboard(bno);
		
		
		
		if (board.getMno() == MemberDao.getmemberDao().getmno(mid)){
	%>
		
		<a href="delete?bno=<%=board.getBno()%>"><button>삭제</button></a>
		<a href="boardupdate.jsp?bno=<%=board.getBno()%>"><button>수정</button></a>
	
	<%
		}
	%>
		<a href="boardlist.jsp"><button>목록</button></a>
	<table>
		<tr>
			<td> 번호 </td> <td> <%=board.getBno() %> </td> <td> 작성자 </td> <td> <%=board.getMid() %> </td> <td> 작성일 </td> <td> <%=board.getBdate() %> </td> <td> 조회수 </td> <td> <%=board.getBview() %> </td>
		</tr>
		
		<tr>
			<td> 제목 </td> <td> <%=board.getBtitle() %> </td>
		</tr>
		
		<tr>
			<td> 내용 </td> <td> <%=board.getBcontent() %> </td>
		</tr>
		
		<%
			if (board.getBfile()==null) {
		%>
			<tr> <td> 첨부파일 </td> <td> - </td> </tr>
		<%
			} else {
		%>
			<tr>
				<td> 첨부파일 </td> <td> <a href="filedown?bfile=<%=board.getBfile()%>"><%=board.getBfile()%></a> </td>
			</tr>
		<%
			}
		%>
	</table>


	<%@include file="../footer.jsp" %>

</body>
</html>