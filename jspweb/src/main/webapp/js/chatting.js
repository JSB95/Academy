function cwrite(){
	
	let cname = $("#cname").val();
	let ccontent = $("#ccontent").val();
	
	$.ajax({
		url: "cwrite",
		data: {"cname" : cname, "ccontent" : ccontent},
		success : function(result){
			if (result == 1) {
				$("#contents").load(location.href + " #contents");
			} else {
				alert("채팅 입력 실패")
			}
		}
	});
	
}

$(function(){
	timer = setInterval(function(){
		$.ajax({
			url : "chattingview",
			cache : false,
			success : function(result){
				var co = result.split("_");
				var contents = "";
				
				for (var i = 0; i < co.length-1; i++){
					contents += 
					 '<div class="box"  style="text-align: right;">'+
						'<div class="nicname">닉네임 : '+co[i].split(",")[0]+'</div>'+
						'<span class="content">내용 :'+co[i].split(",")[1]+'</span>'+
					'</div><br>'
				}
				$("#contents").html(contents);
				$("#contetns").scrollTop($('#contents')[0].scrollHeight);
			}
		});
	}, 1500);
});