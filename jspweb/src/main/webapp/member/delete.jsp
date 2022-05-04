<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file = "../header.jsp" %>
	
	<%
		String mid = (String)session.getAttribute("login");
	%>
	
	<div class="contatiner">
	
		<div class="row">
			
			<div class="col-md-3">
			
				<%@include file = "infosidebar.jsp" %>
			
			</div>
			
			<div class="col-md-9">
			
				<h3>회원탈퇴</h3>
				
				<form>
					<input type="password" name="mpassword" id="mpassword">
					
					
					<button id="btndelete" style="display: none;" onclick="mdelete('<%=mid %>')"> 탈퇴 승인</button>
					<span id="checkmsg">체크</span>
				</form>
				<button onclick="passwordchk('<%=mid %>')"> 확인 </button>
				
			</div>
			
		</div>
	
	</div>
	
	<script src="../js/info.js" type="text/javascript"></script>
	
	<%@include file = "../footer.jsp" %>

</body>
</html>