<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

	<link href="/jspweb/css/signup.css" rel = "stylesheet">

</head>
<body>

	<%@include file = "../header.jsp" %>
	
	
	
	<div class="container">
	
		<div class="row">
		
			<div class="col-md-offset-2 col-md-8 text-center" style="float: none; margin:0 auto;">
				<div class="wrap" style="float: none; margin:0 auto;">
					<div class="form">
					
						<h2 class="title"> 회원 페이지 </h2>
						
						<p class="notice"> 인증 필요 </p>
						
						<div class="join">
							<form id = "signupform" action="../signup" method="post">
								<table>
								
									<colgroup>
										<col width="30%"/>
										<col width="auto"/>
									</colgroup>
									
									<tbody>
									
										<tr>
											<th><span>아이디</span></th>
											<td>
												<input type="text" id="mid" placeholder="user id" name="mid">
											</td>
											<td>
												<input type="button" value="확인" onclick="id_duplicate_chk()" style="margin-left: 10px;">
											</td>
										</tr>
										
										<tr>
											<th><span>이름</span></th>
											<td><input type="text" id="mname" placeholder="user name" name="mname"></td>
										</tr>
										
										<tr>
											<td><span></span></td>
											<td><span id = "namechk"></span></td>
										</tr>
										
										<tr>
											<th><span>비밀번호</span></th>
											<td><input type="password" id="mpassword" placeholder="user password" name="mpassword"></td>
										</tr>
										
										<tr>
											<th><span>비밀번호 확인</span> </th>
											<td><input type="password" id="mpasswordchk" placeholder="password check"></td>
											
										</tr>
										
										<tr>
											<th> </th>
											<td> <span id = "passwordchk"></span> </td>
										</tr>
										
										<tr class="email">
											<th><span>이메일</span>
											<td>
												<input type="text" id="memail" placeholder="user email" name="memail" class="email">
												
												
											
												
											</td>
											
											<td>
												<span class="at" style="margin-left: 22px;">@</span>
											</td>
											
											<td>
												<input type="text" id="memailaddress" name="memailaddress" class="email email2">
											</td>
											
											<td>
												<select id = "emailselect" style="margin-left: 10px;">
													<option value=""> 직접입력 </option>
													<option value="naver.com"> naver.com </option>
													<option value="gmail.com"> gmail.com </option>
													<option value="kakao.com"> kakao.com </option>
												</select>
											</td>
											
										</tr>
										
										<tr>
											<td><span></span></td>
											<td><span id = "emailchk"></span></td>
										</tr>
										
										<tr>
											<th><span>휴대폰번호</span></th>
											<td><input type="text" id="mphone" placeholder="user phone" name="mphone"></td>
										</tr>
										
										<tr>
											<td><span></span></td>
											<td><span id = "phonechk"></span></td>
										</tr>
										
										<tr>
											<th><span>주소</span></th>
											<td>					
												<input type="text" id="maddress1" placeholder="우편번호" name="maddress1">
												<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
												<input type="text" id="maddress2" placeholder="도로명주소" name="maddress2">
												<input type="text" id="maddress3" placeholder="지번주소" name="maddress3">
												<span id="guide" style="color:#999;display:none"></span>
												<input type="text" id="maddress4" placeholder="상세주소" name="maddress4">
											</td>
										</tr>
										
										<tr>
											<td><span></span></td>
											<td><span id = "addresschk"></span></td>
										</tr>
										
									</tbody>
								</table>
								<div class="exform_txt">
									<span>표시는 필수 입력 사항</span>
								</div>
							</form>
						</div>
						<div class="agree_wrap">
		        		    <div class="checkbox_wrap">
		           			   <input type="checkbox" id="news_letter" name="news_letter" class="agree_chk">
		           			   <label for="news_letter">[선택]뉴스레터 수신동의</label>
		         		  	</div>
		           			<div class="checkbox_wrap mar27">
		              			<input type="checkbox" id="marketing" name="marketing" class="agree_chk">
		              			<label for="marketing">[선택]마케팅 목적 개인정보 수집 및 이용에 대한 동의</label>
		              			<ul class="explan_txt">
		                			<li><span class="red_txt">항목 : 성별, 생년월일</span></li>
		                			<li>고객님께서는 위의 개인정보 및 회원정보 수정 등을 통해 추가로 수집하는 개인정보에<br/>
		                  				대해 동의하지 않거나 개인정보를 기재하지 않음으로써 거부하실 수 있습니다.<br/>
		                  				다만 이때 회원 대상 서비스가 제한될 수 있습니다.
		                			</li>
		             			</ul>
		            		</div>
		          		</div>
		          		<button onclick="signup()" type="button">가입하기</button>
					</div>
	
				</div>
			</div>
	
		</div>
	</div>

	<script src="../js/signup.js" type="text/javascript"></script>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	
	<%@include file = "../footer.jsp" %>

</body>
</html> 