<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	
	

</head>
<body>

	<%@include file = "header.jsp" %>
	
	<br><br><br><br>
	
	<div id="cs" class="carousel carousel-dark slide text-center" data-bs-ride="carousel" data-bs-interval="3000">
	
		<div class="carousel-indicators">
		
			<button data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
			<button data-bs-target="#cs" data-bs-slide-to="1"></button>
			<button data-bs-target="#cs" data-bs-slide-to="2"></button>
			<button data-bs-target="#cs" data-bs-slide-to="3"></button> 
		
		</div>
	
		<div class="carousel-inner">
		
			<div class="carousel-item active"> <img alt="" src="img/carousel1.jpg"> </div>
			<div class="carousel-item"> <img alt="" src="img/carousel2.jpg"> </div>
			<div class="carousel-item"> <img alt="" src="img/carousel3.jpg"> </div>
			<div class="carousel-item"> <img alt="" src="img/carousel4.jpg"> </div>
		
		</div>
		
		<button class= "carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</button>
		
		<button class= "carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
			<span class="carousel-control-next-icon"></span>
		</button>
	
		
	
	</div>
	
	<div class="container text-center">
		<hr>
			<h3> New ARRIVAL</h3>
			<p> 신상품 </p>
	</div>
	
	<div class="container">
		<div class="row">
			<% for(int i = 0; i < 8; i++){ %>
				<div class="col-md-3">
					<div class="card">
						<img class="card-img-top" alt="" src="img/content1.webp">
						<div class="card-body">
							<p class="item">
								<span class="title"> LIVIN' LARGE TEE </span> 
								<br>
								<span class="content">PRODUCT DETAILS<br>
								- Screenprinted graphics<br>
								- Ribbed collar
								100% Cotton
								Imported
								</span>
								<br>
								<span class="price"> $40.00 </span> &nbsp;-> $38.00
								<br>
								<span class="badge bg-warning text-dark my-3">SIZE CHART</span>
								<span class="badge bg-danger text-dark my-3">MORE TEES</span>
						</div>
					</div>
				</div>
			<% } %>
		</div>
	</div>
	
	<%@include file = "footer.jsp" %>

</body>
</html>