<%@page import="dao.BoardDao"%>
<%@page import="dto.BoardDto"%>
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
		
		BoardDto boardDto = BoardDao.getBoardDao().getboard(bno);
	
	%>

	<%@include file="header.jsp" %>
	
	<input type="text" id="bno" value="<%out.print(bno);%>">
	
	<br><br><br><br>
	
	<div class="container">
	
		제목 : <h3><%=boardDto.getBtitle() %></h3>
		
		작성자 : <h5><%=boardDto.getBwrite() %></h5>
	
		<div class="col-md-5 offset-3 text-center" style="float: none; margin:0 auto;">
		
			<div style="border: 1px solid black; width: 300px; height: 100px; text-align: center;">사진영역</div>
		
		</div>
		
		<div class="row">
		
			<div class="col-md-5 offset-1">
				<h5> 내용 </h5>
				<%=boardDto.getBcontent() %>
			</div>
			
			<div class="col-md 4 offset-1">
				<div style="border: 1px solid black; width: 300px; height: 100px; text-align: center;">지도영역</div>
			</div>
		
		</div>
		
		<div class="col-md-1 text-center" style="float: none; margin:0 auto;">
			<a href="boardlist.jsp"><input type="button" class="form-contorl" value="뒤로가기" style="text-align: center;"></a>
			
		</div>
		
		<div class="pwchk">
			비밀번호 입력 : <input type="password" id="pw">
			<button id="delete" class="form-control" style="width: 100px;">삭제하기</button>
			<a href="boardupdate.jsp?bno=<%=boardDto.getBno()%>"><button id="update" class="form-control" style="width: 100px;">수정하기</button></a>
		</div>
		
		
	
	</div>
	
	<%@include file="footer.jsp" %>
	
	<script src="js/boardview.js" type="text/javascript"></script>

</body>
</html>