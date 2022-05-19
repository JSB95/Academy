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
	
	<br><br><br><br>
	
	<div class="container">
	
		<h3>게시글 등록</h3>
		
			<div class="row">
			
				<div class="col-md-4">
				
					<input class="form-control" type="text" placeholder="제목입력" id="board_title" name="board_title"> <br>
					<textarea class="form-control" placeholder="내용을 입력해주세요." rows="20" cols="10" style="resize: none;"></textarea>
				</div>
				
			
			
				<div class="col-md-3 offset-1">
				
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
					
					<button type="button" class="btn btn-primary" onclick="write()">등록</button>
					
					<a href="boardlist.jsp"><button type="button" class="btn btn-secondary">취소</button></a>
				</div>
				
				
				
				
		
			</div>
		
		
		
		
	
	</div>
	

	
	<%@include file="footer.jsp" %>
	
	
	

</body>
</html>