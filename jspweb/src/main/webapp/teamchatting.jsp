<%@page import="dao.ChattingDao"%>
<%@page import="dto.Chatting"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "header.jsp" %>
	<div class="container my-5">
		<h3> 비회원제 실시간 채팅 페이지[ 소켓X 게시판형식O] </h3>
		<div class="col-md-4 offset-4">
			<div id="contents" style="border: 2px dotted red; height: 500px; overflow-y:scroll">

			
			</div>
			
			<div class="row g-0"> <!-- g-0 : div div 사이간 여백 제거  -->
				<div class="col-md-3">
					<input type="text" class="form-control" placeholder="닉네임" size="10" id="cname">
				</div>
				<div class="col-md-7">
					<input type="text" class="form-control" placeholder="내용" size="20" id="ccontent">
				</div>
				<div class="col-md-2">
					<button type="submit" class="form-control" onclick="cwrite()">입력</button>
				</div>
			</div>
		</div>
	</div>
	
	
	<%@include file = "footer.jsp" %>
	
	<script type="text/javascript" src="/jspweb/js/chatting.js"></script>





</body>
</html>