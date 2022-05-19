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
	
		<h3> 게시판 </h3>
		
		
			
			<table class="table">
			
				<thead>
				    <tr>
				      <th scope="col">작성자</th>
				      <th scope="col">제목</th>
				      <th scope="col">내용</th>
				      <th scope="col">작성일</th>
				    </tr>
				</thead>
				
				<tr>
					<th scope="col">장승빈</th>
				    <th scope="col"> <a href="boardview.jsp">테스트</a></th>
					<th scope="col">테스트</th>
				    <th scope="col">2022-05-18</th>
				
				</tr>
			
			</table>
			
			<button type="button" class="btn btn-dark" onclick="boardwrite()">글쓰기</button>
		
		
	</div>
	
	<%@include file="footer.jsp" %>

</body>
</html>