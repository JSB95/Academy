<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "header.jsp"%>
		
	<div class="col-md-offset1 col-md-10" style="margin: 0 auto;">
		<div id="cs" class="carousel slide container" data-bs-ride="carousel" data-bs-interval="5000">
			<div class="carousel-indicators">
				<button data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
				<button data-bs-target="#cs" data-bs-slide-to="1"></button>
				<button data-bs-target="#cs" data-bs-slide-to="2"></button>
				<button data-bs-target="#cs" data-bs-slide-to="3"></button>
			</div>
			
			<div class="carousel-inner">
				<div class="carousel-item active"> <img alt="" src="img/mainimg1.jpg"></div>
				<div class="carousel-item"> <img alt="" src="img/mainimg2.jpg"></div>
				<div class="carousel-item"> <img alt="" src="img/mainimg3.jpg"></div>
				<div class="carousel-item"> <img alt="" src="img/mainimg4.jpg"></div>
			</div>
			
			<button class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</button>
			
			<button class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
				<span class="carousel-control-next-icon"></span>
			</button>
		</div>
	</div>
	
	<br>
	
	<div class="row">
		<div class="col-md-offset-1 col-md-4" style="margin: 0 auto;"> <img alt="" src="img/mainimg1.jpg" class="img-fluid" style="padding-left: 10px;"> </div>
		<div class="col-md-offset-2 col-md-4" style="margin: 0 auto;"> <img alt="" src="img/mainimg1.jpg" class="img-fluid" style="padding-right: 10px;"> </div>
	</div>
		
		
	<%@include file = "footer.jsp"%>
	
	

</body>
</html>