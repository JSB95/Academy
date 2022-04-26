<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="index.css" rel="stylesheet">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	
</head>
<body>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

	<div class="col-md-10 offset-2 fixed-top pb-1 pt-5 px-5">
		<div class="col-md-7 offset-5 d-flex justify-content-end">
			
			<ul class="nav">
				<li class="tophead"> <a href="login.jsp"> LOGIN </a>
				<li class="tophead"> <a href="login.jsp"> JOIN </a>
				<li class="tophead"> <a href="login.jsp"> CART </a>
				<li class="tophead"> <a href="login.jsp"> MY PAGE </a>
				<li class="tophead"> <a href="login.jsp"> SNS </a>
				<li class="tophead"> <a href="login.jsp"> BOOKMARK </a>
			</ul>
			
		</div>
	</div>
	
	
	<div class="row" style="margin: 27px auto 0; position: relative; width: 100%;">
	
		<div class="col-md-2 sidemenu">
		
			<div>

				<div>
					<div>
						<ul>
							<li id="logoli"> <a href="#" id="logo"> HUNS </a></li>
							<li> <a href="#"> BEST </a></li>
							<li> <a href="#"> NEW </a></li>
							<li> <a href="#"> 당일배송 </a></li>
							<li> <a href="#"> 1+1/코디세트 </a></li>
							<li> <a href="#"> 아우터 </a></li>
							<li> <a href="#"> 상의 </a></li>
							<li> <a href="#"> 셔츠 </a></li>
							<li> <a href="#"> 니트/가디건 </a></li>
							<li> <a href="#"> 팬츠 </a></li>
							<li> <a href="#"> 트레이닝 </a></li>
							<li> <a href="#"> 신발 </a></li>
							<li> <a href="#"> 악세사리 </a></li>
							<li> <a href="#"> 세일 </a></li>
						</ul>
					</div>
				</div>
				
				
				
				<div>
					<ul>
						<li> <a href="#"> NOTICE </a></li>
						<li> <a href="#"> Q & A </a></li>
						<li> <a href="#"> REVIEW </a></li>
						<li> <a href="#"> EVENT </a></li>
					</ul>
				</div>
				<div style="padding-left: 32px">
				
					<div>
						<input type="text"> <i class="fas fa-search"></i>
					</div>
					
					<div style="font-size: 11px;">
						<br><br><br>
						고객센터　070-7710-4745 <br>
		
						카카오채널 @훈스<br>
						
						MON - FRI AM9 - PM4<br>
						
						(LUNCH TIME PM12:30 - PM13:30)<br>
						
						SAT, SUN, HOLIDAY CLOSE<br>
						
						업무시간외 문의는<br>
						
						Q＆A 게시판을 이용부탁드립니다.<br>
						
						우리은행 1005-504-072722<br>
						
						예금주 : (주)유엔미컴퍼니
					</div>
					
				</div>
					
			</div>
			
		</div>
		
		<div class="col-md-10 offset-2 content" style="padding-left: 4.3%; padding-right: 2%;">
		
			<div id="cs" class="carousel carousel-dark slide text-center" data-bs-ride="carousel" data-bs-interval="3000" style="padding-bottom: 15px; width: 100%">
	
				<div class="carousel-indicators">
		
					<button data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
					<button data-bs-target="#cs" data-bs-slide-to="1"></button>
					<button data-bs-target="#cs" data-bs-slide-to="2"></button>

		
				</div>
	
				<div class="carousel-inner">
		
					<div class="carousel-item active"> <img alt="" src="img/carousel1.jpg"> </div>
					<div class="carousel-item"> <img alt="" src="img/carousel2.jpg"> </div>
					<div class="carousel-item"> <img alt="" src="img/carousel3.jpg"> </div>
					
		
				</div>
		
					<button class= "carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
						<span class="carousel-control-prev-icon"></span>
					</button>
					
					<button class= "carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
						<span class="carousel-control-next-icon"></span>
					</button>
	
				</div> <!-- 캐러셀 end -->
			
			<div> 
			
				<div class="item_main"> <!-- item -->
					<div class="best">
					
						<p style="text-align: center; font-size: 20px;"><span> <Strong>BEST SELLER</Strong></span></p>
						<p style="text-align: center; font-size: 13px;">#베스트셀러</p>
						
					
					</div>
				
					<div class="row">
					
						<div class="col-md-4">
							<div class="card">
								<img class="car-img-top" alt="" src="img/item1.jpg">
								<div class="card-body" style="border-bottom: solid 1px #eeeeee">
									<p class="item">
										<span class="title"> [1+1+1]아이스 쿨링 반팔티</span>
								</div>
								<span class="price"> 22,900원 </span>
							</div>
						</div>
						
						<div class="col-md-4">
							<div class="card">
								<img class="car-img-top" alt="" src="img/item2.webp">
								<div class="card-body" style="border-bottom: solid 1px #eeeeee">
									<p class="item">
										<span class="title"> [1+1]플레인와이드 밴딩 팬츠</span>
								</div>
								<span class="price">29,800원 </span>
							</div>
						</div>
						
						<div class="col-md-4">
							<div class="card">
								<img class="car-img-top" alt="" src="img/item3.webp">
								<div class="card-body" style="border-bottom: solid 1px #eeeeee">
									<p class="item">
										<span class="title"> [1+1]롱&숏 맞춤 레이어드 반팔티</span>
								</div>
								<span class="price"> 23,900원 </span>
							</div>
						</div>
						
						<div class="col-md-4">
							<div class="card">
								<img class="car-img-top" alt="" src="img/item4.jpg">
								<div class="card-body" style="border-bottom: solid 1px #eeeeee">
									<p class="item">
										<span class="title"> [4 type] 퍼펙트핏 슬랙스(기본/뒷밴딩)</span>
								</div>
								<span class="price"> 33,000원 </span>
							</div>
						</div>
						
						<div class="col-md-4">	
							<div class="card">
								<img class="car-img-top" alt="" src="img/item5.jpg">
								<div class="card-body" style="border-bottom: solid 1px #eeeeee">
									<p class="item">
										<span class="title"> [1+1+1]링클 분또 보트넥 긴팔티</span>
								</div>
								<span class="price"> 29,800원 </span>
							</div>
						</div>
						
						<div class="col-md-4">
							<div class="card">
								<img class="car-img-top" alt="" src="img/item6.webp">
								<div class="card-body" style="border-bottom: solid 1px #eeeeee">
									<p class="item">
										<span class="title"> [1+1]캔디 바이오 고밀도 셔츠</span>
								</div>
								<span class="price"> 24,900원 </span>
							</div>
						</div>
				
					</div>
				</div>
			</div>
			
			<div id ="insta" style="border-bottom: solid 1px #eeeeee">
				<div class="insta-t">
					<p style="font-size: 23px; color: #2e2e2e; font-weight: bold; text-align: center;">INSTAGRAM</p>
					<p class="t-info">@hunsgram</p>
					<p> </p>
				</div>
			</div>
			

			<div id="footer"> <!-- footer --> 
				<div class="f-inner">
					<div class="f-layout">
					
						<div id="f-icon">
							<img alt="" src="https://huns.co.kr/web/upload/fla/f_insta.png">
						</div>
						
						<div id="f-info" style="margin-top: 70px;">
						
							
							
							<ul>
								<li style="width: 19%"> 
									<div class="f-company">
										<p class="f-title"> S H O P &nbsp;&nbsp;&nbsp;&nbsp; I N F O.</p>
										<p class="sinfo"> <a href = "#"> ABOUT US</a> </p>
										<p class="sinfo"> <a href = "#"> AGREEMENT</a> </p>
										<p class="sinfo"> <a href = "#"> PRIVACY POLICY </a> </p>
										<p class="sinfo"> <a href = "#"> SHOPPING GUIDE </a> </p>
									</div>
								</li>
								
								<li style="width: 27%">
									<div class="f-cs">
										<p class="f-title"> C U S T O M E R &nbsp;&nbsp;&nbsp;&nbsp;C E N T E R. </p>
										<p class="csnumber">070-7710-4745</p>
										<p class="cskakao"><a href="https://pf.kakao.com/_LKGMd" target="_blank">카카오채널 : @훈스</a></p>
										<p class="f-sinfo">MON - FRI AM9 - PM4</p>
										<p class="f-sinfo">(LUNCH TIME PM12:30 - PM13:30)</p>
										<p class="f-sinfo">SAT, SUN, HOLIDAY CLOSE</p>
										<p class="f-sinfo" style="color:#757575;">업무시간외 문의는</p>
										<p class="f-sinfo" style="color:#757575;">Q＆A 게시판을 이용부탁드립니다.</p>
									</div>
										
									<div class="f-bank">
										<p class="f-title">B A N K    A C C O U N T .</p>
										<p class="f-sinfo">우리은행 1005-504-072722</p>
										<p class="f-sinfo">예금주 : (주)유엔미컴퍼니</p>
									</div>
								</li>
								
								<li style="width: 52%">
									<div class="f-company">
										<p class="f-title">C O M P A N Y&nbsp;&nbsp;&nbsp;&nbsp;I N F O .</p>
						                <p class="companyinfo">
						                    <span>COMPANY : (주)유엔미컴퍼니 </span> <span>CEO : 유재갑</span> <span>TEL : 070-7710-4745</span><br/><span>BUSINESS NUMBER : 693-81-01950 / 2021-경기하남-0552</span> <span><a href="#none" onclick="window.open('http://www.ftc.go.kr/bizCommPop.do?wrkr_no=6938101950', 'bizCommPop', 'width=750, height=950;');return false;">[사업자정보확인]</a></span> <br/><span>ADDRESS : 13024 경기도 하남시 하남대로 506 (하산곡동) 2층</span> <br/><span class="">ADMIN : 김미연 (youandme3800@naver.com)</span> <span>HOSTING : (주)CAFE24</span><br/><span>온라인 전자상거래 안전 서비스 <a href="https://nims.ksnet.co.kr/pg_infoc/src/dealinfo/pg_shop_info.jsp?shop_id=2005803649" target="_blank">[서비스가입사실확인]</a></span><br/><br/><span style="font-weight:bold;">반품주소 / CJ대한통운(1588-1255)</span><br/><span>CJ대한통운 반품주소 : 우편번호 05839) 서울시 송파구 충민로52 CJ대한통운 잠실유정대리점</span><br/><span>타택배이용 반품주소 : 우편번호 12729) 경기도 광주시 초월읍 산수로 625-12 A동 3층</span><br/><span>※타택배 이용시 로젠택배,롯데택배불가(반송될수 있습니다)※</span><br/><br/><span class="copyright">Copyright  <strong>(주)유엔미컴퍼니</strong>. All rights reserved. <a href="https://uuniq00.cafe24.com/" target="_blank">by uuniq.</a></span>
						                    </p>
									</div>
								</li>
		
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>