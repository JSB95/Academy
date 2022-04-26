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
		
			<div class="login">
      
       			<fieldset>
					
					
           			<label class="id ePlaceholder" title="아이디"><input id="member_id" name="member_id" fw-filter="isFill" fw-label="아이디" fw-msg="" class="inputTypeText" placeholder="아이디" value="" type="text"></label>
           			
            		<label class="password ePlaceholder" title="비밀번호"><input id="member_passwd" name="member_passwd" fw-filter="isFill&amp;isMin[4]&amp;isMax[16]" fw-label="패스워드" fw-msg="" autocomplete="off" value="" type="password" placeholder="비밀번호"></label>
            		
            		<div class="forgot">
                
	                	<input id="member_check_save_id0" name="check_save_id" fw-filter="" fw-label="아이디저장" fw-msg="" value="T" type="checkbox">
	                	<label for="member_check_save_id0" >아이디 저장</label>
	                	<img src="//img.echosting.cafe24.com/design/skin/default/member/ico_access.gif" alt="보안접속" /><span>l</span>      
	               		<a href="/member/id/find_id.html">아이디찾기</a>      <span>l</span>      
	                	<a href="/member/passwd/find_passwd_info.html">비밀번호찾기</a>
                
            		</div>
            		
           			<a href="#none" class="btnLogin" onclick="MemberAction.login('member_form_6095965210'); return false;">LOGIN</a>
           
            
           			<ul class="snsArea">
           			
						<li class="">
                    		<a href="#none" onclick="MemberAction.snsLogin('naver', '%2Fmyshop%2Forder%2Flist.html')"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_naver_login.gif" alt="네이버 로그인"/></a>
              			</li>
              			
                		<li class="">
                    		<a href="#none" onclick="MemberAction.snsLogin('facebook', '%2Fmyshop%2Forder%2Flist.html')"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_facebook_login.gif" alt="Facebook으로 로그인"/></a>
               			 </li>
               			 
                		<li class="displaynone">
                   		 	<a href="#none" onclick=""><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_google_login.gif" alt="구글 로그인"/></a>
               			</li>
               			
                		<li class="">
                   			<a href="#none" onclick="MemberAction.snsLogin('kakao', '%2Fmyshop%2Forder%2Flist.html')"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_kakao_login.gif" alt="카카오계정 로그인"/></a>
              			</li>
              			
               			<li class="displaynone">
                    		<a href="#none" onclick=""><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_line_login.gif" alt="LINE 로그인"/></a>
               			</li>
               			
                		<li class="">
                    		<a href="#none" onclick="MemberAction.snsLogin('apple', '%2Fmyshop%2Forder%2Flist.html')"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_apple_login.gif" alt="Apple로 로그인"/></a>
               			</li>
            		</ul>
            		
					<div class="joinus">
            			<a href="/member/join.html"> <p> JOIN US </p> </a>
            		</div>
            
         
         
            		<p class="link displaynone" id="noMemberWrap">
                		<span style="color:#757575;">비회원님도 상품구매가 가능하나 다양한 회원혜택에서 제외됩니다.</span>
                		<a href="/myshop/order/list.html" class="btnEm" onclick="">비회원으로 구매하기</a>
            		</p>
            		
        		</fieldset>
			</div>
		</div>

		<form id="historyNoLoginForm" name="" action="/exec/front/MyShop/OrderHistoryLogin/" method="POST" target="_self" enctype="multipart/form-data" >
			<input id="order_detail_url" name="order_detail_url" value="/myshop/order/list.html" type="hidden"  />
			<div class="xans-element- xans-myshop xans-myshop-orderhistorynologin ec-base-box typeThin ">
				<p>비회원의 경우, 주문시의 주문번호로 주문조회가 가능합니다.</p>
				<dl class="ec-base-desc gBlank20">
					<dt>주문자명</dt>
					<dd><input id="order_name" name="order_name" fw-filter="isFill" fw-label="주문자명" fw-msg="" class="inputTypeText" placeholder="" value="" type="text"  /></dd>
	        		<dt>주문번호</dt>
					<dd><input id="order_id" name="order_id" maxlength="18" fw-filter="isOrderid&isFill" fw-label="주문번호" fw-msg="" value="" type="text"  /></dd>
	        		<dt>비회원주문 비밀번호</dt>
					<dd><input id="order_password" name="order_password" fw-filter="isFill" fw-label="비회원주문 비밀번호" fw-msg="" value="" type="password"  /></dd>
	    		</dl>
				<p class="ec-base-button gColumn"><button type="submit" class="btnNormal sizeM">비회원 로그인</button></p>
			</div>
		</form>     
			
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