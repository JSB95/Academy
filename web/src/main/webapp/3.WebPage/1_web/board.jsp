<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		#board{
			width: 1150px;
			margin: 0 auto;
			margin-bottom: 10px;
		}
		#board h3{text-align: center; margin-bottom: 20px;}
		#search{
			text-align: center;
			margin-bottom: 10px;
			background-color: #f9f7f9
		}
		#text{
			width: 400px;
			height: 40px;
			font-size: 20px;
		}
		#button{
			width: 100px;
			height: 45px;
			font-size: 20px;
			color: white;
			background-color: #555555;
			margin-left: -5px; 
		}
		table{
			width:1150px;
			margin: 0 auto;
			border-top: solid 1px #cccccc;
			border-bottom: soild 1px #cccccc;
			font-size: 15px;
		}
		th{
			text-align: center;
			padding: 10px 50px;
		}
		td{
			text-align:center;
			padding: 10px; 50px;
			border-top: solid 1px #e7e7e7; 
		}
		#left{
			text-align: left;
		}

	
	</style>

</head>
<body>
	<%@include file="header.jsp"%><!-- 헤더 -->
	<%@include file="main_img.jsp"%><!-- 헤더이미지 -->

	<div id = board>

		<h3> 공지사항 </h3>
		
		<div id = "search">
			<input id="text" type = "text" value="검색어를 입력해주세요.">
			<input id="button" type = "button" value="검색"> 
		</div>
		
		<table>
			<tr>
				<td> 번호 </td>
				<td> 제목 </td>
				<td> 등록일 </td>
			</tr>
			<tr>
				<td> 3 </td>
				<td id = "left"> [공지사항] 개인정보 처리방침 변경안내 </td>
				<td> 2017.07.13 </td>
			</tr>
			<tr>
				<td> 2 </td>
				<td id = "left"> 공지사항 안내입니다. 이용해주셔서 감사합니다. </td>
				<td> 2017.06.15 </td>
			</tr>
			<tr>
				<td> 1 </td>
				<td id = "left"> 공지사항 안내입니다. 이용해주셔서 감사합니다. </td>
				<td> 2017.06.15 </td>
			</tr>
		
		</table>

	</div>
	<%@include file="footer.jsp" %><!-- 푸터 -->
</body>
</html>