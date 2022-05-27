<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href="/jspweb/css/chatting.css" rel="stylesheet">
	
</head>
<body>

	<% String mid = (String)request.getSession().getAttribute("login"); %>
	
	<input type="hidden" value="<%=mid %>" id="mid">

	<%@include file="../header.jsp" %>
	
	<div class="container">
	
		<div class="col-sm-6 offset-3 chattingbox">
		
			<div class="row">
		
				<div class="col-sm-4" id="enter_list">
				
					<H5 class="enter_title"> 접속자 목록 </H5>
					
					
					
					
				</div>
				
				<div class="col-sm-8">
				
					<div class="contentbox" id="contentbox">
					
						<div class="alarm">
							<span>강호동님이 입장하셨습니다.</span>
						</div>

						

					
					</div>
					
					<div class="row g-0">
					
						<div class="col-sm-10">
						
							<textarea id="incontent" rows="3" cols="" class="form-control" onkeyup="enterkey('<%=mid%>')"></textarea>
						
						</div>
						
						<div class="col-sm-2">
						
							<button class="form-control sendbtn" onclick="sendbtn('<%=mid%>')">전송</button>
						
						</div>
					
					</div>
					
				
				</div>
			
			</div>
		
		</div>
	
	</div>
	
	
	<%@include file="../footer.jsp" %>
	
	<script type="text/javascript" src="/jspweb/js/chatting1.js"></script>

</body>
</html>