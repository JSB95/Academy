<%@page import="Dto.Board"%>
<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
		int bno = Integer.parseInt(request.getParameter("bno"));
		Dao dao = new Dao();
		Board board = dao.get(bno);
		
		String loginid = (String)session.getAttribute("loginid");
		if (loginid != null && loginid.equals(board.getBwriter())){
	%>
			<a href="bupdate.jsp"> 수정 </a>
			<a href="bdeletecontroller.jsp?"> 삭제 </a>
	<%		
		}
	%>

	<a href="main.jsp"> 목록보기 </a>


	<div>
		제목 : <%=board.getBtitle() %>
	</div>
	
	<div>
		작성자 : <%=board.getBwriter() %>
	</div>
	
	<div>
		작성일 : <%=board.getBdate() %>
	</div>
	
	<div>
		내용 : <%=board.getBcontent() %>
	</div>

</body>
</html>