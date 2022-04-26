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
							<li> <a href="#"> ���Ϲ�� </a></li>
							<li> <a href="#"> 1+1/�ڵ�Ʈ </a></li>
							<li> <a href="#"> �ƿ��� </a></li>
							<li> <a href="#"> ���� </a></li>
							<li> <a href="#"> ���� </a></li>
							<li> <a href="#"> ��Ʈ/����� </a></li>
							<li> <a href="#"> ���� </a></li>
							<li> <a href="#"> Ʈ���̴� </a></li>
							<li> <a href="#"> �Ź� </a></li>
							<li> <a href="#"> �Ǽ��縮 </a></li>
							<li> <a href="#"> ���� </a></li>
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
						�����͡�070-7710-4745 <br>
		
						īī��ä�� @�ƽ�<br>
						
						MON - FRI AM9 - PM4<br>
						
						(LUNCH TIME PM12:30 - PM13:30)<br>
						
						SAT, SUN, HOLIDAY CLOSE<br>
						
						�����ð��� ���Ǵ�<br>
						
						Q��A �Խ����� �̿��Ź�帳�ϴ�.<br>
						
						�츮���� 1005-504-072722<br>
						
						������ : (��)���������۴�
					</div>
					
				</div>
					
			</div>
			
		</div>
		
		<div class="col-md-10 offset-2 content" style="padding-left: 4.3%; padding-right: 2%;">
		
			<div class="login">
      
       			<fieldset>
					
					
           			<label class="id ePlaceholder" title="���̵�"><input id="member_id" name="member_id" fw-filter="isFill" fw-label="���̵�" fw-msg="" class="inputTypeText" placeholder="���̵�" value="" type="text"></label>
           			
            		<label class="password ePlaceholder" title="��й�ȣ"><input id="member_passwd" name="member_passwd" fw-filter="isFill&amp;isMin[4]&amp;isMax[16]" fw-label="�н�����" fw-msg="" autocomplete="off" value="" type="password" placeholder="��й�ȣ"></label>
            		
            		<div class="forgot">
                
	                	<input id="member_check_save_id0" name="check_save_id" fw-filter="" fw-label="���̵�����" fw-msg="" value="T" type="checkbox">
	                	<label for="member_check_save_id0" >���̵� ����</label>
	                	<img src="//img.echosting.cafe24.com/design/skin/default/member/ico_access.gif" alt="��������" /><span>l</span>      
	               		<a href="/member/id/find_id.html">���̵�ã��</a>      <span>l</span>      
	                	<a href="/member/passwd/find_passwd_info.html">��й�ȣã��</a>
                
            		</div>
            		
           			<a href="#none" class="btnLogin" onclick="MemberAction.login('member_form_6095965210'); return false;">LOGIN</a>
           
            
           			<ul class="snsArea">
           			
						<li class="">
                    		<a href="#none" onclick="MemberAction.snsLogin('naver', '%2Fmyshop%2Forder%2Flist.html')"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_naver_login.gif" alt="���̹� �α���"/></a>
              			</li>
              			
                		<li class="">
                    		<a href="#none" onclick="MemberAction.snsLogin('facebook', '%2Fmyshop%2Forder%2Flist.html')"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_facebook_login.gif" alt="Facebook���� �α���"/></a>
               			 </li>
               			 
                		<li class="displaynone">
                   		 	<a href="#none" onclick=""><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_google_login.gif" alt="���� �α���"/></a>
               			</li>
               			
                		<li class="">
                   			<a href="#none" onclick="MemberAction.snsLogin('kakao', '%2Fmyshop%2Forder%2Flist.html')"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_kakao_login.gif" alt="īī������ �α���"/></a>
              			</li>
              			
               			<li class="displaynone">
                    		<a href="#none" onclick=""><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_line_login.gif" alt="LINE �α���"/></a>
               			</li>
               			
                		<li class="">
                    		<a href="#none" onclick="MemberAction.snsLogin('apple', '%2Fmyshop%2Forder%2Flist.html')"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/member/btn_apple_login.gif" alt="Apple�� �α���"/></a>
               			</li>
            		</ul>
            		
					<div class="joinus">
            			<a href="/member/join.html"> <p> JOIN US </p> </a>
            		</div>
            
         
         
            		<p class="link displaynone" id="noMemberWrap">
                		<span style="color:#757575;">��ȸ���Ե� ��ǰ���Ű� �����ϳ� �پ��� ȸ�����ÿ��� ���ܵ˴ϴ�.</span>
                		<a href="/myshop/order/list.html" class="btnEm" onclick="">��ȸ������ �����ϱ�</a>
            		</p>
            		
        		</fieldset>
			</div>
		</div>

		<form id="historyNoLoginForm" name="" action="/exec/front/MyShop/OrderHistoryLogin/" method="POST" target="_self" enctype="multipart/form-data" >
			<input id="order_detail_url" name="order_detail_url" value="/myshop/order/list.html" type="hidden"  />
			<div class="xans-element- xans-myshop xans-myshop-orderhistorynologin ec-base-box typeThin ">
				<p>��ȸ���� ���, �ֹ����� �ֹ���ȣ�� �ֹ���ȸ�� �����մϴ�.</p>
				<dl class="ec-base-desc gBlank20">
					<dt>�ֹ��ڸ�</dt>
					<dd><input id="order_name" name="order_name" fw-filter="isFill" fw-label="�ֹ��ڸ�" fw-msg="" class="inputTypeText" placeholder="" value="" type="text"  /></dd>
	        		<dt>�ֹ���ȣ</dt>
					<dd><input id="order_id" name="order_id" maxlength="18" fw-filter="isOrderid&isFill" fw-label="�ֹ���ȣ" fw-msg="" value="" type="text"  /></dd>
	        		<dt>��ȸ���ֹ� ��й�ȣ</dt>
					<dd><input id="order_password" name="order_password" fw-filter="isFill" fw-label="��ȸ���ֹ� ��й�ȣ" fw-msg="" value="" type="password"  /></dd>
	    		</dl>
				<p class="ec-base-button gColumn"><button type="submit" class="btnNormal sizeM">��ȸ�� �α���</button></p>
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
										<p class="cskakao"><a href="https://pf.kakao.com/_LKGMd" target="_blank">īī��ä�� : @�ƽ�</a></p>
										<p class="f-sinfo">MON - FRI AM9 - PM4</p>
										<p class="f-sinfo">(LUNCH TIME PM12:30 - PM13:30)</p>
										<p class="f-sinfo">SAT, SUN, HOLIDAY CLOSE</p>
										<p class="f-sinfo" style="color:#757575;">�����ð��� ���Ǵ�</p>
										<p class="f-sinfo" style="color:#757575;">Q��A �Խ����� �̿��Ź�帳�ϴ�.</p>
									</div>
										
									<div class="f-bank">
										<p class="f-title">B A N K    A C C O U N T .</p>
										<p class="f-sinfo">�츮���� 1005-504-072722</p>
										<p class="f-sinfo">������ : (��)���������۴�</p>
									</div>
								</li>
								
								<li style="width: 52%">
									<div class="f-company">
										<p class="f-title">C O M P A N Y&nbsp;&nbsp;&nbsp;&nbsp;I N F O .</p>
						                <p class="companyinfo">
						                    <span>COMPANY : (��)���������۴� </span> <span>CEO : ���簩</span> <span>TEL : 070-7710-4745</span><br/><span>BUSINESS NUMBER : 693-81-01950 / 2021-����ϳ�-0552</span> <span><a href="#none" onclick="window.open('http://www.ftc.go.kr/bizCommPop.do?wrkr_no=6938101950', 'bizCommPop', 'width=750, height=950;');return false;">[���������Ȯ��]</a></span> <br/><span>ADDRESS : 13024 ��⵵ �ϳ��� �ϳ���� 506 (�ϻ�) 2��</span> <br/><span class="">ADMIN : ��̿� (youandme3800@naver.com)</span> <span>HOSTING : (��)CAFE24</span><br/><span>�¶��� ���ڻ�ŷ� ���� ���� <a href="https://nims.ksnet.co.kr/pg_infoc/src/dealinfo/pg_shop_info.jsp?shop_id=2005803649" target="_blank">[���񽺰��Ի��Ȯ��]</a></span><br/><br/><span style="font-weight:bold;">��ǰ�ּ� / CJ�������(1588-1255)</span><br/><span>CJ������� ��ǰ�ּ� : �����ȣ 05839) ����� ���ı� ��η�52 CJ������� ��������븮��</span><br/><span>Ÿ�ù��̿� ��ǰ�ּ� : �����ȣ 12729) ��⵵ ���ֽ� �ʿ��� ����� 625-12 A�� 3��</span><br/><span>��Ÿ�ù� �̿�� �����ù�,�Ե��ù�Ұ�(�ݼ۵ɼ� �ֽ��ϴ�)��</span><br/><br/><span class="copyright">Copyright  <strong>(��)���������۴�</strong>. All rights reserved. <a href="https://uuniq00.cafe24.com/" target="_blank">by uuniq.</a></span>
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