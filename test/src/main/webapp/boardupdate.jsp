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
	
	<input type="text" id="bno" value="<%out.print(bno);%>">

	<%@include file="header.jsp" %>
	
	<br><br><br><br>
	
	<div class="container">
	
		<h3>게시글 수정</h3>
		
			<div class="row">
			
				<div class="col-md-4">
				
					<input class="form-control" type="text" placeholder="제목입력" id="board_title" name="board_title" value=" <%=boardDto.getBtitle() %> "><br>
					<textarea class="form-control" placeholder="내용을 입력해주세요." rows="20" cols="10" style="resize: none;" id="board_content"> <%=boardDto.getBcontent() %></textarea>
				</div>
				
			
			
				<div class="col-md-3 offset-1">
				
					<input class="form-control" id="board_write" type="text" placeholder="작성자" value="<%=boardDto.getBwrite()%>">
				
					<br><br><br>
				
					<input class="form-check-input" type="checkbox" value="" id="secret">
					
  					<label class="form-check-label" for="secret">
    					비밀글 설정
  					</label>
  					<br>
  					<span id="secret_pw">
  						
  					</span>
  					
  					<br><br><br><br>
  					<div class="mb-3">
						<label for="formFile" class="form-label">첨부파일 등록</label>
						<input class="form-control" type="file" id="formFile" onchange="setThumbnail(event);"/>
					</div>
					  
				</div>
				
				<div class="col-md-3 offset-1">
				
					<div id="image_container">
						<img id="image_container" class="image_container">
					</div>
					
					<br> <br> <br><br> <br> <br><br> <br> <br><br> <br> <br><br> <br> <br><br> <br> <br>
					
					<button type="button" class="btn btn-primary" id="update">수정</button>
					
					<a href="boardlist.jsp"><button type="button" class="btn btn-secondary">취소</button></a>
				</div>
				
				
				
				
		
			</div>
		
		
		
		
	
	</div>
	

	
	<%@include file="footer.jsp" %>
	
	<script src="js/boardupdate.js" type="text/javascript"></script>
	

</body>
</html>