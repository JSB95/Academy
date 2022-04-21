<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		.carousel-item{
			width: 100%;
			height: 100%;
		}
	</style>
</head>
<body>

	<%@include file="1.설치.jsp" %>
	
	<div class = "container">
	
		<div id = "cs" class = "carousel slide" data-bs-ride = "carousel" data-bs-interval = "3000">
		
			<div class = "carousel-indicators">
			
				<button type = "button" data-bs-target= "#cs" data-bs-slide-to = "0" class = "active"> </button>
				<button type = "button" data-bs-target= "#cs" data-bs-slide-to = "1" > </button>
				
			
			</div>
		
			<div class = "carousel-inner">
				<div class = "carousel-item active">
				
					<img alt="" src="../img/book.jpg">
				
				</div>
				
				<div class = "carousel-item">
				
					<img alt="" src="../img/강아지3.jpg">
				
				</div>
				
				<button type = "button" class = "carousel-control-prev" data-bs-target = "#cs" data-bs-slide = "prev">
					<span class = "carousel-control-prev-icon"> </span>
				</button>
				
				<button type = "button" class = "carousel-control-next" data-bs-target = "#cs" data-bs-slide = "next">
					<span class = "carousel-control-next-icon"></span>
				</button>
			</div>
		</div>
	
	</div>

</body>
</html>