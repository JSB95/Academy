<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
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
		Member member = MemberDao.getmemberDao().getMember(mid);
	%>
		
		<div class="container">
		
			<div class="row">
			
				<div class="col-md-3">
				
					<%@include file = "infosidebar.jsp" %>
				
				</div>
				
				<div class="col-md-9">
					<%
						if (request.getParameter("result") != null && request.getParameter("result").equals("1")){
					%>
					
					<div> 수정 완료 </div>
					<% } else if (request.getParameter("result") != null && request.getParameter("result").equals("2")){ %>
					
					<div> DB 오류</div>
					
					<% } else if (request.getParameter("result") != null && request.getParameter("result").equals("3")){ %>
					
					<div> 기존 비밀번호 오류</div>
					<% } %>
					<h3>회원수정</h3>
					
					<form action="../update" method="post">
						<input type="text" value="<%=member.getMno()%>" name="mno">
						아이디 : <%=member.getMid() %>
						비밀번호 : <button type="button" onclick="passwordchange()"> 비밀번호 변겅 </button> <br>
						
						<div id="passwordbox" style="display: none;">
							기존 비밀번호 : <input type="password" name="oldpassword"><br>
							새 비밀번호 : <input type="password" name="newpassword">
						</div>
						이름 : <input type="text" value="<%=member.getMname()%>" name="mname">
						연락처 : <input type="text" value="<%=member.getMphone()%>" name="mphone">						
						이메일 : 	<input type="text" value="<%=member.getMemail().split("@")[0]%>" name="memail">
								
						 @ <input type="text" value="<%=member.getMemail().split("@")[1]%>" name="memailaddress" id="memailaddress">
								<select id = "emailselect" style="margin-left: 10px;" name="emailselect">
									<option value=""> 직접입력 </option>
									<option value="naver.com"> naver.com </option>
									<option value="gmail.com"> gmail.com </option>
									<option value="kakao.com"> kakao.com </option>
								</select>
						배송주소 :
							<input type="text" id="maddress1" placeholder="우편번호" name="maddress1" value="<%=member.getMaddress().split("_")[0]%>">
							<input type="text" id="maddress1" placeholder="우편번호" name="maddress1" value="<%=member.getMaddress().split("_")[0]%>">
							<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
							<input type="text" id="maddress2" placeholder="도로명주소" name="maddress2" value="<%=member.getMaddress().split("_")[1]%>">
							<input type="text" id="maddress3" placeholder="지번주소" name="maddress3" value="<%=member.getMaddress().split("_")[2]%>">
							<span id="guide" style="color:#999;display:none"></span>
							<input type="text" id="maddress4" placeholder="상세주소" name="maddress4" value="<%=member.getMaddress().split("_")[3]%>">
						<input type="submit" value="변경적용">
						<a href="/jspweb/member/update.jsp"><button type="button">변경 취소</button></a>
					</form>
				
				</div>
			
			</div>
		
		</div>
		<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script src="../js/signup.js" type="text/javascript"></script>
		
		<%@include file = "../footer.jsp" %>

</body>
</html>