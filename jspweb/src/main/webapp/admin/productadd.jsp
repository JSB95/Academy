<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3 class="admin_title"> 제품 등록</h3>
	
	
	<div class="row">
	
		<form id="productaddform" class="col-md-8">
		
			<div class="row ">
			
				<div class="col-md-2 ">
					<span> 제품명 </span>
				</div>
				
				<div class="col-md-5">
					<input class="form-control" type="text" id="pname" name="pname" placeholder="제품명"> 
				</div>
				
			</div>
			
			<div class="row">
			
				<div class="col-md-2 " >
					<span> 가격 </span>
				</div>
				
				<div class="col-md-2">
					<input class="form-control" type="text" id="pprice" name="pprice" placeholder="가격"> 
				</div>
				
				<div class="col-md-2 ">
					<span> 할인율 </span>
				</div>
				
				<div class="col-md-2">
					<input class="form-control" type="text" id="pdiscount" name="pdiscount" placeholder="할인율">
				</div>
				
			</div>
			
			<div class="row">
			
				<div class="col-md-2 ">
					<span> 카테고리 </span>
				</div>
				
				<div class="col-md-2">
					<button class="form-control" onclick="categorybtn()" type="button" >추가</button> 
				</div>
				
				<div class="col-md-5" id="categoryinput">
				
				</div>
				
			</div>
			
			<div class="row">
			
				<div id="categorybox">
				
				</div> 
				 
			</div>
			
			<div class="row">
			
				<div class="col-md-2">
					<span> 첨부파일 </span>
				</div>
				
				<div class="col-md-5">
					<input class="form-control"  type="file" id="pimg" name="pimg">
				</div>
				
			</div>
			
			<div class="row">
			
				<div class="col-md-5">
					<button class="form-control" type="button" onclick="productadd()">제품 등록</button> <!-- js에서 form 비동기 통신  -->
				</div>
				
				<div class="col-md-5">
					<input class="form-control" type="reset" value="초기화">
				</div>
				
			</div>
			
		</form>
		
		<div class="col-md-4">
		
			<h5> 대표이미지 미리보기 </h5>
			<img id="preview" width="100%">
			
		</div>
		
	</div>
	
	
	
	
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/jspweb/js/productadd.js" type="text/javascript"></script>

</body>
</html>