<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		*{	
			margin: 0px; 
			padding: 0px;
		}
		a{
			text-decoration: none;
			color: black;
		}
		a:hover{
			color: gray;
		}
		
		#header{
			width: 1150px;
			height: 100px;
			margin: 0 auto;
		}
	
		#logo{
			float: left;
			margin: 20px 0 0 20px;
		}
		#menus{
			float: right;
		}
		#top_menu{
			text-align: right;
			margin-top: 20px;
		}
		#main_menu{
			margin-top: 20px; 
			font-family: "궁서";
			font-size: 20px
		}
		#main_menu li{
			display: inline;
			margin-left: 80px;
		}
		
	
	</style>

</head>
<body>

	<div id = "header"> 
	
		<div id = "logo"> <a href="index.jsp"> <img alt="" src="img/logo.PNG"> </a> </div>
		<div id = "menus">
		
			<div id= "top_menu">
				<a href="login.jsp"> 로그인 </a> |
				<a href="signup.jsp"> 회원가입 </a> | 
				<a href="board.jsp"> 공지사항 </a>
			</div>
			<ul id = "main_menu"> 
				<li> <a href="#"> 사진이론 </a> </li>
				<li> <a href="#"> 사진구도 </a> </li>
				<li> <a href="#"> 사진작가 </a> </li>
				<li> <a href="#"> 갤러리1 </a> </li>
				<li> <a href="#"> 갤러리2 </a> </li>
			</ul>
		
		</div>
	
	 </div>

</body>
</html>