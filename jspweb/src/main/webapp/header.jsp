<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ezen 쇼핑몰</title>
	
	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- 사용자 정의 CSS -->
	<link href="/jspweb/css/main.css" rel = "stylesheet">
	

</head>
<body>
	
	<!-- 헤더페이지 절대경로 -->
	
	<% String loginid = (String)session.getAttribute("login"); %>
	<div class="container">
		<a href="/jspweb/main.jsp">EZEN SHOP</a>
		<a href="#"> BIG SIZE </a>
		<a href="#"> MUSCLE-FIT </a>
		<a href="#"> 1+1 이벤트 </a>
		<a href="#"> 아우터 </a>
		<a href="#"> 상의  </a>
		<a href="#"> 바지  </a>
		<a href="#"> 슈즈  </a>
		<a href="#"> 악세사리  </a>
		<a href="#"> BEST  </a>
		<a href="#"> 트레이닝  </a>
		<a href="#"> 모델처럼입자  </a>
		<a href="#"> 50% 할인  </a>
		<input type="text"><button>검색</button>
		<a href="#"> <img src="#"> 장바구니 이미지 </a>
	
		<% if (loginid == null){ %>
			<a href="/jspweb/member/login.jsp">로그인</a>
			<a href="/jspweb/member/signup.jsp">회원가입</a>
	
		<% } %>
	
		<% if (loginid != null) { %>
			<span> <%=loginid %> 님</span>
			<a href = "/jspweb/logout"> 로그아웃 </a>
			<a href = "/jspweb/member/myshopping.jsp"> 나의쇼핑 </a>
			
		<% } %>	
		
	</div>
	
	
	
	
	
	
	
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- 사용자정의 js -->
	<script src="/jspweb/js/main.js" type="text/javascript"></script>
	<!-- jQuery 최신 CDN -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>

</body>
</html>