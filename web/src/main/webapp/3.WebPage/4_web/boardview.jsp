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
	
	<div class= "container">
		<h3> 문의 글</h3>
		<div class="my-3">
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> 목록 </button></a>
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> 수정 </button></a>
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> 삭제 </button></a>
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> 답변 </button></a>
		</div>
		
		<div>
			<input type="text" value ="환불문의" class="form-control" readonly>
		</div>
		
		<textarea rows="20" cols="" class="form-control" readonly style="resize: none;"> 환불 문의 </textarea>
	</div>
	
	<div class="row my-4">
		<h4> 첨부 사진 </h4>
		<div class="col-md-3">
			<img alt="" src="img/content1.webp" width="100%">
		</div>
		
		<div class="col-md-3">
			<img alt="" src="img/content1.webp" width="100%">
		</div>
		
		<div class="col-md-3">
			<img alt="" src="img/content1.webp" width="100%">
		</div>
		
		<div class="col-md-3">
			<img alt="" src="img/content1.webp" width="100%">
		</div>
		
	</div>
	
	<h4> 답변 </h4>
	<p> 답변일 : 2022-04-23 12:10 </p>
	<div>
		<textarea rows="" cols="" class="form-control inputbackcolor" readonly style="resize: none;"> 답변 내용</textarea>
	</div>
	
	<br><br><br><br><br><br><br><br><br><br>
	
	<%@include file="footer.jsp" %>
	

</body>
</html>