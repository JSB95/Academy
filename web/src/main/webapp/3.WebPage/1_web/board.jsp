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
	<%@include file="header.jsp"%><!-- ��� -->
	<%@include file="main_img.jsp"%><!-- ����̹��� -->

	<div id = board>

		<h3> �������� </h3>
		
		<div id = "search">
			<input id="text" type = "text" value="�˻�� �Է����ּ���.">
			<input id="button" type = "button" value="�˻�"> 
		</div>
		
		<table>
			<tr>
				<td> ��ȣ </td>
				<td> ���� </td>
				<td> ����� </td>
			</tr>
			<tr>
				<td> 3 </td>
				<td id = "left"> [��������] �������� ó����ħ ����ȳ� </td>
				<td> 2017.07.13 </td>
			</tr>
			<tr>
				<td> 2 </td>
				<td id = "left"> �������� �ȳ��Դϴ�. �̿����ּż� �����մϴ�. </td>
				<td> 2017.06.15 </td>
			</tr>
			<tr>
				<td> 1 </td>
				<td id = "left"> �������� �ȳ��Դϴ�. �̿����ּż� �����մϴ�. </td>
				<td> 2017.06.15 </td>
			</tr>
		
		</table>

	</div>
	<%@include file="footer.jsp" %><!-- Ǫ�� -->
</body>
</html>