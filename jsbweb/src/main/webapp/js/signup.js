function signup(){
	// 1. HTML 태그내 값 가져오기 
	let mid=document.getElementById("mid").value;
	// 2. HTML 태그id 가져오기
	let idcheck = document.getElementById("idcheck")
	
	let idj = /^[a-zA-Z0-9]{5,15}$/; // 한글을 제외한 영문 + 숫자 5~15글자 내
	
	if (!idj.test(mid)){
		idcheck.innerHTML = "소문자를 입력해주세요";
	} else {
		idcheck.innerHTML = "가능한 아이디 입니다"
	}
} 