<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		#footer{
			clear: both;
			background-color: #05354e;
			color: white;
			height: 250px;
			
		}
		#footer .items{
			display: inline-block;
			text-align: center;
			
			float: left;
			margin: 50px 80px 20px 20px;
		}
		#footer .items ul{
			margin-top: 10px;
		}
		#footer .items li{
			margin-top: 5px;
		}
		#footer .items #tel_head{
			font-size: 15px;
		}
		#footer .items #tel{
			font-size: 30px;
			text-shadow: -1px 0px red, 0px 1px red, 1px 0px red, 0px -1px red;
		}
		#footer .items #sns{
			margin-top: 30px;
		}
	</style>

</head>
<body>

	<div id = "footer">
	
		<div id = "wrap">
		
			<div class = "items">
				<ul>
					<li id = "tel_head"> 고객 센터 </li>
					<li id = "tel"> Tel : 1588 - 1588 </li>
				</ul>
			</div>
			
			<div class = "items">
				<ul>
					<li> 회사소개 | 개인정보처리방침 | 이용약관 | 제휴안내 </li>
					<li> 주소 : 경기도 용인시 수지구 정평로 123 </li>
					<li> email : photo@korea.com</li>
					<li> COPYRIGHT ⓒ 2021 The 스튜디오. ALL RIGHTS RESERVED</li>
				</ul>
			</div>
			
			<div class = "items">
				<div id = "sns">
					<img alt="" src="img/facebook.png">
					<img alt="" src="img/blog.png">
					<img alt="" src="img/instagram.png">
				</div>
			
			</div>
		
		</div>
	
	</div>

</body>
</html>