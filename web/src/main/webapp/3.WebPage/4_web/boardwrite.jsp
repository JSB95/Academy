<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp" %>
	
	<br><br><br><br><br><br><br><br><br><br>
	
	<div class="container">
		<h3 class="text-center"> 문의 글쓰기 </h3>
		
		<div class="titleline"></div> <br><br>
		
		<form action="#" method="get">
			<div class="row">
				<div class="col-md-3">
					작성자 <input type="text" class="form-control" placeholder="작성자" maxlength="10">
				</div>
				
				<div class="col-md-3">
					비밀번호 <input type="password" class="form-control" placeholder="비밀번호" maxlength="5">
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-8">
					제목 <input type="text" class="form-control" placeholder="문의 제목 작성" maxlength="50">
				</div>
			</div>
			
			내용 <textarea rows="20" cols="" class="form-control" placeholder="문의 내용 작성"></textarea>
			
			<div class="row">
				<div class="col-md-3">
					*첨부파일 <input type="file" class="form-control">
				</div>
			</div>
			
			<div>
				<div class="col-md-4 offset-4 row">
					<div class="col-md-4">
						<input type="submit" value="등록" class="form-control">
					</div>
					
					<div class="col-md-4">
						<input type="reset" value="다시쓰기" class="form-control">
					</div>
					
					<div class="col-md-4">
						<a href="boardlist.jsp"> <button class="form-control"> 목록 </button> </a>
					</div>
				</div>
			</div>
		</form>
	</div>
	
	<br><br><br><br><br><br>
	<%@include file="footer.jsp" %>

</body>
</html>