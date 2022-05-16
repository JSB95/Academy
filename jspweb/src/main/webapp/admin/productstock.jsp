<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 제품 재고 </h3>
	카테고리목록	
	<select id="categorybox">
		
	</select>
	
	제품목록
	<select id="productbox">
	
	</select>
	
	
	
	
	<form id="stockaddform">
		색상 <input type="text" id="scolor">
		사이즈 <input type="text" id="ssize">
		수량 <input type="text" id="samount">
		<button type="button" onclick="stockadd()"> 재고 추가 </button>	
	</form>
	
	재고목록
	<table id="stocklistbox" class="table">
	
	
	</table>
	
	
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	
	<script src="/jspweb/js/productstock.js" type="text/javascript"></script>

</body>
</html>