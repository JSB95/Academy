$(document).ready(function() { 
		
	$("#secret").change(function(){
		if($("#secret").is(":checked")){
			$("#secret_pw").html(
			'<input type="password" class="form-control" placeholder="비밀번호 입력" id="board_password">'
			)
		} else {
			$("#secret_pw").html(
			''
			)
		}
	});
});

function setThumbnail(event) { 
	var reader = new FileReader(); 
	reader.onload = function(event) { 
		var img = document.createElement("img"); 
		img.setAttribute("src", event.target.result); 
		document.querySelector("div#image_container").appendChild(img); 
	}; 
		reader.readAsDataURL(event.target.files[0]); 
}

function boardwrite(){
	alert("로그인을 해주세요");
	location.href='boardwrite.jsp';
}

function write(){

	alert("제목 입력");

}

