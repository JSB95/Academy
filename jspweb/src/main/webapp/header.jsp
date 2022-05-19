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
	<!-- 어ㅏ썸폰트 -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">


</head>
<body>
	
	<!-- 헤더페이지 절대경로 -->
	
	<% String loginid = (String)session.getAttribute("login"); %>
	<div class="container">
	
		<div class="py-4">
		
			<div class="row">
			
				<div class="col-md-4">
					<a href="/jspweb/main.jsp" class="header_logo">EZEN SHOP</a>
				</div>
				
				<div class="col-md-4 offset-4 d-flex justify-content-end">
					
					<ul class="nav">
					
						<% if (loginid == null){ %>
							<li> <a href="/jspweb/member/login.jsp" class="header_topmenu">로그인</a> · </li>
							<li> <a href="/jspweb/member/signup.jsp" class="header_topmenu">회원가입</a> · </li>
						<% } %>
						<% if (loginid != null) { %>
							<li> <span class="header_topmenu"> <%=loginid %>님 &nbsp; </span> </li>
							<li> <a href = "/jspweb/logout" class="header_topmenu"> 로그아웃 </a> · </li>
							<li> <a href = "/jspweb/member/myshopping.jsp" class="header_topmenu"> 나의쇼핑 </a> · </li>
							<% if(loginid.equals("admin")) { %>
								<li> <a href = "/jspweb/admin/dashboard.jsp" class="header_topmenu"> 관리자 </a> · </li>
							<% } %>	
							<li> <a href="/jspweb/board/boardlist.jsp?key=&keyword=" class="header_topmenu">자유게시판</a>  </li>
							<li> <a href="/jspweb/teamchatting.jsp" class="header_topmenu">실시간 채팅</a></li>
						<% } %>
						<li> <a href="/jspweb/bluemarble.jsp" class="header_topmenu">bluemarble</a></li>
						
					</ul>
					
				</div>
				
			</div>
			
		</div>
		
		<div class="navbar navbar-expand-md navbar-light bg-white">
		
			<ul class="navbar-nav col-md-12 justify-content-between">
			
				<li class="nav-item"> <a href="#"> BIG SIZE </a> </li>
				<li class="nav-item"> <a href="#" style="color: #00D8FF;"> MUSCLE-FIT </a> </li>
				<li class="nav-item"> <a href="#" style="color: #0100FF;"> 1+1 이벤트 </a> </li>
				<li class="nav-item dropdown"> <a href="#"> 아우터 </a> 
					<div class="dropdown-menu">
						<a class="dropdown-item" href="#"> 드랍다운 메뉴 </a>
						<a class="dropdown-item" href="#"> 드랍다운 메뉴 </a>
						<a class="dropdown-item" href="#"> 드랍다운 메뉴 </a>
						<a class="dropdown-item" href="#"> 드랍다운 메뉴 </a>
					</div>
				</li>
				
				<li class="nav-item"> <a href="#"> 상의  </a> </li>
				<li class="nav-item"> <a href="#"> 바지  </a> </li>
				<li class="nav-item"> <a href="#"> 슈즈  </a> </li>
				<li class="nav-item"> <a href="#"> 악세사리  </a> </li>
				<li class="nav-item"> <a href="#"> BEST  </a> </li>
				<li class="nav-item"> <a href="#"> 트레이닝  </a> </li>
				<li class="nav-item"> <a href="#" style="color: #FFBB00;"> 모델처럼입자  </a> </li>
				<li class="nav-item"> <a href="#" style="color: #FF0000;"> 50% 할인  </a> </li>
				
				<li class="nav-item"> <input type="text" class="header_input" size="13">&nbsp;<button><i class="fas fa-search"> </i></button> </li>
				<li class="nav-item"> <a href="/jspweb/product/productcart.jsp"> <i class="fa-solid fa-cart-shopping"></i></a> </li>
			
			</ul>
		
		</div>
	
	
	
	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	
		
		
	</div>
	
	
	
	
	
	
	
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- 사용자정의 js -->
	<script src="/jspweb/js/main.js" type="text/javascript"></script>
	
	<!-- jQuery 최신 CDN -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="https://kit.fontawesome.com/d77abffe02.js" crossorigin="anonymous"></script>
    

</body>
</html>