<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	 <!-- include summernote css/js -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
  
  	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
  
	

</head>
<body>
	
	<%@include file="../header.jsp" %>

	<div class="container">
		<a href="boardlist.jsp"><button>글목록</button></a>
		<h3>글쓰기</h3>
		<form action="../board/write" method="post" enctype="multipart/form-data">
			제목 : <input type="text" name="btitle"><br>
			<textarea name="bcontent" id="summernote"></textarea><br>
			첨부파일 : <input type="file" name="bfile"><br>
			<input type="submit" value="등록"><input type="reset" value="취소">
		</form>
	</div>
	
	<%@include file="../footer.jsp" %>
	
	
	<script src="/jspweb/js/board.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</body>
</html>