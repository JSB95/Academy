<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="1.설치.jsp" %>
	<div class="container"> <!-- 박스권 -->
		<div class="navbar navbar-expand-md"> <!-- 네비게이션 바 -->
		
			<a href = "#" class = "navbar-brand"> 로고 </a>
		
			<button  type="button"
				data-bs-toggle="collapse" data-bs-target="#navmenu" 
				aria-controls="navbarcontents" aria-expanded="false">
				 <span class="navbar-toggler-icon"></span>
			</button>
			
			<!-- 메뉴 사이즈 작아지는 경우 -->
			
			<div class = "collapse navbar-collapse" id = "navmenu">
		
			<ul class="navbar-nav"> <!-- 네비게이션 목록 -->
				<li class="navbar-item"> <a href="#" class="nav-link">메뉴1</a> </li> <!-- 네비게이션 목록 값 -->
				<li class="navbar-item"> <a href="#" class="nav-link">메뉴2</a> </li>
				<li class="navbar-item"> <a href="#" class="nav-link">메뉴3</a> </li>
				<li class="nav-item dropdown">
					<a href = "#" class = "nav-link dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup = "true" aria-expanded = "false" id = "navdrop"> 드랍다운 </a>
					
					<div class = "dropdown-menu" aria-labelledby="navdrop">
						<a class="dropdown-item" href = "#"> 드랍다운 메뉴 1</a>
						<a class="dropdown-item" href = "#"> 드랍다운 메뉴 2</a>
						<a class="dropdown-item" href = "#"> 드랍다운 메뉴 3</a>
					</div>
					
				</li>
			</ul>
			
			<form action="">
				<div class="row">
					<div class = "col-md-3">
						<input type="text" class = "form-control" placeholder="검색어">
					</div>
					<div class = "col-md-5">
						<button class = "form-control" type = "submit"> 검색 </button>
					</div>
					
				</div>
			
			</form>
			</div>
		</div>
	</div>
	
	
</body>
</html>