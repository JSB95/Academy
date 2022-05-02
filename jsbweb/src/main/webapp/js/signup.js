// jQuery
$(function(){
	$("#mid").keyup(function(){
		// 1. HTML 태그내 값 가져오기 
		let mid=document.getElementById("mid").value;
		// 2. HTML 태그id 가져오기
		let idcheck = document.getElementById("idchk")
		
		let idj = /^[a-zA-Z0-9]{5,15}$/; // 한글을 제외한 영문 + 숫자 5~15글자 내
		
		if (idj.test(mid)){
			// idcheck.innerHTML = "영문, 숫자 포함 5~15글자를 입력해주세요";
			$.ajax({
				url : "http://192.168.17.24:8080/jspweb/src/main/java/controller/idcheck.java",
				data : {"mid" : mid},
				success : function(result){
					alert("통신 성공");
				}
			});
			
		} else {
			idcheck.innerHTML = "영문, 숫자 포함 5~15글자를 입력해주세요";
		}
	});
	
	$("#mpassword").keyup(function(){
		
		// let mpassword = document.getElementById("mpassword").value;
		let mpassword = $("#mpassword").val();
		let mpasswordchk = $("#mpasswordchk").val();
		let passwordj = /^[a-zA-Z0-9]{5,15}$/;
		
		if (passwordj.test(mpassword)){
			if (mpassword != mpasswordchk){
				$("#passwordchk").html("패스워드가 서로 다릅니다.");
			} else {
				$("#passwordchk").html("사용 가능한 비밀번호 입니다.");
			}
		} else {
			$("#passwordchk").html("영문, 숫자 포함 5~15글자를 입력해주세요");
		}
		
	});
	
	$("#mpasswordchk").keyup(function(){
		
		// let mpassword = document.getElementById("mpassword").value;
		let mpassword = $("#mpassword").val();
		let mpasswordchk = $("#mpasswordchk").val();
		let passwordj = /^[a-zA-Z0-9]{5,15}$/;
		
		if (passwordj.test(mpassword)){
			if (mpassword != mpasswordchk){
				$("#passwordchk").html("패스워드가 서로 다릅니다.");
			} else {
				$("#passwordchk").html("사용 가능한 비밀번호 입니다.");
			}
		} else {
			$("#passwordchk").html("영문, 숫자 포함 5~15글자를 입력해주세요");
		}
		
	});
	
	$("#mname").keyup(function(){
		
		let mname = $("#mname").val();
		let namej = /^[가-힣]{2,10}$/;
		if(namej.test(mname)){
			$("#namechk").html("사용 가능한 이름입니다.");
		} else {
			$("#namechk").html("2~10글자 사이 한글로만 입력해주세요.");
		}
		
	})
	
	$("#mphone").keyup(function(){
		
		let mphone = $("#mphone").val();
		let phonej = /^010-([0-9]{4})-([0-9]{4})$/;
		
		if(phonej.test(mphone)){
			$("#phonechk").html("사용 가능한 전화번호입니다.");
		} else {
			$("#phonechk").html("올바르지 않은 전화번호입니다.");
		}
		
	})

})

function sample4_execDaumPostcode() {
	new daum.Postcode({
    	oncomplete: function(data) {
			// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
			// 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }
            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById("maddress1").value = data.zonecode;
            document.getElementById("maddress2").value = roadAddr;
            document.getElementById("maddress3").value = data.jibunAddress;
                
            // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
            if(roadAddr !== ''){
                document.getElementById("maddress5").value = extraRoadAddr;
            } else {
                document.getElementById("maddress5").value = '';
            }

            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            if(data.autoRoadAddress) {
	            var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
    	        guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';

            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}