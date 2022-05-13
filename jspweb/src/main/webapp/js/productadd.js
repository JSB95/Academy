function categorybtn(){
	$("#categoryinput").html(
		'<div class="row">' +
			'<div class="col-md-5">' +
			'</div>' +
				'<input class="form-control" type="text" id="cname">' +
				'<button class="form-control" onclick="categoryadd()" type="button">등록</button>' +
			'<div class="col-md-5">' +
			'</div>' +
		'</div>'
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



$("#pimg").change(function (e){
	let reader = new FileReader();
	reader.readAsDataURL(e.target.files[0]);
	reader.onload = function (e){
		$("#preview").attr("src",e.target.result);
	}
});