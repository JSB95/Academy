<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 제품 등록 페이지 </h3>
	
	<form id="productaddform">
	
		제품명 : <input type="text" id="pname" name="pname" placeholder="제품명"> <br>
		가격 : <input type="text" id="pprice" name="pprice" placeholder="가격"> <br>
		할인율 : <input type="text" id="pdiscount" name="pdiscount" placeholder="할인율"> <br>
		
		
		카테고리 : <button onclick="categorybtn()" type="button"> 카테고리 추가 </button>
			
		<div id="categoryinput">
				
		</div>
		
		<div id="categorybox">
			
		</div>
		
		대표이미지 <input type="file" id="pimg" name="pimg"> <br>
		
		<button type="button" onclick="productadd()">등록</button>
		<input type="reset" value="초기화">
	
	</form>
	
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/jspweb/js/productadd.js" type="text/javascript"></script>

</body>
</html>