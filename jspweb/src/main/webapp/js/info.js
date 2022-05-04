function passwordchk(mid){
	let mpassword = $("#mpassword").val();
	
	$.ajax({
		url: "../passwordchk",
		data:{"mid" : mid, "mpassword" : mpassword},
		type : "POST",
		success : function(result){
			if (result == 1){
				$("#checkmsg").html("정말 탈퇴하시겠습니까?");
				$("#mpassword").css("display", "none");
				$("#btndelete").css("display", "block");
			} else {
				$("#checkmsg").html("비밀번호가 일치하지 않습니다.");


			}
			
		}
	});
}

function mdelete(mid){
	$.ajax({
		url : "../delete",
		data : {"mid" : mid},
		success : function(result){
			if (result == 1){
				alert("회원탈퇴가 완료되었습니다.");
			//	window.location.href="/jspweb/logout";
			//	window.location.assign("/jspweb/logout");
				window.location.replace("/jspweb/logout");
			} else {
				location.href="/jspweb/error.jsp";
			}
		}
	});
}