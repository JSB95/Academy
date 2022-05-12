function categorybtn(){
	$("#categoryinput").html(
		'<input type="text" id="cname">' +
		'<button onclick="categoryadd()" type="button">등록</button>'
	)
}

function categoryadd(){
	let cname = $("#cname").val();
	$.ajax({
		url : "categoryadd",
		data : {"cname" : cname},
		success : function(result){
			if (result == 1){
				alert("카테고리 추가");
				$("#categoryinput").html("");
			} else {
				console.log(cname);
			}
		}
	});
}

$(function getcategory(){
	$.ajax({
		url : "getcategory",
		success : function(re){
			$("#categorybox").html(re);
		}
	});
});

function productadd(){
	
	var form = $("#productaddform")[0];
	var formData = new FormData(form);
	
		
	$.ajax({
		url : "productadd",
		type : 'POST',
		data : formData,
		contentType : false,
		processData : false,
		success : function(result){
			
			form.reset();
			if (result == 1){
				alert("등록 성공");
				form.reset();
			} else {
				alert("등록 실패")
			}
		}
	});
}